package org.example.Mentee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignTaskMenteePage {
    public static WebDriver driver;

    public AssignTaskMenteePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public static String pathFile = System.getProperty("user.dir") + "/src/test/resources/features/FileMentee/";
    @FindBy(xpath = "//h3[contains(.,'Task')]")
    private WebElement taskBtn;
    @FindBy(xpath = "//div[@class='w-full h-screen bg-main overflow-auto']")
    private WebElement verifyTaskpage;
    @FindBy(xpath = "//div[@class='pb-9']/div[1]//label[@id='btn-submitTask']")
    private WebElement submitUrTaskBtn;
    @FindBy(xpath = "//h3[@class='font-medium text-lg text-putih mb-3']")
    private WebElement popUpSubmit;
    @FindBy(xpath = "//input[@id='uploadfile-btn']")
    private WebElement uploadTask;
    @FindBy(xpath = "//button[@id='btn-submitTask']")
    private WebElement btnSubmit;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement verifyPopUpSuccTask;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOKTask;
    @FindBy(xpath = "//label[@id='btn-close']")
    private WebElement closeBtn;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpFailed;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOKFailed;



    public void setTaskBtn() {
        taskBtn.click();
    }

    public boolean setVerifyTaskpage() {
        return verifyTaskpage.isDisplayed();
    }

    public void setSubmitUrTaskBtn() {
        submitUrTaskBtn.click();
    }

    public void setPopUpSubmit() {
        popUpSubmit.isDisplayed();
    }

    public void setUploadTask(String file) {
        uploadTask.sendKeys(pathFile+""+file+"");
    }

    public void setBtnSubmit() {
        btnSubmit.click();
    }

    public void setVerifyPopUpSuccTask() {
        verifyPopUpSuccTask.isDisplayed();
    }
    public void setVerifyPopUpFailed(){
        popUpFailed.isDisplayed();
    }

    public void setBtnOKTask() {
        btnOKTask.click();
    }
}
