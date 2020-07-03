package com.prueba.www.stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.prueba.www.util.WebDriver.chrome;

public class PlazaVeaStepdefinitions {
	
	@Before
	public void init() {
		OnStage.setTheStage(OnlineCast.ofStandardActors());
	}
	
	@Given("^that user needs to enter the plazavea page$")
	public void that_user_needs_to_enter_the_plazavea_page() {
		OnStage.theActorCalled("user");
		OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(chrome()));
	    
	}

	@When("^he/she enter and search products$")
	public void he_she_enter_and_search_products() {
	    
	}

	@Then("^he/she should see the product in the cart shopping$")
	public void he_she_should_see_the_product_in_the_cart_shopping() {
	
	}

}
