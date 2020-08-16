package fr.leblanc.entities.buildings;

import fr.leblanc.entities.people.People;
import fr.leblanc.utilitary.PeopleDistances;
import fr.leblanc.utilitary.Position;

import java.util.ArrayList;
import java.util.List;

public abstract class Construction {
    private int width;
    private int length;

    private int capacity;
    private boolean protectionNeeded;
    private List<People> personsInside;

    public Construction(int width, int length, boolean protectionNeeded){
        this.width = width;
        this.length = length;
        this.capacity = (int)Math.floor(width*length);
        this.protectionNeeded = protectionNeeded;
        this.personsInside = new ArrayList<>(capacity);
    }

    private Position getPositionInside(People p){
        int index = personsInside.indexOf(p);
        int x = index % width;
        int y = index / width;
        return new Position(x, y);
    }

    /**
     * Get the distances between the people in the building
     * @return a List of PeopleDistances for all the people in the building
     */
    public List<PeopleDistances> getDistanceBetweenPeople(){
        List<PeopleDistances> ds = new ArrayList<>();

        for(People p1: personsInside){
            for(People p2: personsInside){
                if(!p1.equals(p2)){
                    double d = getPositionInside(p1).distanceTo(getPositionInside(p2));
                    PeopleDistances distance = new PeopleDistances(p1, p2, d);
                    if(!ds.contains(distance)){
                        ds.add(distance);
                    }
                }
            }
        }

        return ds;
    }

    /**
     * Arrange persons in the building
     *
     * @param ps a list of people to put in the building's list of persons inside
     */
    public void arrangePeople(List<People> ps){
        //TODO with pure generator
    }
}
