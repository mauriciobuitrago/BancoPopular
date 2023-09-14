package com.co.banco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_SINGIN = Target.the("dando clic al boton signin")
            .locatedBy("//a[contains(@href,'/login')]");

    public static final Target TXT_EMAIL = Target.the("ingresar el email")
            .locatedBy("//input[@placeholder='Email']");


    public static final Target TXT_PASSWORD = Target.the("ingresar el password")
            .locatedBy("//input[@placeholder='Password']");

     public static final Target BTN_LOGIN = Target.the("dar clic en el boton de login")
            .locatedBy("//button[@class='btn btn-lg btn-primary pull-xs-right']");


     public static final Target LBL_VALIDATION = Target.the("validar el nombre")
             .locatedBy("//*[contains(@href,'/profi')]");

}
