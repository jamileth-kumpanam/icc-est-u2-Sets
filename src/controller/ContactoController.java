package controller;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;

public class ContactoController {

    public void imprimirPorNombre() {
        Set<Contacto> contactos = new TreeSet<>();
        contactos.addAll(contactosDemo());
        System.out.println(" <---- Contactos ordenados por NOMBRE (default Comparable) ---->");
        contactos.forEach(System.out::println);
    }

    public void imprimirPorApellidoYTelefonoDesc() {
        Set<Contacto> contactos = new TreeSet<>(new ContactoComparator());
        contactos.addAll(contactosDemo());
        System.out.println(" <---- Contactos ordenados por APELLIDO y TELÉFONO DESC ---->");
        contactos.forEach(System.out::println);
    }

    private Set<Contacto> contactosDemo() {
        Set<Contacto> contactos = new TreeSet<>();
        contactos.add(new Contacto("Pedro", "Lopez", "22222222"));
        contactos.add(new Contacto("Luis", "Perez", "11111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "22222222")); // repetido
        return contactos;
    }
}
