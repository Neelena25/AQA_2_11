import Practice_Project_16.HomePage;
import Practice_Project_16.PaymentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
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

            HomePage homePage = new HomePage(driver);
            assertNotNull("Блок 'Онлайн пополнение без комиссии' не найден", homePage.getOnlineRechargeBlock());
            assertTrue("Логотип платежной системы Visa не найден", homePage.isVisaLogoDisplayed());
            assertTrue("Логотип платежной системы MasterCard не найден", homePage.isMasterCardLogoDisplayed());

            PaymentPage paymentPage = homePage.clickDetailsLink();
            paymentPage.selectMobileServicesOption();
            paymentPage.fillPhoneNumber("297777777");
            paymentPage.getContinueButton().click();

            paymentPage.verifyEmptyFieldMessages();

        } finally {
            driver.quit();
        }
    }

}
