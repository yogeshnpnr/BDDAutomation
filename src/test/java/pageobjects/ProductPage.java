package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProductPage {
    AndroidDriver driver;

    public ProductPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void selectFirstProduct() {
        driver.findElements(By.className("android.widget.RelativeLayout")).get(0).click();
    }

    public void addToCart() {
        driver.findElement(By.xpath("//android.widget.TextView[@text='Add to cart']")).click();
    }

    public boolean verifyCartUpdate() {
        return driver.getPageSource().contains("Place Order");
    }
}
