package fr.leblanc.utilitary;

import fr.leblanc.entities.people.People;

import java.util.Objects;

public class PeopleDistances {
    private People p1;
    private People p2;
    private double distance;

    public PeopleDistances(People p1, People p2, double distance){
        this.p1 = p1;
        this.p2 = p2;
        this.distance = distance;
    }

    public People getP1() {
        return p1;
    }

    public People getP2() {
        return p2;
    }

    public double getDistance() {
        return distance;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeopleDistances that = (PeopleDistances) o;
        return this.hashCode() == that.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(p1, p2, distance);
    }
}
