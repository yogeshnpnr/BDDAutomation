package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage {
    AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void skipLogin() {
        driver.findElement(By.id("com.flipkart.android:id/custom_back_icon")).click();
    }
}
