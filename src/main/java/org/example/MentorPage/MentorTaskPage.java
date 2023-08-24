package org.example.MentorPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentorTaskPage {
    public static WebDriver driver;

    public MentorTaskPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static String pathFile = System.getProperty("user.dir") + "/src/test/resources/File/";

    @FindBy(xpath = "//input[@id='uploadfile-btn']")
    private WebElement uploadNewFileBtn;

    @FindBy(xpath = "//input[@id='uploadimage-btn']")
    private WebElement uploadNewImagesBtn;

    @FindBy(xpath = "//button[@id='input-file']")
    private WebElement inputAddBtn;

    @FindBy(xpath = "//input[@name='title']")
    private WebElement fieldTitle;

    @FindBy(xpath = "//textarea[@id='input-desc']")
    private WebElement fieldDesc;

    @FindBy(xpath = "//input[@id='input-date']")
    private WebElement fieldDate;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpTaskCreated;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement popUpTaskOKBtn;

    @FindBy(xpath = "//p[.='Title is required']")
    private WebElement errorTextTitle;

    @FindBy(xpath = "//p[.='Description is required']")
    private WebElement errorTextDesc;

    @FindBy(xpath = "//p[.='Due_date is required']")
    private WebElement errorTextDate;

    @FindBy(xpath = "//p[.='File is required']")
    private WebElement errorTextFile;

    @FindBy(xpath = "//p[.='Image is required']")
    private WebElement errorTextImages;

    @FindBy(xpath = "//div[@class='swal2-popup swal2-modal swal2-icon-error swal2-show']")
    private WebElement popUpInvalidInputTask;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement popUpInvalidTaskBtn;

    //3DOT MENU BUTTON PATH
    @FindBy(xpath = "(//label[@id='icon-options'])[1]")
    private WebElement dropDownMentorBtn;

    @FindBy(xpath = "(//label[@for='modal-edit-task'])[1]")
    private WebElement dropEditMentorBtn;

    @FindBy(xpath = "(//li[@id='delete-click'])[1]")
    private WebElement dropDeleteMentorBtn;

    //UPDATE PATH
    @FindBy(css = "[placeholder='Title']")
    private WebElement fieldUpdateTitle;

    @FindBy(css = "#input-description")
    private WebElement fieldUpdateDesc;

    @FindBy(css = "#input-due_date")
    private WebElement fieldUpdateDate;

    @FindBy(css = "[for='upload-btn'] > .text-xl")
    private WebElement updateFileBtn;

    @FindBy(css = "[for='upload-btn-image'] > .text-xl")
    private WebElement updateImagesBtn;

    @FindBy(css = "#btn-submitTask")
    private WebElement submitUpTaskBtn;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popupSuccesUpdateTask;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement popupUpdateTaskOKBtn;

    //DELETE PATH
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement popupConfirmDeleteTask;

    @FindBy(xpath = "//button[@class='swal2-cancel swal2-styled']")
    private WebElement popupCancelDeleteTaskBtn;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement popupYesDeleteTaskBtn;

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement popupSuccesDeleteTask;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement popupDeleteTaskOKBtn;



    //VERIFY ERROR TASK PAGE
    public boolean verifyErrorTextTitle(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Title is required']")));
        return errorTextTitle.isDisplayed();
    }
    public boolean verifyErrorTextDesc(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Description is required']")));
        return errorTextDesc.isDisplayed();
    }

    public boolean verifyErrorTextDate(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Due_date is required']")));
        return errorTextDate.isDisplayed();
    }

    public boolean verifyErrorTextFile(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='File is required']")));
        return errorTextFile.isDisplayed();
    }

    public boolean verifyErrorTextImages(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Images is required']")));
        return errorTextImages.isDisplayed();
    }

    //STEP MENTOR CREATE TASK PAGE
    public void setFieldTitle(String title){
        fieldTitle.sendKeys(title);
    }

    public void setFieldDesc(String desc){
        fieldDesc.sendKeys(desc);
    }

    public void setFieldDate(String date){
        fieldDate.sendKeys(date);
    }

    public void setUploadNewFileBtn(String file){
        uploadNewFileBtn.sendKeys(pathFile+""+file+"");
    }

    public void setUploadNewImagesBtn(String images){
        uploadNewImagesBtn.sendKeys(pathFile+""+images+"");
    }

    public void clickAddTaskBtn(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='input-file']")));
        inputAddBtn.click();
    }

    public boolean setPopupCreateTaskSuccess(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='swal2-title']")));
        return popUpTaskCreated.isDisplayed();
    }

    public void clickPopupTaskCreatedOK(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='swal2-confirm swal2-styled']")));
        popUpTaskOKBtn.click();
    }

    public boolean setPopupInvalidInputTask(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='swal2-popup swal2-modal swal2-icon-error swal2-show']")));
        return popUpInvalidInputTask.isDisplayed();
    }

    public void clickPopupInvalidInputTask(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='swal2-confirm swal2-styled']")));
        popUpInvalidTaskBtn.click();
    }

    //STEP MENTOR UPDATE TASK
    public void clickDropdownMentorBtn(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@id='icon-options'])[1]")));
        dropDownMentorBtn.click();
    }

    public void clickDropEditMentorBtn(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@for='modal-edit-task'])[1]")));
        dropEditMentorBtn.click();
    }

    public void clickDropDeleteMentorBtn(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@id='delete-click'])[1]")));
        dropDeleteMentorBtn.click();
    }

    public void setFieldUpdateTitle(String title){
        fieldUpdateTitle.clear();
        fieldUpdateTitle.sendKeys(title);
    }

    public void setFieldUpdateDesc(String desc){
        fieldUpdateDesc.clear();
        fieldUpdateDesc.sendKeys(desc);
    }

    public void setFieldUpdateDate(String date){
        fieldUpdateDate.clear();
        fieldUpdateDate.sendKeys(date);
    }

    public void setFieldUpdateFile(String file){
        updateFileBtn.sendKeys(pathFile+""+file+"");
    }

    public void setFieldUpdateImages(String images){
        updateImagesBtn.sendKeys(pathFile+""+images+"");
    }

    public void clickSubmitUpTaskBtn(){
        submitUpTaskBtn.click();
    }

    public void clickUpdateTaskOKBtn(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='swal2-confirm swal2-styled']")));
        popupUpdateTaskOKBtn.click();
    }

    public boolean verifyPopupSuccesUpdateTask(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='swal2-title']")));
        return popupSuccesUpdateTask.isDisplayed();
    }

    //DELETE TASK BY MENTOR
    public boolean verifyConfirmDeleteTask(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='swal2-html-container']")));
        return popupConfirmDeleteTask.isDisplayed();
    }

    public void clickYesDeleteTask(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']")));
        popupYesDeleteTaskBtn.click();
    }

    public void clickCancelDeleteTask(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='swal2-cancel swal2-styled']")));
        popupCancelDeleteTaskBtn.click();
    }

    public boolean verifySuccesDeleteTask(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='swal2-html-container']")));
        return popupSuccesDeleteTask.isDisplayed();
    }

    public void clickPopupDeleteTaskOKBtn() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']")));
        popupDeleteTaskOKBtn.click();
    }

}
