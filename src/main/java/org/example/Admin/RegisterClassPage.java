package org.example.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterClassPage {
    public static WebDriver driver;

    public RegisterClassPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h3[.='Input Class']")
    private WebElement inputClassPage;
    @FindBy(xpath = "//input[@name='classname']")
    private WebElement inputClassName;
    @FindBy(xpath = "//button[@id='btn-addClass']")
    private WebElement addBtnClass;
    @FindBy(xpath = "//p[.='class is required']")
    private WebElement errorEmptyField;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpSuccessCreated;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOkClass;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement popUpFailed;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOkFailed;

    public void setInputClassPage(){
        inputClassPage.click();
    }

    public void setInputClassName(String nama) {
        inputClassName.sendKeys(nama);
    }

    public void setAddBtnClass() {
        addBtnClass.click();
    }

    public void setPopUpSuccessCreated() {
        popUpSuccessCreated.isDisplayed();
    }

    public void setPopUpFailed() {
        popUpFailed.isDisplayed();
    }
    public void setErrorEmptyField(){
        errorEmptyField.isDisplayed();
    }

    public void setBtnOkClass() {
        btnOkClass.click();
    }

    public void setBtnOkFailed() {
       btnOkFailed.click();
    }

    public boolean verifyInputClassPage() {
        return inputClassName.isDisplayed();
    }



}
