package fr.leblanc.entities.status;

import fr.leblanc.entities.people.People;

public class Recovering extends Status{
    public Recovering(){
        super(0.5, State.RECOVERING);
    }

    @Override
    public void changeStatus(People p, State s) {
        switch (s){
            case DEAD: p.setStatus(new Dead());
            case HEALTHY: p.setStatus(new Heahlty());
        }
    }
}
