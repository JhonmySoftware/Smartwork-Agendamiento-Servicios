package co.com.infotrack.smartwork.agendamiento.questions.autenticacion;

import co.com.infotrack.smartwork.agendamiento.userinterfaces.autenticacion.ObjetcLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class qsLogin implements Question {

    public static qsLogin one() {
        return new qsLogin();
    }



    @Override
    public Object answeredBy(Actor actor) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Text.of(ObjetcLogin.VersionSitio).viewedBy(actor).asString();
    }
}
