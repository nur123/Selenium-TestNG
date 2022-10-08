package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {

    private ChromeDriver driver;

    public RegisterUser(ChromeDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://automationexercise.com/");
    }

    public void clickSignupOrLogin() {
        By locatorSignupOrLogin = By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
        WebElement signupOrLogin = driver.findElement(locatorSignupOrLogin);
        signupOrLogin.click();
    }

    public void inputName(String key) {
        By locatorInputNameKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]");
        WebElement inputNameKey = driver.findElement(locatorInputNameKey);
        inputNameKey.sendKeys(key);
    }

    public void inputEmailAddress(String key) {
        By locatorInputEmailAddressKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]");
        WebElement inputEmailAddressKey = driver.findElement(locatorInputEmailAddressKey);
        inputEmailAddressKey.sendKeys(key);
    }

    public void clickButtonSignUp() throws InterruptedException {
        By locatorButtonSignUp = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]");
        WebElement buttonButtonSignUp = driver.findElement(locatorButtonSignUp);
        buttonButtonSignUp.click();
        Thread.sleep(3000);
    }

    public void inputTitle() {
        By locatorInputTitle = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/label[1]/div[1]/span[1]/input[1]");
        WebElement inputTitle = driver.findElement(locatorInputTitle);
        inputTitle.click();
    }

    public void inputPassword(String key) {
        By locatorInputPasswordKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]");
        WebElement inputPasswordKey = driver.findElement(locatorInputPasswordKey);
        inputPasswordKey.sendKeys(key);
    }

    public void clickSelectDayDateOfBird() {
        By locatorSelectDayDateOfBirth = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/select[1]/option[12]");
        WebElement selectDayDateOfBirth  = driver.findElement(locatorSelectDayDateOfBirth);
        selectDayDateOfBirth.click();
    }

    public void clickSelectMonthDateOfBird() {
        By locatorSelectMonthDateOfBirth = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/select[1]/option[11]");
        WebElement selectMonthDateOfBirth  = driver.findElement(locatorSelectMonthDateOfBirth);
        selectMonthDateOfBirth.click();
    }

    public void clickYearMonthDateOfBird() {
        By locatorSelectYearDateOfBirth = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[3]/div[1]/select[1]/option[37]");
        WebElement selectYearDateOfBirth  = driver.findElement(locatorSelectYearDateOfBirth);
        selectYearDateOfBirth.click();
    }

    public void clickInputSignUpForOurNewsletter() {
        By locatorInputSignUpForOurNewsletter = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/span[1]/input[1]");
        WebElement inputSignUpForOurNewsletter = driver.findElement(locatorInputSignUpForOurNewsletter);
        inputSignUpForOurNewsletter.click();
    }

    public void clickInputReceiveSpecialOffersFromOurPartners() {
        By locatorInputReceiveSpecialOffersFromOurPartners = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/span[1]/input[1]");
        WebElement inputReceiveSpecialOffersFromOurPartners = driver.findElement(locatorInputReceiveSpecialOffersFromOurPartners);
        inputReceiveSpecialOffersFromOurPartners.click();
    }

    public void inputFirstName(String key) {
        By locatorInputFirstNameKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]");
        WebElement inputFirstNameKey = driver.findElement(locatorInputFirstNameKey);
        inputFirstNameKey.sendKeys(key);
    }

    public void inputLastName(String key) {
        By locatorInputLastNameKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]");
        WebElement inputLastNameKey = driver.findElement(locatorInputLastNameKey);
        inputLastNameKey.sendKeys(key);
    }

    public void inputCompany(String key) {
        By locatorInputCompanyKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[3]/input[1]");
        WebElement inputCompanyKey = driver.findElement(locatorInputCompanyKey);
        inputCompanyKey.sendKeys(key);
    }

    public void inputAddress(String key) {
        By locatorInputAddressKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[4]/input[1]");
        WebElement inputAddressKey = driver.findElement(locatorInputAddressKey);
        inputAddressKey.sendKeys(key);
    }

    public void inputAddress2(String key) {
        By locatorInputAddress2Key = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[5]/input[1]");
        WebElement inputAddress2Key = driver.findElement(locatorInputAddress2Key);
        inputAddress2Key.sendKeys(key);
    }

    public void clickSelectCountry() {
        By locatorSelectCountry = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[6]/select[1]/option[1]");
        WebElement selectCountry  = driver.findElement(locatorSelectCountry);
        selectCountry.click();
    }

    public void inputState(String key) {
        By locatorInputStateKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[7]/input[1]");
        WebElement inputStateKey = driver.findElement(locatorInputStateKey);
        inputStateKey.sendKeys(key);
    }

    public void inputCity(String key) {
        By locatorInputCityKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[8]/input[1]");
        WebElement inputCityKey = driver.findElement(locatorInputCityKey);
        inputCityKey.sendKeys(key);
    }

    public void inputZipCode(String key) {
        By locatorInputZipCodeKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[9]/input[1]");
        WebElement inputZipCodeKey = driver.findElement(locatorInputZipCodeKey);
        inputZipCodeKey.sendKeys(key);
    }

    public void inputMobileNumber(String key) {
        By locatorInputMobileNumberKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[10]/input[1]");
        WebElement inputMobileNumberKey = driver.findElement(locatorInputMobileNumberKey);
        inputMobileNumberKey.sendKeys(key);
    }

    public void clickButtonCreateAccount() throws InterruptedException {
        By locatorButtonCreateAccount = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]");
        WebElement buttonButtonCreateAccount = driver.findElement(locatorButtonCreateAccount);
        buttonButtonCreateAccount.click();
        Thread.sleep(3000);
    }

    public void clickButtonContinue() throws InterruptedException {
        By locatorButtonContinue = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
        WebElement buttonButtonContinue = driver.findElement(locatorButtonContinue);
        buttonButtonContinue.click();
        Thread.sleep(3000);
    }

}