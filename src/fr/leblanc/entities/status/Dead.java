package fr.leblanc.entities.status;

import fr.leblanc.entities.people.People;

public class Dead extends Status{
    public Dead(){
        super(0.0, State.DEAD);
    }

    @Override
    public void changeStatus(People p, State s) { }
}
