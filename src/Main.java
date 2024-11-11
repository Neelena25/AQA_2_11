import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class Main
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "/Users/lkhatmullina/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.mts.by");

            WebElement onlineRechargeBlock = driver.findElement(By.xpath("//h2[contains(text(),'Онлайн пополнение без комиссии')]"));
            assertNotNull("Блок 'Онлайн пополнение без комиссии' не найден", onlineRechargeBlock);

            assertTrue("Логотип платежной системы Visa не найден",
                    driver.findElement(By.cssSelector("img[src*='visa']")).isDisplayed());
            assertTrue("Логотип платежной системы MasterCard не найден",
                    driver.findElement(By.cssSelector("img[src*='mastercard']")).isDisplayed());

            WebElement detailsLink = driver.findElement(By.linkText("Подробнее о сервисе"));
            assertNotNull("Ссылка 'Подробнее о сервисе' не найдена", detailsLink);
            detailsLink.click();

            driver.navigate().back();
            WebElement serviceDropdown = driver.findElement(By.id("service-dropdown"));
            serviceDropdown.click();

            WebElement mobileServicesOption = driver.findElement(By.xpath("//option[contains(text(),'Услуги связи')]"));
            mobileServicesOption.click();

            WebElement phoneNumberField = driver.findElement(By.id("phone-number"));
            phoneNumberField.sendKeys("297777777");

            WebElement continueButton = driver.findElement(By.id("continue-button"));
            continueButton.click();


        } finally {
            driver.quit();
        }
    }

}
