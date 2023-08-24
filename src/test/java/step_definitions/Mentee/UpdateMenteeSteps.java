package step_definitions.Mentee;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Mentee.UpdateMenteePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class UpdateMenteeSteps {
    public WebDriver webDriver;
    public UpdateMenteeSteps(){
        super();
        this.webDriver = Hooks.webDriver;

    }
    @When("Mentee click Profile button")
    public void menteeClickProfileButton() {
        UpdateMenteePage updateMenteePage = new UpdateMenteePage(webDriver);
        updateMenteePage.setProfileBtn();
    }

    @Then("Mentee direct to profile page")
    public void menteeDirectToProfilePage() {
        UpdateMenteePage updateMenteePage = new UpdateMenteePage(webDriver);
        Assert.assertTrue(updateMenteePage.setVerifyProfileMentee());
    }

    @When("Mentee click update button")
    public void menteeClickUpdateButton() {
        UpdateMenteePage updateMenteePage = new UpdateMenteePage(webDriver);
        updateMenteePage.setBtnUpdateProfile();
    }

    @And("Mentee input valid data {string}, {string}, {string}")
    public void menteeInputValidData(String name, String email, String password) {
        UpdateMenteePage updateMenteePage = new UpdateMenteePage(webDriver);
        updateMenteePage.setInputName(name);
        updateMenteePage.setInputEmail(email);
        updateMenteePage.setInputPassword(password);

    }

    @And("Mentee click submit button profile")
    public void menteeClickSubmitButtonProfile() {
        UpdateMenteePage updateMenteePage = new UpdateMenteePage(webDriver);
        updateMenteePage.setBtnSubmit();
    }

    @Then("Mentee got the pop up Success Update Profile")
    public void menteeGotThePopUpSuccessUpdateProfile() throws InterruptedException {
        UpdateMenteePage updateMenteePage = new UpdateMenteePage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(updateMenteePage.verifyPopUpSucc());
        updateMenteePage.setBtnOkSuccess();
    }

    @Then("Mentee got the pop up")
    public void menteeGotThePopUp() throws InterruptedException {
        UpdateMenteePage updateMenteePage = new UpdateMenteePage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(updateMenteePage.verifyPopUpSucc());
        updateMenteePage.setBtnOkSuccess();
    }
}
