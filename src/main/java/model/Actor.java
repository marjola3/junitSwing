package model;

import util.ActorUtils;

/**
 * User: Mariola
 * Date: 07.11.13
 */
public class Actor {
    private int id;
    private String firstName;
    private String lastName;

    public Actor(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getActorPersonalData(){
        return ActorUtils.getActorPersonalDate(this);
        //return String.format("%d. %s %s", id, firstName, lastName);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
