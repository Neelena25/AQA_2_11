package Practice_Project_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getOnlineRechargeBlock() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Онлайн пополнение ') and contains(text(),'без комиссии')]")));
    }

    public boolean isVisaLogoDisplayed() {
        return driver.findElement(By.cssSelector("img[src*='visa']")).isDisplayed();
    }

    public boolean isMasterCardLogoDisplayed() {
        return driver.findElement(By.cssSelector("img[src*='mastercard']")).isDisplayed();
    }

    public PaymentPage clickDetailsLink() {
        WebElement detailsLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        detailsLink.click();
        return new PaymentPage(driver);
    }
}
