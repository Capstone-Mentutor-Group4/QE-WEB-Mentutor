package org.example.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateUserPage {
    public static WebDriver driver;
    public UpdateUserPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver =driver ;
    }
    @FindBy(xpath = "//div[4]//label[@id='icon-options']")
    private WebElement optionBtnUser;
    @FindBy(xpath ="//div[4]//label[@class='hover:text-button px-4 pt-2 text-sm text-putih cursor-pointer']")
    private WebElement editBtnUser;
    @FindBy(xpath ="//h3[@class='font-medium text-lg text-putih mb-2 pl-8']")
    private WebElement verifyPopUpUpdateUser;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpSuccessUpdate;
    @FindBy(xpath ="//input[@id='input-fullname']")
    private WebElement inputName;
    @FindBy(xpath ="//input[@id='input-email']")
    private WebElement inputEmail;
    @FindBy(xpath ="//input[@id='input-password']")
    private WebElement inputPassword;
    @FindBy(xpath ="//select[@id='dropdown-class']")
    private WebElement dropClass;
    @FindBy(xpath ="//button[@id='btn-submitAdmin']")
    private WebElement submitBtn;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOkPopUpSucc;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpFailed;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOkFailed;

    public void setOptionBtnUser(){
        optionBtnUser.click();
    }

    public void setEditBtnUser() {
        editBtnUser.click();
    }

    public void setInputName(String nama) {
        inputName.clear();
        inputName.sendKeys(nama);
    }

    public void setInputEmail(String email) {
        inputEmail.clear();
        inputEmail.sendKeys(email);
    }

    public void setInputPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void setDropClass(String className) {
        Select a = new Select(dropClass);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='dropdown-class']")));
        dropClass.click();
        a.selectByVisibleText(className);
    }

    public void setSubmitBtn() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-submitAdmin']")));
        submitBtn.click();
    }

    public void setBtnOkPopUpSucc(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='swal2-confirm swal2-styled']")));
        btnOkPopUpSucc.click();
    }

    public void setBtnOkFailed() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='swal2-confirm swal2-styled']")));
        btnOkFailed.click();
    }

    public boolean setVerifyPopUpUpdateUser() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='font-medium text-lg text-putih mb-2 pl-8']")));
        return verifyPopUpUpdateUser.isDisplayed();
    }
    public boolean setVerifyPopUpSeuccess(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='swal2-title']")));
        return popUpSuccessUpdate.isDisplayed();
    }
    public boolean setVerifyPopupFailed(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='swal2-title']")));
        return popUpFailed.isDisplayed();
    }
}

