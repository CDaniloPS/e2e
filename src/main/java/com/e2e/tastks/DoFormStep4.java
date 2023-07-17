package com.e2e.tastks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.By;

import com.e2e.ui.FormularioForm;


public class DoFormStep4  implements Task {
    public static Performable withActor(){
        return instrumented(DoFormStep4.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormularioForm.SUBMIT_STEP4_BUTTON)
        );
    }
}
