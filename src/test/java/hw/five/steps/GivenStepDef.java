package hw.five.steps;

import io.cucumber.java.en.Given;

public class GivenStepDef extends AbstractBaseStepDef {

    @Given("I open JDI GitHub site")
    public void iOpenJdiGitHubSite() {
        indexPage.openIndexPage();
    }
}
