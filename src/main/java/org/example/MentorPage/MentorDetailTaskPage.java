package org.example.MentorPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentorDetailTaskPage {
    public static WebDriver driver;

    public MentorDetailTaskPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//label[@class='hover:text-button px-4 text-sm text-abu cursor-pointer']")
    private WebElement inputScoreBtn;
    public void clickInputScoreBtn(){
        inputScoreBtn.click();
    }

    @FindBy(xpath = "//input[@id='input-score']")
    private WebElement fieldInputScore;

    public void setFieldInputScore(String score){
        fieldInputScore.clear();
        fieldInputScore.sendKeys(score);
    }

    @FindBy(xpath = "//button[@id='btn-submitEditScore']")
    private WebElement submitInputScoreBtn;

    public void clickSubmitInputScoreBtn(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-submitEditScore']")));
        submitInputScoreBtn.click();
    }

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpSuccessSubmitScore;

    public boolean verifyPopupSuccessSubmitScore(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='swal2-title']")));
        return popUpSuccessSubmitScore.isDisplayed();
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement popUpSubmitScoreOKBtn;

    public void clickPopupSubmitScoreOKBtn(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='swal2-confirm swal2-styled']")));
        popUpSubmitScoreOKBtn.click();
    }

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpInvalidSubmitScore;

    public boolean verifyPopupInvalidSubmitScore(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='swal2-title']")));
        return popUpSuccessSubmitScore.isDisplayed();
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement popUpInvalidScoreBtn;

    public void clickPopupInvalidScoreBtn(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='swal2-confirm swal2-styled']")));
        popUpInvalidScoreBtn.click();
    }
}