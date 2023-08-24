package org.example.Mentee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenteeCommentPage {
    public static WebDriver driver;
    public MenteeCommentPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver =driver ;
    }



    public static String pathImg = System.getProperty("user.dir") + "/src/test/resources/ImagesMentee/";

    @FindBy(xpath = "//h3[.='Forum']")
    private WebElement forumBtn;
    @FindBy(xpath = "//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-2']")
    private WebElement verifyForummentee;
    @FindBy(xpath = "//input[@id='input-status']")
    private WebElement inputStatus;
    @FindBy(xpath = "//button[@id='btn-send']")
    private WebElement sendBtn;
    @FindBy(xpath = "//label[@id='btn-upload-gbr']")
    private WebElement uploadImg;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpSuccForum;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOkForum;
    @FindBy(xpath = "//div[@class='space-y-8']/div[1]//input[@id='Input-comment']")
    private WebElement fieldComment;
    @FindBy(xpath = "//div[@class='space-y-8']/div[1]//button[@id='btn-sendComment']")
    private WebElement sendComment;


    public void setForumBtn() {
        forumBtn.click();
    }

    public boolean setVerifyForummentee() {
        return verifyForummentee.isDisplayed();
    }

    public void setInputStatus(String status) {
        inputStatus.sendKeys(status);
    }

//    public void setUploadImg(String img) throws InterruptedException {
////        WebDriverWait wait = new WebDriverWait(driver,20);
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='btn-upload-gbr']")));
//        uploadImg.click();
//        Thread.sleep(5000);
//        uploadImg.sendKeys(pathImg + ""+img+"");
//    }

    public void setSendBtn() {
        sendBtn.click();
    }

    public void setPopUpSuccForum() {
        popUpSuccForum.isDisplayed();
    }

    public void setBtnOkForum() {
        btnOkForum.click();
    }
    public void setFieldComment(String comment){
        fieldComment.sendKeys(comment);
    }

    public void setSendComment() {
        sendComment.click();
    }
}
