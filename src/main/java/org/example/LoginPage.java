package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public static WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver ;
    }

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement fieldEmail;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement loginbtn;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpSuccess;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement popUpFailed;

    @FindBy(css = ".swal2-confirm")
    private WebElement btnOKPopUp;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOKFailPopup;
    @FindBy(css = ".relative")
    private WebElement homeAdmin;
    @FindBy(xpath = "//p[@class='text-transparent md:text-[20px] lg:text-[28px] font-semibold bg-clip-text bg-gradient-to-r from-[#854AEA] to-[#D441B9] hidden md:block lg:block']")
    private WebElement homeMentor;
    @FindBy(xpath = "//p[@class='text-transparent md:text-[20px] lg:text-[28px] font-semibold bg-clip-text bg-gradient-to-r from-[#854AEA] to-[#D441B9] hidden md:block lg:block']")
    private WebElement homeMentee;
    @FindBy(css = "css = .h-screen")
    private WebElement loginPage;
    @FindBy(xpath = "//p[.='Password is required']")
    private WebElement noPasswordText;
    @FindBy(xpath = "//p[.='Email is required']")
    private WebElement noEmailText;

// STEP DEF
    public void setFieldEmail(String email){
    fieldEmail.sendKeys(email);
    }

    public void setFieldPassword(String pwd) {
        fieldPassword.sendKeys(pwd);
    }

    public void clickBtnLogin(){
        loginbtn.click();
    }

    public boolean setPopUpSuccess() {
        return popUpSuccess.isDisplayed();
    }
    public void setBtnOKPopUp(){
        btnOKPopUp.click();
    }
    public void setBtnOKFailPopup(){
        btnOKFailPopup.click();
    }
    public boolean verifyLoginPage(){
        return fieldEmail.isDisplayed();
    }
    //Verify Function
    public boolean verifyHomeAdmin(){
        return homeAdmin.isDisplayed();
    }
    public boolean verifyHomeMentor(){
        return homeMentor.isDisplayed();
    }
    public boolean verifyHomeMentee(){return homeMentee.isDisplayed();}
    public boolean setPopUpFailed() {
        return popUpFailed.isDisplayed();
    }
    public boolean verifyNoEmailText() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Email is required']")));
        return noEmailText.isDisplayed();
    }
    public boolean verifyNoPassText() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Password is required']")));
        return noPasswordText.isDisplayed();
    }
}
