package org.example.MentorPage;

import org.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentorHomePage {
    public static WebDriver driver;

    public MentorHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver ;
    }

    @FindBy(xpath = "//p[@id='view-task']")
    private WebElement viewTaskBtn;

    @FindBy(xpath = "//div[@class='space-y-6']/div[1]//p[@id='click-submittedtask']")
    private WebElement submittedTaskBtn;

    @FindBy(xpath = "//img[@id='gbr-profile']")
    private WebElement profileUserMentorBtn;

    @FindBy(xpath = "//div[@id='nav-inputtask']")
    private WebElement inputTaskBtn;

    @FindBy(xpath = "//div[@id='nav-forummentor']")
    private WebElement forumMentorBtn;

    @FindBy(xpath = "//div[@id='nav-profile']")
    private WebElement profileMentorBtn;

    @FindBy(xpath = "//div[@id='btn-logout']")
    private WebElement logoutMentorBtn;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement confirmLogoutBtn;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpLogoutSuccess;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement popUpLogoutOKBtn;

    @FindBy(xpath = "//p[@class='text-abu text-xs']")
    private WebElement createTask;

    @FindBy(xpath = "//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-1']")
    private WebElement detailTask;

    @FindBy(xpath = "//p[@class='text-abu font-light text-[8px] md:text-sm']")
    private WebElement forumClassMentor;

    @FindBy(xpath = "//span[@class='text-abu font-light capitalize']")
    private WebElement userProfileNameMentor;

    @FindBy(xpath = "//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-2']")
    private WebElement userProfileMentor;


// STEP MENTOR PAGE
    public void clickViewTaskBtn(){
        viewTaskBtn.click();
    }

    public void clickSubmitTaskBtn(){
        submittedTaskBtn.click();
    }

    public void clickProfileUserMntrBtn(){
        profileUserMentorBtn.click();
    }

    public void clickInputTaskBtn(){
        inputTaskBtn.click();
    }

    public void clickForumMentorBtn(){
        forumMentorBtn.click();
    }

    public void clickProfileMentorBtn(){
        profileMentorBtn.click();
    }

    public void clickLogoutMentorBtn(){
        logoutMentorBtn.click();
    }

    public void clickConfirmLogoutBtn(){
        confirmLogoutBtn.click();
    }

    public void clickPopupLogoutBtn(){
        popUpLogoutOKBtn.click();
    }

    public boolean setPopupLogoutSuccess(){
        return popUpLogoutSuccess.isDisplayed();
    }

    public boolean verifyCreateTaskPage(){
        return createTask.isDisplayed();
    }

    public boolean verifyDetailTaskPage(){
        return detailTask.isDisplayed();
    }

    public boolean verifyClassForumPageMentor(){
        return forumClassMentor.isDisplayed();
    }

    public boolean verifyUserProfileNameMentor(){
        return userProfileNameMentor.isDisplayed();
    }

    public boolean verifyUserProfileMentor(){
        return userProfileMentor.isDisplayed();
    }
}

