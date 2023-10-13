package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pages.AvitaPages;
import utils.ConfigReader;
import utils.Driver;


public class AvitaStepDefinitions {

    AvitaPages avitaPages = new AvitaPages();

    final static Logger logger = LogManager.getLogger(AvitaStepDefinitions.class);

    @Given("The User goes to test url")
    public void the_user_goes_to_test_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        logger.info("Navigated to test url");
    }

    @And("The User click on the Kayit Ol button in the header section")
    public void theUserClickOnTheKayitOlButtonInTheHeaderSection() {
        avitaPages.clickOnButtonKayitOlHeader();
        logger.info("Clicked the Kayit Ol button in the header section");
    }

    @And("The User fill in the required information on the registration page")
    public void theUserFillInTheRequiredInformationOnTheRegistrationPage() {
        avitaPages.enterNameSection();
        avitaPages.enterEmailSection();
        avitaPages.enterPhoneNumber();
        avitaPages.enterPassword();
        avitaPages.enterPasswordConfirm();
        avitaPages.clickOnCheckBoxUserAgreement();
        logger.info("Filled in the required information on the registration page");


    }


    @And("The User click on the Kayit Ol button bottom of the page")
    public void theUserClickOnTheKayitOlButtonBottomOfThePage() {
        avitaPages.clickOnButtonSubmitBottomOfPage();
        logger.info("Clicked the Kayit Ol button bottom of the page");

    }

    @Then("The User verify that correctly sign up")
    public void theUserVerifyThatCorrectlySignUp() {
        avitaPages.assertionSuccessfullSignUpText();
        logger.info("Correct registration verified");

    }
    @And("The User click on the Giriş Yap button in the header section")
    public void theUserClickOnTheGirişYapButtonInTheHeaderSection() {
        avitaPages.buttonGirisYapHeader();
        logger.info("Clicked the Giris Yap button in the header section");
    }
    @And("The User fill in the required information on the login page")
    public void theUserFillInTheRequiredInformationOnTheLoginPage() {
        avitaPages.fillEmailAndPasswordForLogin();
        logger.info("Filled in the required information on the login page");
    }


    @And("The User click on the Giris Yap button bottom of the page")
    public void theUserClickOnTheGirisYapButtonBottomOfThePage() {
        avitaPages.clickOnButtonSubmitBottomOfPage();
        logger.info("Clicked the Kayit Ol button bottom of the page");
    }

    @Then("The User verify that correctly login")
    public void theUserVerifyThatCorrectlyLogin() {
        avitaPages.assertionUserSection();
        logger.info("Correct login verified");
    }

    @And("The User click on the Yeni Seans Al button in the Online Seanslar section")
    public void theUserClickOnTheYeniSeansAlButtonInTheOnlineSeanslarSection() {
        avitaPages.clickOnYeniSeansAlButton();
        logger.info("Clicked on the Yeni Seans Al button in the Online Seanslar section");
    }

    @And("The User fills in the Profil Bilgileri section on the Yeni Seans Satin Al page")
    public void theUserFillsInTheProfilBilgileriSectionOnTheYeniSeansSatinAlPage() {
        avitaPages.clickCinsiyetRadioButton();
        avitaPages.inputAge();
        avitaPages.selectEducation();
        avitaPages.clickMedeniDurum();
        avitaPages.clickCocuk();
        avitaPages.inputJob();
        logger.info("Filled in the required information on the Yeni Seans Satin Al page");
    }

    @And("The User click on the Devam et button bottom of the page")
    public void theUserClickOnTheDevamEtButtonBottomOfThePage() {
        avitaPages.clickOnButtonSubmitBottomOfPage();
        logger.info("Clicked on the Devam et button bottom of the page");
    }

    @And("The User fills in the Degerlendirme Sorulari section on the Yeni Seans Satin Al page")
    public void theUserFillsInTheDegerlendirmeSorulariSectionOnTheYeniSeansSatinAlPage() {
        avitaPages.selectSubjectDropdown();
        avitaPages.selectHealthIssueCheckbox();
        avitaPages.selectComplaintCheckbox();
        avitaPages.selectMedicineCheckbox();
        avitaPages.selectAppetiteCheckbox();
        avitaPages.selectSleepCheckbox();
        avitaPages.selectAlcoholCheckbox();
        avitaPages.selectCigaretCheckbox();
        avitaPages.selectCoffeeCheckbox();
        avitaPages.selectAddictionCheckbox();
        avitaPages.selectTreatmentCheckbox();
        logger.info("Filled in the Degerlendirme Sorulari section on the Yeni Seans Satin Al page");

    }

    @And("The User fills in the Appointment Date and Time section on the Yeni Seans Satin Al page")
    public void theUserFillsInTheAppointmentDateAndTimeSectionOnTheYeniSeansSatinAlPage() {
        avitaPages.selectAppointmentDay();
        avitaPages.selectAppointmentTime();
        logger.info("Filled in the Appointment Date and Time section on the Yeni Seans Satin Al page");
    }

    @And("The User fills in the Payment and Billing information sections on the Yeni Seans Satin Al page")
    public void theUserFillsInThePaymentAndBillingInformationSectionsOnTheYeniSeansSatinAlPage() {
        avitaPages.enterCreditCardInformation();
        avitaPages.clickOnTheSellingAggreementCheckbox();
        logger.info("Filled in the Payment and Billing information sections on the Yeni Seans Satin Al page");

    }

    @And("The User click on the Satin Almayi Tamamla button bottom of the page")
    public void theUserClickOnTheSatinAlmayiTamamlaButtonBottomOfThePage() {
         // avitaPages.clickOnButtonSubmitBottomOfPage();
        logger.info("Clicked on the Satin Almayi Tamamla button bottom of the page");
    }
}