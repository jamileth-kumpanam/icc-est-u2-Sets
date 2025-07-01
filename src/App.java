import java.util.HashSet;
import java.util.Set;

import controller.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        runHashSet(sets);   
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSets(sets);
        runTreeSetReversa(sets);
    }

    public static void runHashSet(Sets sets) {
        Set<String> palabras = sets.construirHashset();
        System.out.println("<-----------------HashSet--------------------->");
        System.out.println("Elementos del HashSet (no se garantiza orden)");
        System.out.println(palabras);
    }

    public static void runLinkedHashSet(Sets sets) {
        Set<String> palabrasLinkeadas = sets.construirLinkedHashSet();
        System.out.println("<-----------------LinkedHashSet--------------------->");
        System.out.println("Elementos del LinkedHashSet");
        System.out.println(palabrasLinkeadas);
    }

    public static void runTreeSet(Sets sets) {
        Set<String> palabrasTreeSet = sets.construirTreeSet();
        System.out.println("<-----------------TreeSet--------------------->");
        System.out.println("Elementos del TreeSet (orden xxxxxxx)");
        System.out.println(palabrasTreeSet);
    }

    private static void runTreeSets(Sets sets) {
        Set<String> palabrasTreeSetConComparador = sets.construirTreeSetConComparador();
        System.out.println("<-----------------TreeSet con Comparador--------------------->");
        System.out.println("Elementos del TreeSet (orden por longitud)");
        System.out.println(palabrasTreeSetConComparador);
    }

    //imprimir al reves

    private static void runTreeSetReversa(Sets sets) {
        Set<String> palabrasTreeSetReversa = sets.construirTreeSetConComparadorReversa();
        System.out.println("<-----------------TreeSet con Comparador Reversa--------------------->");
        System.out.println("Elementos del TreeSet (orden por longitud inversa)");
        System.out.println(palabrasTreeSetReversa);
    }
}
