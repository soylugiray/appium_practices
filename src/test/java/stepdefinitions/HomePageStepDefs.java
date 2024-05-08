package stepdefinitions;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.Allpages;
import utils.ConfigReader;
import utils.Driver;

public class HomePageStepDefs {

    Allpages elements = new Allpages();


    @Given("Alltricks anasayfasina git")
    public void alltricks_anasayfasina_git() throws InterruptedException {

        Driver.getAppiumDriver().get(ConfigReader.getProperty("Url"));

        Thread.sleep(2000);
        elements.btnAccepter.click();


    }

    @Given("Profil sekmesine geç")
    public void profil_sekmesine_geç() {

        elements.btnProfil.click();
    }
    @And("Geçersiz bir mail adresini gir")
    public void geçersizBirMailAdresiniGir() throws InterruptedException {
        elements.monProfil.click();
        elements.emailInput.sendKeys(ConfigReader.getProperty("gecersizEmail"));
        Thread.sleep(2000);
        elements.btnSuivant.isEnabled();
        elements.btnSuivant.click();
        elements.textGecersiz.isDisplayed();
        elements.emailInput.clear();





    }
    @Then("Adresim kismina emaili gir")
    public void adresim_kismina_emaili_gir() throws InterruptedException {


        elements.emailInput.sendKeys(ConfigReader.getProperty("email"));

        elements.btnSuivant.click();



    }


    @And("Passwordu gir")
    public void passworduGir() {

        elements.btnPassword.sendKeys(ConfigReader.getProperty("Password"));
        elements.btnMeConnecter.isEnabled();
        elements.btnMeConnecter.click();
        elements.btnMeConnecter.click();


    }

    @Given("Anasayfaya git")
    public void anasayfayaGit() throws InterruptedException {

        Thread.sleep(2000);
        elements.logoAlltricks.isEnabled();
        elements.logoAlltricks.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getAppiumDriver();
        js.executeScript("window.scrollBy(0,1250)", "Vélos");

        Thread.sleep(2000);
    }



}
