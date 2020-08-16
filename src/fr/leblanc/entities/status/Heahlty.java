package fr.leblanc.entities.status;

import fr.leblanc.entities.people.People;

public class Heahlty extends Status {

    public Heahlty(){
        super(0.0, State.HEALTHY);
    }

    @Override
    public void changeStatus(People p, State s) {
        switch (s){
            case DEAD: p.setStatus(new Dead());
            case SICK: p.setStatus(new Sick());
        }
    }
}
