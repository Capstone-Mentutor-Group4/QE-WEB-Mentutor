package step_definitions.MentorPage;

import io.cucumber.java.en.And;
import org.example.MentorPage.MentorTaskPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class MentorTaskStepDef {
    public WebDriver webDriver;
    public MentorTaskStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("Mentor input data {string} as title, {string} as description, {string} as due date, {string} as attachment, and {string} as images")
    public void mentorInputDataAsTitleAsDescriptionAsDueDateAsAttachmentAndAsImages(String title, String desc, String date, String file, String images){
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        mentorTaskPage.setFieldTitle(title);
        mentorTaskPage.setFieldDesc(desc);
        mentorTaskPage.setFieldDate(date);
        mentorTaskPage.setUploadNewFileBtn(file);
        mentorTaskPage.setUploadNewImagesBtn(images);
    }

    @And("Mentor click Add button for create new task")
    public void mentorClickAddButtonForCreateNewTask() throws InterruptedException {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        Thread.sleep(10000);
        mentorTaskPage.clickAddTaskBtn();
    }

    @And("Mentor got pop up Task Created OK")
    public void mentorGotPopUpTaskCreatedOK() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        Assert.assertTrue(mentorTaskPage.setPopupCreateTaskSuccess());
        mentorTaskPage.clickPopupTaskCreatedOK();
    }

    @And("Mentor see error Text Title Required on Taskpage")
    public void mentorSeeErrorTextTitleRequiredOnTaskpage() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        Assert.assertTrue(mentorTaskPage.verifyErrorTextTitle());
    }

    @And("Mentor see error Text Description Required on Taskpage")
    public void mentorSeeErrorTextDescriptionRequiredOnTaskpage() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        Assert.assertTrue(mentorTaskPage.verifyErrorTextDesc());
    }

    @And("Mentor see error Text Due_date Required on Taskpage")
    public void mentorSeeErrorTextDue_dateRequiredOnTaskpage() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        Assert.assertTrue(mentorTaskPage.verifyErrorTextDate());
    }

    @And("Mentor see error Text File Required on Taskpage")
    public void mentorSeeErrorTextFileRequiredOnTaskpage() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        Assert.assertTrue(mentorTaskPage.verifyErrorTextFile());
    }

    @And("Mentor see error Text Images Required on Taskpage")
    public void mentorSeeErrorTextImagesRequiredOnTaskpage() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        Assert.assertTrue(mentorTaskPage.verifyErrorTextImages());
    }

    @And("Mentor got pop up Invalid Input Client on Taskpage")
    public void mentorGotPopUpInvalidInputClientOnTaskpage() {
        MentorTaskPage mentorTaskPage = new MentorTaskPage(webDriver);
        Assert.assertTrue(mentorTaskPage.setPopupInvalidInputTask());
        mentorTaskPage.clickPopupInvalidInputTask();
    }
}
