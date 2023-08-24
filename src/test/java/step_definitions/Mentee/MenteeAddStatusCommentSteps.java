package step_definitions.Mentee;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Mentee.MenteeCommentPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class MenteeAddStatusCommentSteps {
    public WebDriver webDriver;
    public MenteeAddStatusCommentSteps(){
        super();
        this.webDriver = Hooks.webDriver;

    }
    @When("Mentee click Forum button")
    public void menteeClickForumButton() {
        MenteeCommentPage commentPage = new MenteeCommentPage(webDriver);
        commentPage.setForumBtn();
    }

    @Then("Mentee direct to forum page")
    public void menteeDirectToForumPage() throws InterruptedException {
        MenteeCommentPage commentPage = new MenteeCommentPage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(commentPage.setVerifyForummentee());
    }

    @When("Mentee input status {string}")
    public void menteeInputStatus(String status) throws InterruptedException {
        MenteeCommentPage commentPage = new MenteeCommentPage(webDriver);
        commentPage.setInputStatus(status);
        Thread.sleep(3000);
    }

    @And("Mentee click send button")
    public void menteeClickSendButton()  {
        MenteeCommentPage commentPage = new MenteeCommentPage(webDriver);
        commentPage.setSendBtn();
    }

    @Then("Mente got the pop up Successful")
    public void menteGotThePopUpSuccessful() throws InterruptedException{
        MenteeCommentPage commentPage = new MenteeCommentPage(webDriver);
        Thread.sleep(2000);
        commentPage.setPopUpSuccForum();
        commentPage.setBtnOkForum();
    }

    @When("Mentee input comment {string}")
    public void menteeInputComment(String comment) throws InterruptedException {
        MenteeCommentPage commentPage = new MenteeCommentPage(webDriver);
        Thread.sleep(5000);
        commentPage.setFieldComment(comment);
    }

    @And("Mentee click send comment button")
    public void menteeClickSendCommentButton() throws InterruptedException {
        MenteeCommentPage commentPage = new MenteeCommentPage(webDriver);
        Thread.sleep(5000);
        commentPage.setSendBtn();
    }
}
