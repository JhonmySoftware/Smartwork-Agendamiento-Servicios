package co.com.infotrack.smartwork.agendamiento.questions.crearservicio;

import co.com.infotrack.smartwork.agendamiento.userinterfaces.crearservicio.ObjectCrearServicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class QsCrearServicio implements Question {

    public static QsCrearServicio one() {
        return new QsCrearServicio();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ObjectCrearServicio.OrdenServicioCreado).viewedBy(actor).asString();
    }
}
