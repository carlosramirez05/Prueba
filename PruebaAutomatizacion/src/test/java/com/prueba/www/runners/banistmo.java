package com.prueba.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/banistmo.feature",
				 glue = "com.prueba.www.stepdefinitions",
				 snippets = SnippetType.CAMELCASE)
public class banistmo {

}
