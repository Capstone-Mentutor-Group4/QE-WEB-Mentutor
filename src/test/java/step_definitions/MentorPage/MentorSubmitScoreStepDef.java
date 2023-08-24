package step_definitions.MentorPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.MentorPage.MentorDetailTaskPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class MentorSubmitScoreStepDef {
    public WebDriver webDriver;
    public MentorSubmitScoreStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("Mentor click pencil icon button")
    public void mentorClickPencilIconButton() {
        MentorDetailTaskPage mentorDetailTaskPage = new MentorDetailTaskPage(webDriver);
        mentorDetailTaskPage.clickInputScoreBtn();
    }

    @Then("Mentor will input score {string} on submitted task")
    public void mentorWillInputScoreOnSubmittedTask(String score) {
        MentorDetailTaskPage mentorDetailTaskPage = new MentorDetailTaskPage(webDriver);
        mentorDetailTaskPage.setFieldInputScore(score);
    }

    @And("Mentor click submit score task")
    public void mentorClickSubmitScoreTask() {
        MentorDetailTaskPage mentorDetailTaskPage = new MentorDetailTaskPage(webDriver);
        mentorDetailTaskPage.clickSubmitInputScoreBtn();
    }

    @And("Mentor got pop up Success Submit Score Task OK")
    public void mentorGotPopUpSuccessSubmitScoreTaskOK() {
        MentorDetailTaskPage mentorDetailTaskPage = new MentorDetailTaskPage(webDriver);
        Assert.assertTrue(mentorDetailTaskPage.verifyPopupSuccessSubmitScore());
        mentorDetailTaskPage.clickPopupSubmitScoreOKBtn();
    }

    @And("Mentor got pop up Invalid Submit Score")
    public void mentorGotPopUpInvalidSubmitScore() {
        MentorDetailTaskPage mentorDetailTaskPage = new MentorDetailTaskPage(webDriver);
        Assert.assertTrue(mentorDetailTaskPage.verifyPopupInvalidSubmitScore());
        mentorDetailTaskPage.clickPopupInvalidScoreBtn();
    }
}
