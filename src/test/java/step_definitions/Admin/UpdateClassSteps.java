package step_definitions.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Admin.RegisterClassPage;
import org.example.Admin.UpdateClassPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class UpdateClassSteps {
    public WebDriver webDriver;
     public UpdateClassSteps(){
         super();
         this.webDriver = Hooks.webDriver;
         UpdateClassPage updateClassPage = new UpdateClassPage(webDriver);
     }
    @And("Admin click option button")
    public void adminClickOptionButton() throws InterruptedException {
         UpdateClassPage updateClassPage = new UpdateClassPage(webDriver);
         Thread.sleep(10000);
         updateClassPage.setOptionBtn();
    }

    @And("Admin click edit button")
    public void adminClickEditButton() {
         UpdateClassPage updateClassPage = new UpdateClassPage(webDriver);
         updateClassPage.setEditBtn();
    }

    @Then("Admin direct to edit class pop up")
    public void adminDirectToEditClassPopUp(){
         UpdateClassPage updateClassPage = new UpdateClassPage(webDriver);
         Assert.assertTrue(updateClassPage.verifypopUpEdit());
    }

    @When("Admin input data name {string} and status {string}")
    public void adminInputDataNameAndStatus(String className, String status ) throws InterruptedException {
         UpdateClassPage updateClassPage = new UpdateClassPage(webDriver);
         Thread.sleep(3000);
         updateClassPage.setInputClassName(className);
         updateClassPage.setDropDownClass(status);

    }

    @And("Admin click submit button")
    public void adminClickSubmitButton() {
         UpdateClassPage updateClassPage = new UpdateClassPage(webDriver);
         updateClassPage.setSubmitBtnClass();
    }

    @Then("Admin got the pop up Success Updated")
    public void adminGotThePopUpSuccessUpdated() throws InterruptedException {
         UpdateClassPage updateClassPage = new UpdateClassPage(webDriver);
         RegisterClassPage registerClassPage = new RegisterClassPage(webDriver);
         Thread.sleep(3000);
         updateClassPage.setPopUpSuccessClass();
         updateClassPage.setBtnOkUpdateClass();
         updateClassPage.setBtnClose();
         Thread.sleep(10000);
         Assert.assertTrue(registerClassPage.verifyInputClassPage());
     }

    @Then("Admin got the pop up Failed Updated")
    public void adminGotThePopUpFailedUpdated() throws InterruptedException {
         RegisterClassPage registerClassPage = new RegisterClassPage(webDriver);
         Thread.sleep(3000);
         registerClassPage.setPopUpFailed();
         registerClassPage.setBtnOkFailed();
    }
}
