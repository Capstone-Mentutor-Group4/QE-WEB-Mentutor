package step_definitions.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Admin.DeleteUserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class DeleteUserSteps {
    public WebDriver webDriver;
    public DeleteUserSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("Admin click delete button")
    public void adminClickDeleteButton() {
        DeleteUserPage deleteUser = new DeleteUserPage(webDriver);
        deleteUser.setDeleteBtn();
    }

    @Then("Admin direct to delete user pop Up")
    public void adminDirectToDeleteUserPopUp() throws InterruptedException {
        DeleteUserPage deleteUser = new DeleteUserPage(webDriver);
        Thread.sleep(1000);
        Assert.assertTrue(deleteUser.verifyPopUpDialogue());
    }

    @When("Admin click Yes Button")
    public void adminClickYesButton() {
        DeleteUserPage deleteUser = new DeleteUserPage(webDriver);
        deleteUser.setBtnYes();
    }

    @Then("Admin got the pop Success deleted user")
    public void userDeletedByAdmin() {
        DeleteUserPage deleteUser = new DeleteUserPage(webDriver);
        Assert.assertTrue(deleteUser.setverifyPopupSucc());
        deleteUser.setButtonOk();
    }

    @When("Admin click Cancel Button")
    public void adminClickCancelButton() {
        DeleteUserPage deleteUser = new DeleteUserPage(webDriver);
        deleteUser.setBtnCancel();
    }
}
