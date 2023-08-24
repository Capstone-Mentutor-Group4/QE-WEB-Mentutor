package step_definitions.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Admin.UpdateUserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class UpdateUserSteps {
    public WebDriver webDriver;
    public UpdateUserSteps(){
        super();
        this.webDriver = Hooks.webDriver;
        UpdateUserPage updateUserPage = new UpdateUserPage(webDriver);
    }
    @When("Admin click option update button")
    public void adminClickOptionUpdateButton() {
        UpdateUserPage updateUserPage = new UpdateUserPage(webDriver);
        updateUserPage.setOptionBtnUser();
    }

    @And("Admin click edit update button")
    public void adminClickEditUpdateButton() {
        UpdateUserPage updateUserPage = new UpdateUserPage(webDriver);
        updateUserPage.setEditBtnUser();
    }

    @Then("Admin direct to edit profile user pop up")
    public void adminDirectToEditProfileUserPopUp() {
        UpdateUserPage updateUserPage = new UpdateUserPage(webDriver);
        updateUserPage.setVerifyPopUpUpdateUser();
    }

    @When("Admin input valid data user {string} as name, {string} as email, {string} as password, and {string} as class")
    public void adminInputValidDataUserAsNameAsEmailAsPasswordAndAsClass(String nama, String email, String password, String className) throws InterruptedException {
        UpdateUserPage updateUserPage = new UpdateUserPage(webDriver);
        Thread.sleep(5000);
        updateUserPage.setInputName(nama);
        updateUserPage.setInputEmail(email);
        updateUserPage.setInputPassword(password);
        updateUserPage.setDropClass(className);
    }

    @And("Admin click submit update button")
    public void adminClickSubmitUpdateButton() {
        UpdateUserPage updateUserPage = new UpdateUserPage(webDriver);
        updateUserPage.setSubmitBtn();
    }

    @Then("Admin got the pop up Success Update")
    public void adminGotThePopUpSuccessUpdate() throws InterruptedException {
        UpdateUserPage updateUserPage = new UpdateUserPage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(updateUserPage.setVerifyPopUpSeuccess());
        updateUserPage.setBtnOkPopUpSucc();
    }

    @Then("Admin got the pop up Failed Update")
    public void adminGotThePopUpFailedUpdate() throws InterruptedException {
        UpdateUserPage updateUserPage = new UpdateUserPage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(updateUserPage.setVerifyPopupFailed());
        updateUserPage.setBtnOkFailed();
    }
}
