package fr.leblanc.entities.status;

import fr.leblanc.entities.people.People;
import fr.leblanc.entities.status.State;

public abstract class Status {
    private double contaminationRate;
    private State state;

    public Status(double contaminationRate, State state){
        this.contaminationRate = contaminationRate;
        this.state = state;
    }

    public abstract void changeStatus(People p, State s);
    public State getState(){
        return state;
    }
}
