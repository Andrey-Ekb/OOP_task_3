package interfaces.core.drugStore;

import interfaces.core.clients.DoctorSpecialities;
import interfaces.core.personal.Doctor;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy(1);
        Component comp1 = new Component("Penicillin", "10 mg", 10);
        Component comp2 = new Component("Spirit", "100 g", 1000);

        pharmacy1.addComponent(comp1).addComponent(comp2);

        System.out.println(pharmacy1);
        for (Component elem : pharmacy1) {
            System.out.println(elem);
        }

        Pharmacy pharmacy2 = new Pharmacy(2);
        Component comp3 = new Component("Penicillin", "10 mg", 3);
        Component comp4 = new Component("Spirit", "100 g", 13);
        pharmacy2.addComponent(comp3).addComponent(comp4);

        Pharmacy pharmacy3 = new Pharmacy(3);
        Component comp5 = new Component("Penicillin", "10 mg", 12);
        Component comp6 = new Component("Spirit", "100 g", 100);
        pharmacy3.addComponent(comp5).addComponent(comp6);

        Pharmacy pharmacy4 = new Pharmacy(2);
        pharmacy4.addComponent(comp5).addComponent(comp6).addComponent(comp2);

        List<Pharmacy> nomenclature = new ArrayList<>();
        nomenclature.add(pharmacy3);
        nomenclature.add(pharmacy1);
        nomenclature.add(pharmacy2);

        System.out.println(nomenclature);
        Collections.sort(nomenclature);
        System.out.println("============================================================================");
        System.out.println(nomenclature);
        System.out.println();
        System.out.println("**** задание 3, часть 1 ****");
        System.out.println();
        HashSet<Pharmacy> result = new HashSet<>();
        System.out.println("нач. данные, result.size : " + result.size());
        System.out.println();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        System.out.println("после добавления pharmacy1,2,3 result.size :" + result.size());
        System.out.println();
        System.out.println("result после добавления не уникального pharmacy4 c id=2 : "+ result.size());
        System.out.println();

        resOut(result);

        System.out.println();
        System.out.println("**** задание 3, часть 2 ****");
        System.out.println();

        Pharmacy pharmacy7 = new Pharmacy(7);
        Component comp7 = new Component("Aspirin","150 mg", 900);
        pharmacy7.addComponent(comp5).addComponent(comp7);

        List<Pharmacy> nomenclature_2 = new ArrayList<>();
        nomenclature_2.add(pharmacy7);
        nomenclature_2.add(pharmacy1);
        nomenclature_2.add(pharmacy2);
        System.out.println("****   до сортироки nomenclature_2 :   ");
        System.out.println(nomenclature_2);
        Collections.sort(nomenclature_2);
        System.out.println("------------------------------------");
        System.out.println("**** после сортировки nomenclature_2 : ");
        System.out.println(nomenclature_2);
        System.out.println();
    }

    public static void resOut(HashSet<Pharmacy> result) {
        for(var item: result) {
            System.out.println("id = " + item.getId() + ": " + item.getComponents());
        }
    }
}
