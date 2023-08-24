package step_definitions.MentorPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.MentorPage.MentorProfilePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class MentorUpdateProfileStepDef {
    public WebDriver webDriver;
    public MentorUpdateProfileStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("Mentor click icon pencil for edit on Mentor Profile Page")
    public void mentorClickIconPencilForEditOnMentorProfilePage() {
        MentorProfilePage mentorProfilePage = new MentorProfilePage(webDriver);
        mentorProfilePage.clickEditProfileBtn();
    }

    @Then("Mentor input update profile with valid data {string}, {string}, {string}")
    public void mentorInputUpdateProfileWithValidData(String name, String email, String password) {
        MentorProfilePage mentorProfilePage = new MentorProfilePage(webDriver);
        mentorProfilePage.setFieldUpdateNameMentor(name);
        mentorProfilePage.setFieldUpdateEmailMentor(email);
        mentorProfilePage.setFieldUpdatePswrdMentor(password);
    }

    @And("Mentor click Submit edit profile button")
    public void mentorClickSubmitEditProfileButton() {
        MentorProfilePage mentorProfilePage = new MentorProfilePage(webDriver);
        mentorProfilePage.clickUpdateProfileSubBtn();
    }

    @And("Mentor got pop up Success Update Profile OK")
    public void mentorGotPopUpSuccessUpdateProfileOK() {
        MentorProfilePage mentorProfilePage = new MentorProfilePage(webDriver);
        Assert.assertTrue(mentorProfilePage.verifySuccessUpdatePrflMntr());
        mentorProfilePage.clickPopupSuccessUpdatePrflMntr();
    }
}
