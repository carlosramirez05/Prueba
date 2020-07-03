package com.prueba.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalPageComponents {
	
	public static final Target TARIFARIO = Target.the("tarifario").locatedBy("//*[@id=\"footer-content\"]/div[2]/div[1]/div/div[2]/div/ul/li[5]/a");
	
	private PrincipalPageComponents() {}

}
