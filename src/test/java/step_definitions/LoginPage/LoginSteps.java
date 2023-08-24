package step_definitions.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class LoginSteps {
    public WebDriver webDriver;

    public LoginSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User already on Login Page Mentutor")
    public void userAlreadyOnLoginPageMentutor() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @When("User input email {string} and password {string}")
    public void userInputValidEmailAndPassword(String email, String password) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);

    }

    @And("User click button login")
    public void userClickButtonLogin() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickBtnLogin();
    }

    @Then("User got the pop up message login successful")
    public void userGotThePopUpMessageLoginSuccessful() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(loginPage.setPopUpSuccess());
        loginPage.setBtnOKPopUp();
    }

    @And("User will direct to homeadmin page")
    public void userWillDirectToHomeadminPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyHomeAdmin());
    }

    @Then("User got the pop up message invalid email or password")
    public void userGotThePopUpMessageInvalidEmailOrPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(loginPage.setPopUpFailed());
        loginPage.setBtnOKFailPopup();
    }

    @And("User will direct to homementor page")
    public void userWillDirectToHomementorPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyHomeMentor());
    }

    @And("User will direct to homementee page")
    public void userWillDirectToHomementeePage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyHomeMentee());
    }

    @Then("User see error need password on login page")
    public void userSeeErrorOnLoginPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyNoPassText());
    }

    @Then("User see error need email on login page")
    public void userSeeErrorNeedEmailOnLoginPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyNoEmailText());
    }
}