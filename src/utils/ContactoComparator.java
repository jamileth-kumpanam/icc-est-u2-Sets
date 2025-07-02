package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        //primero el apellido orden alfabetico

        int apellidoComparison = o1.getApellido().compareTo(o2.getApellido());
        if (apellidoComparison != 0) {
            return apellidoComparison;
        } 

        //segundo si son iguales comparo por el nombre orden alfabetico
        int nombreComparison = o1.getNombre().compareTo(o2.getNombre());
        if (nombreComparison != 0) {
            return nombreComparison;     
        }

        //comparo los numeros de manera descendente
        return o2.getTelefono().compareTo(o1.getTelefono());
    }

    
}
