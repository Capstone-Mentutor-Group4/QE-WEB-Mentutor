package org.example.Mentee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateMenteePage {
    public static WebDriver driver;
    public UpdateMenteePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver =driver ;
    }
    @FindBy(xpath = "//h3[.='Profile']")
    private WebElement profileBtn;
    @FindBy(xpath = "//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-2']")
    private WebElement verifyProfileMentee;
    @FindBy(xpath = "//label[@class='h-8 w-8 md:h-10 md:w-10 bg-card shadow-md text-putih flex items-center justify-center rounded-[5px] cursor-pointer']")
    private WebElement btnUpdateProfile;
    @FindBy(xpath = "//input[@id='input-fullname']")
    private WebElement inputName;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement inputEmail;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[@id='btn-submitMentee']")
    private WebElement btnSubmit;
    @FindBy(xpath = "//label[@class='cursor-pointer btn-sm  absolute right-2 top-2 text-putih border-white']")
    private WebElement btnClose;
    @FindBy(xpath = "//h3[@class='font-medium text-lg text-putih mb-2']")
    private WebElement verifyPopUpEdit;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpSuccess;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOkSuccess;

    public void setProfileBtn() {
        profileBtn.click();
    }

    public boolean setVerifyProfileMentee() {
        return verifyProfileMentee.isDisplayed();
    }

    public void setBtnUpdateProfile() {
        btnUpdateProfile.click();
    }

    public void setInputName(String name) {
        inputName.sendKeys(name);
    }

    public void setInputEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void setInputPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void setBtnSubmit() {
        btnSubmit.click();
    }

    public void setBtnClose() {
        btnClose.click();
    }

    public void setBtnOkSuccess() {
        btnOkSuccess.click();
    }
    public boolean verifyPopUpSucc(){
        return popUpSuccess.isDisplayed();
    }

    public boolean setVerifyPopUpEdit() {
        return verifyPopUpEdit.isDisplayed();
    }
}
