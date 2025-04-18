package utils;

import io.appium.java_client.android.AndroidDriver;
import org.json.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class DriverManager {
    private static AndroidDriver driver;

    public static void initializeDriver() throws Exception {
        // Load env.json
        String jsonPath = "env.json";
        FileInputStream fis = new FileInputStream(jsonPath);
        byte[] data = fis.readAllBytes();
        String content = new String(data, StandardCharsets.UTF_8);
        JSONObject env = new JSONObject(content);

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", env.getString("platformName"));
        caps.setCapability("platformVersion", env.getString("platformVersion"));
        caps.setCapability("deviceName", env.getString("deviceName"));
        caps.setCapability("automationName", env.getString("automationName"));
        caps.setCapability("appPackage", env.getString("appPackage"));
        caps.setCapability("appActivity", env.getString("appActivity"));

        driver = new AndroidDriver(new URL(env.getString("serverURL")), caps);
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
