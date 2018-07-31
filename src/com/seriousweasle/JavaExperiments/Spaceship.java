package com.seriousweasle.JavaExperiments;

public class Spaceship {
    String ShipName;
    int CurrentHealth;
    int CurrentAmmo;

    public Spaceship(String shipName, int currentHealth, int currentAmmo) {
        this.ShipName = shipName;
        this.CurrentHealth = currentHealth;
        this.CurrentAmmo = currentAmmo;
    }

    public void shipStatus() {
        System.out.println("Your ship is called " + ShipName);
        System.out.println("Your health is " + CurrentHealth);
        System.out.println("You have " + CurrentAmmo + " bullets");
    }

    public static void main(String[] args) {
        Spaceship theseus = new Spaceship("Theseus", 10, 10);
        theseus.shipStatus();
    }
}