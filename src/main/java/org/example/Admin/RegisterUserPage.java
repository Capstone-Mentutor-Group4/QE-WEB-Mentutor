package org.example.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterUserPage {
    public static WebDriver driver;
    public RegisterUserPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver =driver ;
    }
    @FindBy(id = "nav-member")
    private WebElement inputMemberbtn;

    @FindBy(xpath = "//input[@id='input-fullname']")
    private WebElement inputName;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement inputEmail;
    @FindBy(xpath = "//select[@id='dropdown-role']")
    private WebElement inputRole;
    @FindBy(id = "dropdown-class")
    private WebElement inputClass;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[@id='btn-addMember']")
    private WebElement addMember;

    public void setInputMemberbtn(){
        inputMemberbtn.click();
    }
    public void setInputName(String nama){
        inputName.sendKeys(nama);
    }
    public void setInputEmail(String email){
        inputEmail.sendKeys(email);
    }
    public void setInputRole(String role){
        Select a = new Select(inputRole);
        inputRole.click();
        a.selectByVisibleText(role);
    }
    public void setInputClass(String className){
        Select a = new Select(inputClass);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdown-class")));
        inputClass.click();
        a.selectByVisibleText(className);
    }
    public void setInputPassword(String password){
        inputPassword.sendKeys(password);
    }
    public void setAddMember(){
        addMember.click();
    }
    public boolean verifyInputMemberPage(){
       return inputName.isDisplayed();
    }






}
