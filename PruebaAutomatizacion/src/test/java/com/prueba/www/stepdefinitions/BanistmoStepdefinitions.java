package com.prueba.www.stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import com.prueba.www.tasks.SelectDocument;
import com.prueba.www.tasks.SelectTarifario;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.prueba.www.util.WebDriver.chrome;

public class BanistmoStepdefinitions {
	
	@Before
	public void init() {
		setTheStage(OnlineCast.ofStandardActors());
	}
	
	@Given("^that user needs to enter the banistmo page$")
	public void thatUserNeedsToEnterTheBanistmoPage() {
		theActorCalled("user");
		theActorInTheSpotlight().can(BrowseTheWeb.with(chrome()));

	}

	@When("^he/she enter and search the tarifario option$")
	public void heSheEnterAndSearchTheTarifarioOption() {
	    theActorInTheSpotlight().attemptsTo(SelectTarifario.option(),
	    		SelectDocument.tarifasDeCuentasDeDeposito());
	}

	@Then("^he/she should see the pdf archive correctly$")
	public void heSheShouldSeeThePdfArchiveCorrectly() {
	    
	}


}
