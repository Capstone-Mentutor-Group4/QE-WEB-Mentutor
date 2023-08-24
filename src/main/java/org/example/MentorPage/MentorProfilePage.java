package org.example.MentorPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.example.MentorPage.MentorTaskPage.pathFile;

public class MentorProfilePage {
    public static WebDriver driver;

    public MentorProfilePage (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//label[@class='h-8 w-8 md:h-10 md:w-10 bg-card shadow-md text-putih flex items-center justify-center rounded-[5px] cursor-pointer']")
    private WebElement editProfileBtn;
    public void clickEditProfileBtn(){
        editProfileBtn.click();
    }

    @FindBy(xpath = "//input[@id='input-fullname']")
    private WebElement fieldUpdateNameMentor;

    public void setFieldUpdateNameMentor(String name){
        fieldUpdateNameMentor.clear();
        fieldUpdateNameMentor.sendKeys(name);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement fieldUpdateEmailMentor;

    public void setFieldUpdateEmailMentor(String email){
        fieldUpdateEmailMentor.clear();
        fieldUpdateEmailMentor.sendKeys(email);
    }

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement fieldUpdatePswrdMentor;

    public void setFieldUpdatePswrdMentor(String password){
        fieldUpdatePswrdMentor.clear();
        fieldUpdatePswrdMentor.sendKeys(password);
    }

    @FindBy(xpath = "//label[@id='btn-upload-gbr']")
    private WebElement uploadUpdateGbrBtn;

    public void setUploadUpdateGbrBtn(String images){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='btn-upload-gbr']")));
        uploadUpdateGbrBtn.sendKeys(pathFile+""+images+"");
    }

    @FindBy(xpath = "//button[@id='btn-submitMentee']")
    private WebElement updateProfileSubBtn;

    public void clickUpdateProfileSubBtn(){
        updateProfileSubBtn.click();
    }

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpSuccessUpdatePrfleMntr;

    public boolean verifySuccessUpdatePrflMntr(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='swal2-title']")));
        return popUpSuccessUpdatePrfleMntr.isDisplayed();
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement popupBtnSuccessUpdatePrflMntr;

    public void clickPopupSuccessUpdatePrflMntr(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='swal2-confirm swal2-styled']")));
        popupBtnSuccessUpdatePrflMntr.click();
    }
}
