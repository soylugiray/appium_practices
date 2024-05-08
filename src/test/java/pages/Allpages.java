package pages;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class Allpages {

    public Allpages(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(25)),this);

    }

  @FindBy(xpath="//span[text()='Accepter & Fermer']")
    public WebElement btnAccepter;

    @FindBy(xpath = "//*[contains(@class,'alltricks-Header-menuItem--user')]")
    public WebElement btnProfil;


    @FindBy(partialLinkText = "Identifiez-vous")
    public WebElement monProfil;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@class='ant-btn atds-btn']")
    public WebElement btnSuivant;

    @FindBy(xpath = "//div[@class='form_error']")
    public WebElement textGecersiz;

    @FindBy(xpath = "//input[@class='ant-input']")
    public WebElement btnPassword;

  @FindBy(xpath = "//button[@class='ant-btn atds-btn']")
  public WebElement btnMeConnecter;

  @FindBy(xpath = "//img[@alt='Alltricks']")
  public WebElement logoAlltricks;

  @FindBy(xpath = "(//img[@class='circle-thumbnails'])[1]")
  public WebElement Velos;














}
