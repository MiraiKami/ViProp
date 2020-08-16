package fr.leblanc.entities.status;

import fr.leblanc.entities.people.People;

public class Sick extends Status{
    public Sick(){
        super(1.0, State.SICK);
    }

    @Override
    public void changeStatus(People p, State s) {
        switch (s){
            case DEAD: p.setStatus(new Dead());
            case RECOVERING: p.setStatus(new Recovering());
        }
    }
}
