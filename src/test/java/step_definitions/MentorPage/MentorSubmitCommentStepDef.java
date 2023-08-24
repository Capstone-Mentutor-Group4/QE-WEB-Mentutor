package step_definitions.MentorPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.MentorPage.MentorForumPage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class MentorSubmitCommentStepDef {
    public WebDriver webDriver;
    public MentorSubmitCommentStepDef() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("Mentor input comment {string} on Forum Page")
    public void mentorInputCommentOnForumPage(String comment) {
        MentorForumPage mentorForumPage = new MentorForumPage(webDriver);
        mentorForumPage.setFieldInputComment(comment);
    }

    @Then("Mentor click send comment")
    public void mentorClickSendComment() {
        MentorForumPage mentorForumPage = new MentorForumPage(webDriver);
        mentorForumPage.clickSendCommentBtn();
    }
}
