package fr.leblanc.entities.buildings;

public class Building extends Construction{
    Apartment[] apartments;
    WorkPlace[] wps;

    public Building(int width, int length, boolean protectionNeeded, int nbApartments, int nbWorkPlaces) {
        super(width, length, protectionNeeded);
        this.apartments = new Apartment[nbApartments];
        this.wps = new WorkPlace[nbWorkPlaces];
    }
}
