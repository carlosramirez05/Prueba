package com.prueba.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TarifarioComponents {
	
	public static final Target TARIFAS_DE_CUENTAS_DE_DEPOSITO = Target.the("tarifas de cuentas de deposito").locatedBy("//*[@id=\"main-content\"]/div[1]/div/div/table/tbody/tr[2]/td[2]/span/a/img");
	
	private TarifarioComponents() {}

}
