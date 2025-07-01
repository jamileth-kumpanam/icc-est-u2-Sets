package controller;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Set<String> construirHashset(){
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");

        return palabras;
    }
    
    public Set<String> construirLinkedHashSet(){
        Set<String> palabrasLinkeadas = new LinkedHashSet<>();
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Manzana");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Celular");
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Laptop");

        return palabrasLinkeadas;

    }

    public Set<String> construirTreeSet(){
        Set<String> palabrasTreeSet = new TreeSet<>();
        palabrasTreeSet.add("Laptop");
        palabrasTreeSet.add("Manzana");
        palabrasTreeSet.add("Pera");
        palabrasTreeSet.add("Celular");
        palabrasTreeSet.add("Laptop");
        palabrasTreeSet.add("Pera");
        palabrasTreeSet.add("Laptop");  

        return palabrasTreeSet;

    }

    public Set<String> construirTreeSetConComparador(){
        //crear un comparador
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //comparamos la longitud
                int result = Integer.compare(s1.length(), s2.length());
                if(result == 0) {
                    result = s1.compareTo(s2);
                }
                return result;
            }
        };
        Set<String> miTreeSet = new TreeSet<>(comparadorLongitud);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");                      
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop"); 
        miTreeSet.add("Celulas");

        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparadorReversa(){
        //crear un comparador
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //comparamos la longitud
                int result = Integer.compare(s2.length(), s1.length());
                if(result == 0) {
                    result = s2.compareTo(s1);
                }
                return result;
            }
        };
        Set<String> miTreeSet = new TreeSet<>(comparadorLongitud);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");                      
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop"); 
        miTreeSet.add("Celulas");

        return miTreeSet;
    }
}
