package step_definitions.MentorPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.LoginPage;
import org.example.MentorPage.MentorHomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class MentorHomeStepDef {
    public WebDriver webDriver;
    public MentorHomeStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("Mentor Already Login")
    public void mentorAlreadyLogin() throws InterruptedException {
        LoginPage loginpage = new LoginPage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(loginpage.verifyLoginPage());
        String email = "khairul123@gmail.com";
        String password = "Khairul123$";
        loginpage.setFieldEmail(email);
        loginpage.setFieldPassword(password);
        loginpage.clickBtnLogin();
    }

    @Then("Mentor got the pop up message login successful")
    public void userGotThePopUpMessageLoginSuccessful() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(loginPage.setPopUpSuccess());
        loginPage.setBtnOKPopUp();
    }

    @And("Mentor will direct to homementor page")
    public void userWillDirectToHomementorPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyHomeMentor());
    }

    @When("Mentor click View All task button")
    public void mentorClickViewAllTaskButton() {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        mentorHomePage.clickViewTaskBtn();
    }

    @When("Mentor click icon Task Button")
    public void mentorClickIconTaskButton() {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        mentorHomePage.clickInputTaskBtn();
    }

    @Then("Mentor direct to Taskpage")
    public void mentorDirectToTaskpage() throws InterruptedException {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        Assert.assertTrue(mentorHomePage.verifyCreateTaskPage());
        Thread.sleep(3000);
    }

    @When("Mentor click see Submitted Task")
    public void mentorClickSeeSubmittedTask() {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        mentorHomePage.clickSubmitTaskBtn();
    }

    @Then("Mentor direct to Detail Taskpage")
    public void mentorDirectToDetailTaskpage() throws InterruptedException {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        Assert.assertTrue(mentorHomePage.verifyDetailTaskPage());
        Thread.sleep(3000);
    }

    @When("Mentor click Forum Button on homementor page")
    public void mentorClickForumButtonOnHomementorPage() {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        mentorHomePage.clickForumMentorBtn();
    }

    @Then("Mentor direct to Class Forum Page")
    public void mentorDirectToClassForumPage() throws InterruptedException {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        Assert.assertTrue(mentorHomePage.verifyClassForumPageMentor());
        Thread.sleep(3000);
    }

    @When("Mentor click User Profile Button on homementor page")
    public void mentorClickUserProfileButtonOnHomementorPage() {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        mentorHomePage.clickProfileUserMntrBtn();
    }

    @When("Mentor click Profile Button on homementor page")
    public void mentorClickProfileButtonOnHomementorPage() {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        mentorHomePage.clickProfileMentorBtn();
    }

    @Then("Mentor direct to My Profile Page User Mentor")
    public void mentorDirectToNameProfilePage() throws InterruptedException {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        Assert.assertTrue(mentorHomePage.verifyUserProfileNameMentor());
        Thread.sleep(3000);
    }

    @Then("Mentor direct to My Profile Page")
    public void mentorDirectToMyProfilePage() throws InterruptedException {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        Assert.assertTrue(mentorHomePage.verifyUserProfileMentor());
        Thread.sleep(3000);
    }

    @When("Mentor click Logout Button on homementor page")
    public void mentorClickLogoutButtonOnHomementorPage() {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        mentorHomePage.clickLogoutMentorBtn();
    }

    @Then("Mentor got pop up message for logout")
    public void mentorGotPopUpMessageForLogout() throws InterruptedException {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        Thread.sleep(3000);
        mentorHomePage.clickConfirmLogoutBtn();
    }

    @And("Mentor got the pop up message logout successful")
    public void mentorGotThePopUpMessageLogoutSuccessful() throws InterruptedException {
        MentorHomePage mentorHomePage = new MentorHomePage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(mentorHomePage.setPopupLogoutSuccess());
        mentorHomePage.clickPopupLogoutBtn();
    }

    @And("Mentor will direct to Mentutor Login Page")
    public void mentorWillDirectToMentutorLoginPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }
}
