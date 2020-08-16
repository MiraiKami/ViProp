package fr.leblanc.entities.people;

import fr.leblanc.entities.buildings.Construction;
import fr.leblanc.entities.status.Status;

public class Child extends People{
    private Construction school;

    public Child(String name, String surname, Gender gender, int age, Status status) {
        super(name, surname, gender, age, status);
        this.probabilityContamination = 0.7;
    }

    public Construction getSchool(){ return school; }
}
