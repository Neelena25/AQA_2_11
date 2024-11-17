package Practice_Project_18;

import Practice_Project_16.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit5.AllureJunit5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.qameta.allure.Allure.step;

public class HomePageTestAllure {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        homePage = new HomePage(driver);
    }

    @Test
    @Description("Проверяем отображение блока онлайн пополнения")
    public void testOnlineRechargeBlockIsDisplayed() {
        step("Проверяем, что блок онлайн пополнения виден", () -> {
            boolean isDisplayed = homePage.getOnlineRechargeBlock().isDisplayed();
            assertTrue(isDisplayed, "Онлайн пополнение блок не отображается");
        });
    }

    @Test
    @Description("Проверяем наличие логотипов Visa и MasterCard")
    public void testLogosAreDisplayed() {
        step("Проверяем наличие логотипа Visa", () -> {
            boolean isVisaDisplayed = homePage.isVisaLogoDisplayed();
            assertTrue(isVisaDisplayed, "Логотип Visa не отображается");
        });

        step("Проверяем наличие логотипа MasterCard", () -> {
            boolean isMasterCardDisplayed = homePage.isMasterCardLogoDisplayed();
            assertTrue(isMasterCardDisplayed, "Логотип MasterCard не отображается");
        });
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
