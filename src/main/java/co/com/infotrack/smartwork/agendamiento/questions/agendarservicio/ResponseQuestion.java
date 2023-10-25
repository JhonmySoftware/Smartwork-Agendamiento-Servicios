package co.com.infotrack.smartwork.agendamiento.questions.agendarservicio;


import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

public class ResponseQuestion implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        Response lastResponse = LastResponse.received().answeredBy(actor);
        return lastResponse.statusCode();
    }

    public static ResponseQuestion statusCode() {
        return new ResponseQuestion();
    }
}

