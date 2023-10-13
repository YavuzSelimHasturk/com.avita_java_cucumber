package pages;


import com.github.javafaker.Faker;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class AvitaPages {

    public AvitaPages(){
        PageFactory.initElements(Driver.getDriver(),this);;
    }
    static Faker fake = new Faker();

    @FindBy (xpath = "//*[text()='Kayıt Ol']")
    WebElement buttonKayitOlHeader;

    public void clickOnButtonKayitOlHeader(){
     buttonKayitOlHeader.click();
    }

    @FindBy(id="name")
    WebElement inputNameLastname;

    public void enterNameSection(){
        String nameLastName= fake.name().fullName();
        inputNameLastname.sendKeys(nameLastName);
    }
    @FindBy(id="email")
    WebElement inputEmail;

    public void  enterEmailSection(){
        String email= fake.internet().emailAddress();
        inputEmail.sendKeys(email);
    }
    @FindBy(id="phone")
    WebElement inputPhoneNumber;

    public void enterPhoneNumber(){
        int operatorNumber=530;
        String phoneNumber= operatorNumber+String.valueOf(fake.number().numberBetween(1111111,999999));

        inputPhoneNumber.sendKeys(phoneNumber);
    }

    @FindBy(id="password")
    WebElement inputPassword;
    String password = fake.internet().password();
    public void enterPassword(){

        inputPassword.sendKeys(password);
    }
    @FindBy(id="password-confirm")
    WebElement inputPasswordConfirm;
    public void enterPasswordConfirm(){
        inputPasswordConfirm.sendKeys(password);
    }

    @FindBy(xpath = "//input[@name='user-agreement']")
    WebElement checkBoxUserAgreement;

    public void clickOnCheckBoxUserAgreement(){
        ReusableMethods.clickWithJS(checkBoxUserAgreement);

    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonSubmitBottomOfPage;

    public void clickOnButtonSubmitBottomOfPage(){
       buttonSubmitBottomOfPage.click();
    }

    @FindBy(xpath = "//h2[text()='Kayıt İşleminiz Başarıyla Gerçekleştirilmiştir!']")
    WebElement successfullSignupText;
    public void assertionSuccessfullSignUpText(){
        assert (successfullSignupText.isDisplayed());
    }

    @FindBy (xpath = "//*[text()='Giriş Yap']")
    WebElement buttonGirisYapHeader;
    public void buttonGirisYapHeader(){
        buttonGirisYapHeader.click();
    }
    public void fillEmailAndPasswordForLogin(){
        inputEmail.sendKeys(ConfigReader.getProperty("LoginEmail"));
        inputPassword.sendKeys(ConfigReader.getProperty("LoginPassword"));
    }

    @FindBy(xpath = "//div[@class='col-lg-3']")
    WebElement userSection;

    public void assertionUserSection(){
        assert(userSection.isDisplayed());
    }
    @FindBy(xpath = "//*[text()='Yeni Seans Al']")
    WebElement buttonYeniSeansAl;

    public void clickOnYeniSeansAlButton(){
        buttonYeniSeansAl.click();
    }
    @FindBy (id="male")
    WebElement radioButtonCinsiyet;

    public void clickCinsiyetRadioButton(){
        ReusableMethods.clickWithJS(radioButtonCinsiyet);
    }
    @FindBy (id="age")
    WebElement inputAge;
    public void inputAge(){
        inputAge.clear();
        inputAge.sendKeys("33");
    }

    @FindBy(id = "education")
    WebElement education;

    public void selectEducation(){
        Select educationDropdown = new Select(education);
        educationDropdown.selectByValue("2");
    }

    @FindBy(xpath = "//input[@id='marital-1']")
    WebElement radioButtonMedeniDurum;

    public void clickMedeniDurum(){
        ReusableMethods.clickWithJS(radioButtonMedeniDurum);
    }
    @FindBy(xpath = "//input[@id='children-1']")
    WebElement radioButtonCocuk;

    public void clickCocuk(){
       ReusableMethods.clickWithJS(radioButtonCocuk);
    }
    @FindBy(id = "job")
    WebElement inputJob;
    public void inputJob(){
        String job=fake.job().title();
        inputJob.sendKeys(job);
    }

    @FindBy(id="consulting-subject")
    WebElement subjectDropdown;

    public void selectSubjectDropdown(){
        Select subject = new Select(subjectDropdown);
        String value = ""+(fake.number().numberBetween(1,12));
        subject.selectByValue(value);
    }

    @FindBy (xpath = "//input[@id='health-issue-2']")
    WebElement chechboxHealthIssue;

    public void selectHealthIssueCheckbox(){
        ReusableMethods.clickWithJS(chechboxHealthIssue);
    }

    @FindBy(id="complaint-6")
    WebElement checkboxComplaint;

    public void selectComplaintCheckbox(){
        ReusableMethods.clickWithJS(checkboxComplaint);
    }
    @FindBy(id="medicine-1")
    WebElement checkBoxMedicine;
    public void selectMedicineCheckbox(){
        ReusableMethods.clickWithJS(checkBoxMedicine);
    }
    @FindBy(id="appetite-1")
    WebElement checkBoxAppetite;

    public void selectAppetiteCheckbox(){
        ReusableMethods.clickWithJS(checkBoxAppetite);
    }
    @FindBy(id="sleep-1")
    WebElement checkBoxSleep;

    public void selectSleepCheckbox(){
        ReusableMethods.clickWithJS(checkBoxSleep);
    }
    @FindBy(id="alcohol-1")
    WebElement checkBoxAlcohol;

    public void selectAlcoholCheckbox(){
        ReusableMethods.clickWithJS(checkBoxAlcohol);
    }
    @FindBy(id="cigaret-1")
    WebElement checkBoxCigaret;
    public void selectCigaretCheckbox(){
        ReusableMethods.clickWithJS(checkBoxCigaret);
    }
    @FindBy(id="coffee-3")
    WebElement checkboxCoffee;
    public void selectCoffeeCheckbox(){
        ReusableMethods.clickWithJS(checkboxCoffee);
    }
    @FindBy(id="addiction-1")
    WebElement checkboxAddiction;
    public void selectAddictionCheckbox(){
        ReusableMethods.clickWithJS(checkboxAddiction);
    }
    @FindBy(id="treatment-2")
    WebElement checkboxTreatment;
    public void selectTreatmentCheckbox(){
        ReusableMethods.clickWithJS(checkboxTreatment);
    }
    @FindBy(id="appointment-date-3")
    WebElement checkboxAppointmentDate;
    public void selectAppointmentDay(){
        ReusableMethods.clickWithJS(checkboxAppointmentDate);
    }
    @FindBy(id="appointment-time-3")
    WebElement checkboxAppointmentTime;

    public void selectAppointmentTime(){
        ReusableMethods.clickWithJS(checkboxAppointmentTime);
    }
    @FindBy(id="number")
    WebElement checkboxCardNumber;
    @FindBy(id="name")
    WebElement checkboxCardName;
    @FindBy(id="expiry")
    WebElement checkboxExpiryDate;
    @FindBy(id="cvc")
    WebElement checkboxCvcNumber;

    public void enterCreditCardInformation(){
        String cardNumber= fake.business().creditCardNumber();
        String cardName= fake.name().fullName();
        String expiryDate = fake.business().creditCardExpiry();
        String cvc= ""+(fake.number().numberBetween(100,999));

        checkboxCardNumber.sendKeys(cardNumber);
        checkboxCardName.sendKeys(cardName);
        checkboxExpiryDate.sendKeys(expiryDate);
        checkboxCvcNumber.sendKeys(cvc);

    }
    @FindBy(xpath ="(//input[@type='checkbox'])[2]" )
    WebElement checkBoxSellingAgreement;

    public void clickOnTheSellingAggreementCheckbox(){
        ReusableMethods.clickWithJS(checkBoxSellingAgreement);
    }
    @FindBy(className = "col-md-5")
    WebElement completedBooking;
    public void assertionCompletedBooking(){
        assert (completedBooking.isDisplayed());
    }


}
