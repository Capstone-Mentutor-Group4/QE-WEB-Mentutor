package org.example.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteUserPage {
    public static WebDriver driver;
    public DeleteUserPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver =driver ;
    }

    @FindBy(xpath = "//div[4]//label[@id='icon-options']")
    private WebElement optionBtnUser;

    @FindBy(xpath = "//div[@class='w-full h-[30rem] md:h-[21rem] bg-card rounded-xl md:rounded-[20px]  text-xs md:text-base overflow-auto mb-5']/div[2]//li[@id='delete-click']")
    private WebElement deleteBtn;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement verifyPopDialogue;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnYes;
    @FindBy(xpath = "//button[@class='swal2-cancel swal2-styled']")
    private WebElement btnCancel;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement verifyPopUpSucc;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement buttonOk;

    public void setOptionBtnUser() {
        optionBtnUser.click();
    }

    public void setDeleteBtn() {
        deleteBtn.click();
    }

    public void setBtnYes() {
        btnYes.click();
    }

    public void setBtnCancel() {
        btnCancel.click();
    }

    public void setButtonOk() {
        buttonOk.click();
    }

    public boolean setverifyPopupSucc(){
        return verifyPopUpSucc.isDisplayed();
    }

    public boolean verifyPopUpDialogue() {
        return verifyPopDialogue.isDisplayed();
    }
}
