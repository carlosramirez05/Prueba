package com.prueba.www.tasks;

import static com.prueba.www.userinterfaces.PrincipalPageComponents.TARIFARIO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SelectTarifario implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Scroll.to(TARIFARIO),
				Click.on(TARIFARIO));
		
	}
	
	public static SelectTarifario option() {
		return Tasks.instrumented(SelectTarifario.class);
	}

}
