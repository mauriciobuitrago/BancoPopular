package com.co.banco.questions;

import com.co.banco.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateName implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(HomePage.LBL_VALIDATION).viewedBy(actor).asString();
    }


    public static ValidateName compare()
    {
        return new ValidateName();
    }
}
