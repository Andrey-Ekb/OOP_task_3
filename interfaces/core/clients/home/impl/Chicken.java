package interfaces.core.clients.home.impl;

import interfaces.core.clients.Soundable;
import interfaces.core.clients.Runnable;
import interfaces.core.clients.home.Pet;
import interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

public class Chicken extends Pet implements Runnable, Soundable {
    public Chicken() {
    }
    public Chicken (int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
    @Override
    public int runs() {
        return 5;
    }
    @Override
    public void sounds() {
        System.out.println("- Кудах-тах-тах!");
    }
}
