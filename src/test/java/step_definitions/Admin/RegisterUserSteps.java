package step_definitions.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.LoginPage;
import org.example.Admin.RegisterUserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class RegisterUserSteps {

    public WebDriver webDriver;


    public RegisterUserSteps(){
        super();
        this.webDriver = Hooks.webDriver;

    }
    @Given("Admin already login")
    public void adminAlreadyLogin() {
        LoginPage loginPage = new LoginPage(webDriver);
       Assert.assertTrue(loginPage.verifyLoginPage());
       String email = "admin1.mentutor@gmail.com";
       String password = "Admin123$";
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickBtnLogin();
    }

    @When("Admin click Input Member button")
    public void adminClickInputMemberButton(){
        RegisterUserPage registerUserPage = new RegisterUserPage(webDriver);
        registerUserPage.setInputMemberbtn();
    }

    @Then("Admin direct to inputmember page")
    public void adminDirectToInputmemberPage() throws InterruptedException {
        RegisterUserPage registerUserPage = new RegisterUserPage(webDriver);
        Thread.sleep(5000);
        Assert.assertTrue(registerUserPage.verifyInputMemberPage());
    }

//    @When("Admin input data new user {string}, {string}, {string}, {}, {string}")
//    public void adminInputDataNewUser(String nama, String email, String role, String className,String password) throws InterruptedException {
//        RegisterPage registerPage = new RegisterPage(webDriver);
//        registerPage.setInputName(nama);
//        registerPage.setInputEmail(email);
//        registerPage.setInputRole(role);
//        Thread.sleep(3000);
//        registerPage.setInputClass(className);
//        registerPage.setInputPassword(password);
//    }

    @When("Admin input data new user {string} as name, {string} as email, {string} as role, {string} as class, {string} as password")
    public void adminInputDataNewUserAsNameAsEmailAsRoleAsClassAsPassword(String nama, String email, String role, String className,String password) throws InterruptedException {
        RegisterUserPage registerUserPage = new RegisterUserPage(webDriver);
        registerUserPage.setInputName(nama);
        registerUserPage.setInputEmail(email);
        registerUserPage.setInputRole(role);
        Thread.sleep(5000);
        registerUserPage.setInputClass(className);
        registerUserPage.setInputPassword(password);
    }

    @And("Admin click add button")
    public void adminClickAddButton() {
        RegisterUserPage registerUserPage = new RegisterUserPage(webDriver);
        registerUserPage.setAddMember();
    }


    @And("Admin will direct to homeadmin page")
    public void adminWillDirectToHomeadminPage(){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyHomeAdmin());
    }

}
