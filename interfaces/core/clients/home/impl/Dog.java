package interfaces.core.clients.home.impl;

import interfaces.core.clients.Soundable;
import interfaces.core.clients.Swimable;
import interfaces.core.clients.Runnable;
import interfaces.core.clients.home.Pet;
import interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Runnable, Swimable, Soundable {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }


    @Override
    public int runs() {
        return 30;
    }

    @Override
    public void sounds() {
        System.out.println("- Гав! Гав! Гав!");
    }

    @Override
    public int swims() {
        return 3;
    }
}
