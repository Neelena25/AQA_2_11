package Practice_Project_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class PaymentPage {
    private WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getServiceDropdown() {
        return driver.findElement(By.id("service-dropdown"));
    }

    public void selectMobileServicesOption() {
        getServiceDropdown().click();
        WebElement mobileServicesOption = driver.findElement(By.xpath("//option[contains(text(),'Услуги связи')]"));
        mobileServicesOption.click();
    }

    public WebElement getPhoneNumberField() {
        return driver.findElement(By.id("phone-number"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue-button"));
    }

    public void fillPhoneNumber(String phoneNumber) {
        getPhoneNumberField().sendKeys(phoneNumber);
    }

    public void verifyEmptyFieldMessages() {
        checkEmptyFieldMessage("service-field", "Введите данные услуги");
        checkEmptyFieldMessage("internet-field", "Введите данные интернета");
        checkEmptyFieldMessage("installment-field", "Введите данные рассрочки");
        checkEmptyFieldMessage("debt-field", "Введите данные задолженности");
    }

    private void checkEmptyFieldMessage(String fieldId, String expectedMessage) {
        WebElement field = driver.findElement(By.id(fieldId));
        String message = field.getAttribute("placeholder");
        assertTrue("Ожидалось сообщение: " + expectedMessage + ", но было: " + message, message.equals(expectedMessage));
    }
}
