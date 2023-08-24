package org.example.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UpdateClassPage {
    public static WebDriver driver;
    public UpdateClassPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver =driver ;
    }

    @FindBy(xpath = "//div[@class='w-full h-[26rem] md:h-[18rem] bg-card rounded-xl md:rounded-[20px] text-xs md:text-lg overflow-auto mb-7']/div[2]//label[@id='edit-click']")
    private WebElement editBtn;
    @FindBy(id = "icon-options")
    private WebElement optionBtn;
    @FindBy(xpath = "//div[@class='flex flex-col space-y-2 my-5']/input[@id='input-class']")
    private WebElement inputEditClassName;
    @FindBy(xpath = "//select[@id='dropdown-status']")
    private WebElement dropDownClass;
    @FindBy(id = "btn-submitEditClass")
    private WebElement submitBtnClass;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpSuccessClass;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOkUpdateClass;
    @FindBy(xpath = "//label[.='✕']")
    private WebElement btnClose;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpFailed;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOkFailed;

    public void setOptionBtn() {
        optionBtn.click();
    }

    public void setEditBtn() {
        editBtn.click();
    }

    public void setInputClassName(String nama) {
        inputEditClassName.clear();
        inputEditClassName.sendKeys(nama);
    }

    public void setDropDownClass(String className) {
        Select a = new Select(dropDownClass);
        dropDownClass.click();
        a.selectByVisibleText(className);
    }

    public void setSubmitBtnClass() {
        submitBtnClass.click();
    }

    public void setPopUpSuccessClass() {
        popUpSuccessClass.isDisplayed();
    }

    public void setPopUpFailed() {
        popUpFailed.isDisplayed();
    }

    public void setBtnOkUpdateClass() {
        btnOkUpdateClass.click();
    }
    public void setBtnClose(){
        btnClose.click();
    }
    public void setBtnOkFailed(){
        btnOkFailed.click();
    }

    public boolean verifypopUpEdit(){
        return dropDownClass.isDisplayed();
    }

}
