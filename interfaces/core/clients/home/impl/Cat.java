package interfaces.core.clients.home.impl;

import interfaces.core.clients.Soundable;
import interfaces.core.clients.Runnable;
import interfaces.core.clients.Swimable;
import interfaces.core.clients.home.Pet;
import interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet implements Runnable, Swimable, Soundable {

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
    public Cat() {
    }

    @Override
    public int runs() {
        return 10;
    }

    @Override
    public int swims() {
        return 2;
    }

    @Override
    public void sounds() {
        System.out.println("- Мяу! Мяу!");
    }
}
