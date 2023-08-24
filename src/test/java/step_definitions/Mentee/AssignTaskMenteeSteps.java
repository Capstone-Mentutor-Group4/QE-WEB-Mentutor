package step_definitions.Mentee;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Mentee.AssignTaskMenteePage;
import org.example.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class AssignTaskMenteeSteps {
    public WebDriver webDriver;
    public AssignTaskMenteeSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("Mentee already login")
    public void menteeAlreadyLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
        String email = "fahrul123@gmail.com";
        String password = "Fahrul123$";
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickBtnLogin();
        Thread.sleep(3000);
        Assert.assertTrue(loginPage.setPopUpSuccess());
        loginPage.setBtnOKPopUp();
    }

    @Then("Mentee direct to homementee page")
    public void menteeDirectToHomementeePage() throws InterruptedException {
        AssignTaskMenteePage assignTaskMenteePage = new AssignTaskMenteePage(webDriver);
        Thread.sleep(2000);
        Assert.assertTrue(assignTaskMenteePage.setVerifyTaskpage());
    }

    @When("Mentee click Task button")
    public void menteeClickTaskButton() {
        AssignTaskMenteePage assignTaskMenteePage = new AssignTaskMenteePage(webDriver);
        assignTaskMenteePage.setTaskBtn();
    }

    @And("Mentee click submit your task button")
    public void menteeClickSubmitYourTaskButton() throws InterruptedException {
        AssignTaskMenteePage assignTaskMenteePage = new AssignTaskMenteePage(webDriver);
        Thread.sleep(3000);
        assignTaskMenteePage.setSubmitUrTaskBtn();
    }

    @Then("Mentee direct to pop up Submit Your Task")
    public void menteeDirectToPopUpSubmitYourTask() throws InterruptedException {
        AssignTaskMenteePage assignTaskMenteePage = new AssignTaskMenteePage(webDriver);
        Thread.sleep(4000);
        assignTaskMenteePage.setPopUpSubmit();
    }

    @When("Mentee submit task {string}")
    public void menteeSubmitTask(String file) throws InterruptedException {
        AssignTaskMenteePage assignTaskMenteePage = new AssignTaskMenteePage(webDriver);
        Thread.sleep(2000);
        assignTaskMenteePage.setUploadTask(file);
    }

    @And("Mentee click submit button")
    public void menteeClickSubmitButton() {
        AssignTaskMenteePage assignTaskMenteePage = new AssignTaskMenteePage(webDriver);
        assignTaskMenteePage.setBtnSubmit();
    }

    @Then("Mentee got the pop Up task")
    public void menteeGotThePopUpTask() throws InterruptedException {
        AssignTaskMenteePage assignTaskMenteePage = new AssignTaskMenteePage(webDriver);
        Thread.sleep(3000);
        assignTaskMenteePage.setVerifyPopUpSuccTask();
        assignTaskMenteePage.setBtnOKTask();
    }
}
