package org.example.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateClassPage {
    public static WebDriver driver;
    public UpdateClassPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver =driver ;
    }

    @FindBy(xpath = "//div[@class='w-full h-[26rem] md:h-[18rem] bg-card rounded-xl md:rounded-[20px] text-xs md:text-lg overflow-auto mb-7']/div[2]//label[@id='edit-click']")
    private WebElement editBtn;
    @FindBy(xpath = "//div[@class='w-full h-[26rem] md:h-[18rem] bg-card rounded-xl md:rounded-[20px] text-xs md:text-lg overflow-auto mb-7']/div[2]//label[@id='icon-options']")
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
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='w-full h-[26rem] md:h-[18rem] bg-card rounded-xl md:rounded-[20px] text-xs md:text-lg overflow-auto mb-7']/div[2]//label[@id='icon-options']")));
        optionBtn.click();
    }

    public void setEditBtn() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='w-full h-[26rem] md:h-[18rem] bg-card rounded-xl md:rounded-[20px] text-xs md:text-lg overflow-auto mb-7']/div[2]//label[@id='edit-click']")));
        editBtn.click();
    }

    public void setInputClassName(String nama) {
        inputEditClassName.clear();
        inputEditClassName.sendKeys(nama);
    }

    public void setDropDownClass(String className) {
        Select a = new Select(dropDownClass);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='dropdown-status']")));
        dropDownClass.click();
        a.selectByVisibleText(className);
    }

    public void setSubmitBtnClass() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-submitEditClass")));
        submitBtnClass.click();
    }

    public void setPopUpSuccessClass() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='swal2-title']")));
        popUpSuccessClass.isDisplayed();
    }

    public void setPopUpFailed() {
        popUpFailed.isDisplayed();
    }

    public void setBtnOkUpdateClass() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='swal2-confirm swal2-styled']")));
        btnOkUpdateClass.click();
    }
    public void setBtnClose(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[.='✕']")));
        btnClose.click();
    }
    public void setBtnOkFailed(){
        btnOkFailed.click();
    }

    public boolean verifypopUpEdit(){
        return dropDownClass.isDisplayed();
    }

}
