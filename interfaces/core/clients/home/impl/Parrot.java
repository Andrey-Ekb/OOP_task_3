package interfaces.core.clients.home.impl;

import interfaces.core.clients.Flyable;
import interfaces.core.clients.Soundable;
import interfaces.core.clients.Runnable;
import interfaces.core.clients.home.Pet;
import interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

public class Parrot extends Pet implements Flyable, Runnable, Soundable {
    public Parrot(){

    }
    public Parrot (int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int runs() {
        return 4;
    }
    @Override
    public int flies() {
        return 20;
    }
    @Override
    public void sounds() {
        System.out.println("- Попка дур-р-рак!!!");
    }

}
