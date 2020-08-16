package fr.leblanc.entities.people;

import fr.leblanc.entities.buildings.Construction;
import fr.leblanc.entities.status.Status;

public class Adult extends People{
    private Construction workPLace;

    public Adult(String name, String surname, Gender gender, int age, Status status) {
        super(name, surname, gender, age, status);
        this.probabilityContamination = 0.3;
    }

    public Construction getWorkPLace() { return workPLace; }
}
