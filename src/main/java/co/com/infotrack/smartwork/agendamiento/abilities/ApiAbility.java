package co.com.infotrack.smartwork.agendamiento.abilities;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class ApiAbility {
    public static void giveApiAbilityTo(Actor actor, String baseUrl) {
        actor.can(CallAnApi.at(baseUrl));
    }
}

