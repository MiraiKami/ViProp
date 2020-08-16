package fr.leblanc.entities.people;

import fr.leblanc.entities.buildings.Construction;
import fr.leblanc.entities.status.State;
import fr.leblanc.entities.status.Status;

import java.util.Objects;

public abstract class People {
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private Status status;
    private boolean hasProtection;
    private int daysContaminated = 0;
    protected double probabilityContamination;

    private Construction home;

    public People(String name, String surname, Gender gender, int age, Status status){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.status = status;
    }

    public double getAge() { return age; }
    public Gender getGender() { return gender; }
    public Status getStatus() { return status; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public Boolean isProtected() { return hasProtection; }
    public Construction getHome(){ return home; }

    public void setProtection() {
        hasProtection = true;
    }

    public void removeProtection() {
        hasProtection = false;
    }

    public void setStatus(Status s){
        status = s;
    }

    public void tryToInfect(People p){
        //TODO with pure random generator
        p.gotContaminated();
    }

    public void gotContaminated(){
        status.changeStatus(this, State.SICK);
    }

    public void tryToRecover(){
        //TODO search for death rate, and recovery rate
        this.die();
        this.daysContaminated = 0;
    }

    public void die() {
        status.changeStatus(this, State.DEAD);
    }

    public void incrDaysContaminated(){
        this.daysContaminated += 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return this.hashCode() == people.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gender, status, hasProtection, daysContaminated, probabilityContamination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(", ").append(surname).append(" (");
        switch (gender) {
            case MALE: sb.append("M)\n");
            case FEMALE: sb.append("F)\n");
        }

        sb.append(age).append(" years old\n");
        sb.append(status.getState());

        return sb.toString();
    }
}
