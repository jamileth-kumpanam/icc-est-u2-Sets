package controller;
import java.util.HashSet;
import java.util.Set;

public class Ejercicios {
    public Ejercicios() {
        
    }

    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> set = new HashSet<>();
        for (int numero : numeros) {
            if (!set.add(numero)) {
                return true; 
            }
        }
        return false;
    }

    public boolean esIsograma(String palabra) {
        Set<Character> set = new HashSet<>();
        for (char letra : palabra.toCharArray()) {
            if (!set.add(letra)) {
                return false; 
            }
        }
        return true;
    }


    public int contarPalabrasUnicas(String texto) {
        Set<String> palabrasUnicas = new HashSet<>();
        String[] palabras = texto.split(" ");
        for (String palabra : palabras) {
            palabrasUnicas.add(palabra.toLowerCase());
        }
        return palabrasUnicas.size();
    }
}