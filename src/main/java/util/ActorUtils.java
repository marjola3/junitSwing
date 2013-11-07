package util;

import model.Actor;

/**
 * User: Mariola
 * Date: 07.11.13
 */
public class ActorUtils {
    public static String getActorPersonalDate(Actor actor) {
        StringBuilder sBuilder = new StringBuilder();

        String firstLetterName = actor.getFirstName().substring(0, 1).toUpperCase();
        String firstLetterLastName = actor.getLastName().substring(0, 1).toUpperCase();

        String firstNameLC = actor.getFirstName().substring(1, actor.getFirstName().length()).toLowerCase();
        String lastNameLC = actor.getLastName().substring(1, actor.getLastName().length()).toLowerCase();

        String firstName1BigLetter = firstLetterName + firstNameLC;
        String lastName1BigLetter = firstLetterLastName + lastNameLC;

        sBuilder.append(actor.getId());
        sBuilder.append(" ");
        sBuilder.append(firstName1BigLetter);
        sBuilder.append(" ");
        sBuilder.append(lastName1BigLetter);

        return sBuilder.toString();
    }
}
