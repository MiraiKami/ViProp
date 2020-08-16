package fr.leblanc.entities.people;

import fr.leblanc.entities.status.Status;

public class Old extends People{
    public Old(String name, String surname, Gender gender, int age, Status status) {
        super(name, surname, gender, age, status);
        this.probabilityContamination = 0.8;
    }
}
