package step_definitions.Admin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Admin.DeleteClassPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class DeleteClassSteps {
    public static WebDriver webDriver;

    public DeleteClassSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("Admin direct to delete class pop Up")
    public void adminDirectToDeleteClassPopUp() {
        DeleteClassPage deleteClass = new DeleteClassPage(webDriver);
        deleteClass.setPopUpDelete();
    }

    @When("Admin click Yes button Delete Class")
    public void adminClickYesButtonDeleteClass() {
        DeleteClassPage deleteClass = new DeleteClassPage(webDriver);
        deleteClass.setYesBtn();
    }

    @Then("Admin got the pop Success deleted class")
    public void adminGotThePopSuccessDeletedClass() {
        DeleteClassPage deleteClass = new DeleteClassPage(webDriver);
        Assert.assertTrue(deleteClass.verifyPopUp());
        deleteClass.setOkBtnPopUp();
    }
}
