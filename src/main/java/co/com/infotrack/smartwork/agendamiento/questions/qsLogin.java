package co.com.infotrack.smartwork.agendamiento.questions;

import co.com.infotrack.smartwork.agendamiento.userinterfaces.ObjetcLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class qsLogin implements Question {

    public static qsLogin one() {
        return new qsLogin();
    }


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ObjetcLogin.VersionSitio).viewedBy(actor).asString();
    }
}
