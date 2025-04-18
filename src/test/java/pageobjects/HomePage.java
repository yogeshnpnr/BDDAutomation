package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage {
    AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void searchForProduct(String product) {
        driver.findElement(By.id("com.flipkart.android:id/search_widget_textbox")).click();
        driver.findElement(By.id("com.flipkart.android:id/search_autoCompleteTextView")).sendKeys(product + "\n");
    }
}
