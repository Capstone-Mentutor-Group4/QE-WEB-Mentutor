package org.example.MentorPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentorForumPage {
    public static WebDriver driver;

    public MentorForumPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[1]//input[@id='Input-comment']")
    private WebElement fieldInputComment;

    public void setFieldInputComment(String comment){
        fieldInputComment.clear();
        fieldInputComment.sendKeys(comment);
    }

    @FindBy(xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[1]//button[@id='btn-sendComment']")
    private WebElement sendCommentBtn;

    public void clickSendCommentBtn(){
        sendCommentBtn.click();
    }

    @FindBy(xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']//div[3]/p[@id='btn-showcomments']")
    private WebElement loadCommentBtn;

    public void clickLoadCommentBtn(){
        loadCommentBtn.click();
    }

    @FindBy(xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']//div[3]/p[@id='btn-hidecomments']")
    private WebElement hideCommentBtn;

    public void clickHideCommentBtn(){
        hideCommentBtn.click();
    }
}
