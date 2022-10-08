package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterUserTest {

    private ChromeDriver driver;

    @BeforeTest
    public void initializeSession() {
        //webdrivermanager
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
        //chrome Options
        ChromeOptions options = new ChromeOptions();
//        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("chrome");
        //initialize browser
        driver = new ChromeDriver(options);
        //maximize
        driver.manage().window().maximize();
    }

    @AfterTest
    public void destroySession() throws InterruptedException {
        Thread.sleep(5000);
        //close browser
        driver.quit();
    }

    @Test
    public void searchKey() throws InterruptedException {
        driver.get("https://automationexercise.com/");

        // click link Signup / Login
        By locatorSignupOrLogin = By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
        WebElement signupOrLogin = driver.findElement(locatorSignupOrLogin);
        signupOrLogin.click();

        // input Name
        By locatorInputNameKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]");
        WebElement inputNameKey = driver.findElement(locatorInputNameKey);
        inputNameKey.sendKeys("RoyTest");

        // input Email Address
        By locatorInputEmailAddressKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]");
        WebElement inputEmailAddressKey = driver.findElement(locatorInputEmailAddressKey);
        inputEmailAddressKey.sendKeys("noermoehammad42@gmail.com");

        // click button signup
        By locatorButtonSignUp = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]");
        WebElement buttonButtonSignUp = driver.findElement(locatorButtonSignUp);
        buttonButtonSignUp.click();
        Thread.sleep(3000);

        // click title
        By locatorInputTitle = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/label[1]/div[1]/span[1]/input[1]");
        WebElement inputTitle = driver.findElement(locatorInputTitle);
        inputTitle.click();

        // input password
        By locatorInputPasswordKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]");
        WebElement inputPasswordKey = driver.findElement(locatorInputPasswordKey);
        inputPasswordKey.sendKeys("Satria123");

        // select day date of birth
        By locatorSelectDayDateOfBirth = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/select[1]/option[12]");
        WebElement selectDayDateOfBirth  = driver.findElement(locatorSelectDayDateOfBirth);
        selectDayDateOfBirth.click();

        // select month date of birth
        By locatorSelectMonthDateOfBirth = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/select[1]/option[11]");
        WebElement selectMonthDateOfBirth  = driver.findElement(locatorSelectMonthDateOfBirth);
        selectMonthDateOfBirth.click();

        // select year date of birth
        By locatorSelectYearDateOfBirth = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[3]/div[1]/select[1]/option[37]");
        WebElement selectYearDateOfBirth  = driver.findElement(locatorSelectYearDateOfBirth);
        selectYearDateOfBirth.click();

        // click input SignUpForOurNewsletter
        By locatorInputSignUpForOurNewsletter = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/span[1]/input[1]");
        WebElement inputSignUpForOurNewsletter = driver.findElement(locatorInputSignUpForOurNewsletter);
        inputSignUpForOurNewsletter.click();

        // click input ReceiveSpecialOffersFromOurPartners
        By locatorInputReceiveSpecialOffersFromOurPartners = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/span[1]/input[1]");
        WebElement inputReceiveSpecialOffersFromOurPartners = driver.findElement(locatorInputReceiveSpecialOffersFromOurPartners);
        inputReceiveSpecialOffersFromOurPartners.click();

        // input FirstName
        By locatorInputFirstNameKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]");
        WebElement inputFirstNameKey = driver.findElement(locatorInputFirstNameKey);
        inputFirstNameKey.sendKeys("Roy");

        // input LastName
        By locatorInputLastNameKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]");
        WebElement inputLastNameKey = driver.findElement(locatorInputLastNameKey);
        inputLastNameKey.sendKeys("Tester");

        // input company
        By locatorInputCompanyKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[3]/input[1]");
        WebElement inputCompanyKey = driver.findElement(locatorInputCompanyKey);
        inputCompanyKey.sendKeys("Testing123");

        // input address
        By locatorInputAddressKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[4]/input[1]");
        WebElement inputAddressKey = driver.findElement(locatorInputAddressKey);
        inputAddressKey.sendKeys("Jl 123 Ok");

        // input address 2
        By locatorInputAddress2Key = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[5]/input[1]");
        WebElement inputAddress2Key = driver.findElement(locatorInputAddress2Key);
        inputAddress2Key.sendKeys("Jl 456 Ok");

        // select country
        By locatorSelectCountry = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[6]/select[1]/option[1]");
        WebElement selectCountry  = driver.findElement(locatorSelectCountry);
        selectCountry.click();

        // input state
        By locatorInputStateKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[7]/input[1]");
        WebElement inputStateKey = driver.findElement(locatorInputStateKey);
        inputStateKey.sendKeys("india");

        // input city
        By locatorInputCityKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[8]/input[1]");
        WebElement inputCityKey = driver.findElement(locatorInputCityKey);
        inputCityKey.sendKeys("New Delhi");

        // input zip code
        By locatorInputZipCodeKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[9]/input[1]");
        WebElement inputZipCodeKey = driver.findElement(locatorInputZipCodeKey);
        inputZipCodeKey.sendKeys("34151");

        // input mobile number
        By locatorInputMobileNumberKey = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[10]/input[1]");
        WebElement inputMobileNumberKey = driver.findElement(locatorInputMobileNumberKey);
        inputMobileNumberKey.sendKeys("817171819191");

        // click button create account
        By locatorButtonCreateAccount = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]");
        WebElement buttonButtonCreateAccount = driver.findElement(locatorButtonCreateAccount);
        buttonButtonCreateAccount.click();
        Thread.sleep(3000);

        // click button continue
        By locatorButtonContinue = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
        WebElement buttonButtonContinue = driver.findElement(locatorButtonContinue);
        buttonButtonContinue.click();
        Thread.sleep(3000);

    }
}
