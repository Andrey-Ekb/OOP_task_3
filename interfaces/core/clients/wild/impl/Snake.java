package interfaces.core.clients.wild.impl;

import interfaces.core.clients.owners.Owner;
import interfaces.core.clients.supports.Record;
import interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;
import java.util.List;

public class Snake extends WildAnimal {
    public Snake() {

    }
    public Snake (int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }
}
