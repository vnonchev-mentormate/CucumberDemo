import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PasswordStepdefs {

    @Given("a valid password")
    public void aValidPassword() {
    }

    @Then("the verification should return {string}")
    public void theVerificationShouldReturn(String arg0) {
    }

    @And("we store the password")
    public void weStoreThePassword() {
    }

    @Given("an invalid password")
    public void anInvalidPassword() {
    }

    @Given("a password")
    public void aPassword() {
    }

    @And("the password is more than {int} characters")
    public void thePasswordIsMoreThanCharacters(int count) {
    }

    @And("the password has at least {int} number")
    public void thePasswordHasAtLeastNumber(int number) {
    }

    @And("the password is not null")
    public void thePasswordIsNotNull() {
    }

    @And("the password contains a lowercase letter")
    public void thePasswordContainsALowercaseLetter() {
    }

    @And("the password contains a uppercase letter")
    public void thePasswordContainsAUppercaseLetter() {
    }

    @When("the user provides it")
    public void theUserProvidesIt() {
    }

    @Then("it is a {string} password")
    public void itIsAPassword(String password) {
    }
}
