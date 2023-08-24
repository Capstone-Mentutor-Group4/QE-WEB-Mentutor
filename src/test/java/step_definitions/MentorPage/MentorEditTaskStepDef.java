package step_definitions.MentorPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.MentorPage.MentorTaskPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class MentorEditTaskStepDef {
    public WebDriver webDriver;
    public MentorEditTaskStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("Mentor click tri-dot icon button to show dropdown menu")
    public void mentorClickTriDotIconButtonToShowDropdownMenu() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        mentorTaskPage.clickDropdownMentorBtn();
    }

    @Then("Mentor cick menu Edit")
    public void mentorCickMenuEdit() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        mentorTaskPage.clickDropEditMentorBtn();
    }

    @And("Mentor input update valid data {string} as title, {string} as description, {string} as due date")
    public void mentorInputUpdateValidDataAsTitleAsDescriptionAsDueDateAsFileAndAsImages(String title, String desc, String date){
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        mentorTaskPage.setFieldUpdateTitle(title);
        mentorTaskPage.setFieldUpdateDesc(desc);
        mentorTaskPage.setFieldUpdateDate(date);
    }

    @And("Mentor click Submit edit task Button")
    public void mentorClickSubmitEditTaskButton() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        mentorTaskPage.clickSubmitUpTaskBtn();
    }

    @And("Mentor got pop up Task Updated OK")
    public void mentorGotPopUpTaskUpdatedOK() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        Assert.assertTrue(mentorTaskPage.verifyPopupSuccesUpdateTask());
        mentorTaskPage.clickUpdateTaskOKBtn();
    }

    @Then("Mentor click menu Delete")
    public void mentorClickMenuDelete() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        mentorTaskPage.clickDropDeleteMentorBtn();
    }

    @And("Mentor got pop up Yes Delete confirmation")
    public void mentorGotPopUpYesDeleteConfirmation() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        Assert.assertTrue(mentorTaskPage.verifyConfirmDeleteTask());
        mentorTaskPage.clickYesDeleteTask();
    }

    @And("Mentor got pop up Task Delete OK")
    public void mentorGotPopUpTaskDeleteOK() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        Assert.assertTrue(mentorTaskPage.verifySuccesDeleteTask());
        mentorTaskPage.clickPopupDeleteTaskOKBtn();
    }

    @And("Mentor got pop up Cancel Delete confirmation")
    public void mentorGotPopUpCancelDeleteConfirmation() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        Assert.assertTrue(mentorTaskPage.verifyConfirmDeleteTask());
        mentorTaskPage.clickCancelDeleteTask();
    }
}
