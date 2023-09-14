package com.co.banco.stepsdefinitions;

import com.co.banco.questions.ValidateName;
import com.co.banco.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }



    @Given("^he user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://angular.realworld.io/"));

    }

    @When("^he user enter the credentials$")
    public void heUserEnterTheCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterCredentials());


    }

    @Then("^he could see his account$")
    public void heCouldSeeHisAccount() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateName.compare()
        , Matchers.is("mauricio")));


    }

}
