package step_definitions.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Admin.RegisterClassPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class RegisterClassSteps {
    public WebDriver webDriver;
//    public RegisterClassPage registerClassPage;
//    public LoginPage loginPage;
    public RegisterClassSteps(){
        super();
        this.webDriver = Hooks.webDriver;
        RegisterClassPage registerClassPage = new RegisterClassPage(webDriver);
//        LoginPage loginPage = new LoginPage(webDriver);

    }
    @When("Admin click Input Class button")
    public void adminClickInputClassButton() {
        RegisterClassPage registerClassPage = new RegisterClassPage(webDriver);
        registerClassPage.setInputClassPage();
    }

    @Then("Admin direct to inputclass page")
    public void adminDirectToInputclassPage() throws InterruptedException {
        RegisterClassPage registerClassPage = new RegisterClassPage(webDriver);
        Thread.sleep(10000);
        Assert.assertTrue(registerClassPage.verifyInputClassPage());
    }

    @When("Admin input class name {string}")
    public void adminInputClassName(String nama) {
        RegisterClassPage registerClassPage = new RegisterClassPage(webDriver);
        registerClassPage.setInputClassName(nama);
    }

    @And("Admin click add class button")
    public void adminClickAddClassButton() {
        RegisterClassPage registerClassPage = new RegisterClassPage(webDriver);
        registerClassPage.setAddBtnClass();
    }

    @Then("Admin got the pop up message Success Created")
    public void adminGotThePopUpMessageSuccessCreated() throws InterruptedException {
        RegisterClassPage registerClassPage = new RegisterClassPage(webDriver);
        Thread.sleep(3000);
        registerClassPage.setPopUpSuccessCreated();
        registerClassPage.setBtnOkClass();
        Assert.assertTrue(registerClassPage.verifyInputClassPage());
    }

    @Then("Admin got the pop up error message")
    public void adminGotThePopUpErrorMessage() throws InterruptedException {
        RegisterClassPage registerClassPage = new RegisterClassPage(webDriver);
        Thread.sleep(3000);
        registerClassPage.setPopUpFailed();
        registerClassPage.setBtnOkFailed();
    }

    @Then("Admin got the error message")
    public void adminGotTheErrorMessage() {
        RegisterClassPage registerClassPage = new RegisterClassPage(webDriver);
        registerClassPage.setErrorEmptyField();
    }
}
