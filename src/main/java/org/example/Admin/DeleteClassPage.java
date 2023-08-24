package org.example.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteClassPage {
    public static WebDriver driver;
    public DeleteClassPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver ;
    }
    @FindBy(xpath = "//div[@class='w-full h-[26rem] md:h-[18rem] bg-card rounded-xl md:rounded-[20px] text-xs md:text-lg overflow-auto mb-7']/div[2]//li[@id='delete-click']")
    private WebElement deleteBtn;
    @FindBy(xpath = "//div[@class='w-full h-[26rem] md:h-[18rem] bg-card rounded-xl md:rounded-[20px] text-xs md:text-lg overflow-auto mb-7']/div[2]//li[@id='delete-click']")
    private WebElement deleteBtnClass;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpDelete;
    @FindBy (xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement yesBtn;
    @FindBy (xpath = "//button[@class='swal2-cancel swal2-styled']")
    private WebElement cancelBtn;
    @FindBy (xpath = "//div[@class='swal2-html-container']")
    private WebElement popUpSucc;
    @FindBy (xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement okBtnPopUp;

    public void setDeleteBtn() {
        deleteBtnClass.click();
    }

    public void setPopUpDelete() {
        popUpDelete.click();
    }

    public void setYesBtn() {
        yesBtn.click();
    }

    public void setCancelBtn() {
        cancelBtn.click();
    }

    public void setOkBtnPopUp() {
        okBtnPopUp.click();
    }
    public boolean verifyPopUp(){
        return popUpSucc.isDisplayed();
    }
}
