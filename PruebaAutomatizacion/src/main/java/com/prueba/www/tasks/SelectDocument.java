package com.prueba.www.tasks;

import static com.prueba.www.userinterfaces.TarifarioComponents.TARIFAS_DE_CUENTAS_DE_DEPOSITO;

import org.openqa.selenium.chrome.ChromeDriver;

import static com.prueba.www.util.SwitchWindow.switchWindow;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

public class SelectDocument implements Task{
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(TARIFAS_DE_CUENTAS_DE_DEPOSITO));
		switchWindow((ChromeDriver) BrowseTheWeb.as(actor).getDriver());
		
	}
	
	public static SelectDocument tarifasDeCuentasDeDeposito() {
		return Tasks.instrumented(SelectDocument.class);
	}

}
