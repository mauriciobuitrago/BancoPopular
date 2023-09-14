package com.co.banco.tasks;

import com.co.banco.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomePage.BTN_SINGIN));
        actor.attemptsTo(Enter.theValue("maob14@yopmail.com").into(HomePage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue("1234").into(HomePage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(HomePage.BTN_LOGIN));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static Login enterCredentials() {
        return Tasks.instrumented(Login.class);
    }


}
