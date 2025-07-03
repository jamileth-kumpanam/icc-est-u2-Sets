import controller.ContactoController;
import controller.Sets;
import java.util.Set;

import javax.sound.sampled.SourceDataLine;

import controller.Ejercicios;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        runHashSet(sets);   
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSets(sets);
        runTreeSetReversa(sets);
        
        Ejercicios ejercicios = new Ejercicios();
        runEjercicio1(ejercicios);
        runEjercicio2(ejercicios);
        runEjercicio3(ejercicios);

        ContactoController contactoController = new ContactoController();
        contactoController.imprimirPorApellidoYTelefonoDesc();
        contactoController.imprimirPorNombre(); 
    }

    public static void runHashSet(Sets sets) {
        Set<String> palabras = sets.construirHashset();
        System.out.println("<*****HashSet*****>");
        System.out.println("Elementos del HashSet (no se garantiza orden)");
        System.out.println(palabras);
    }

    public static void runLinkedHashSet(Sets sets) {
        Set<String> palabrasLinkeadas = sets.construirLinkedHashSet();
        System.out.println("<******LinkedHashSet*****>");
        System.out.println("Elementos del LinkedHashSet");
        System.out.println(palabrasLinkeadas);
    }

    public static void runTreeSet(Sets sets) {
        Set<String> palabrasTreeSet = sets.construirTreeSet();
        System.out.println("<*****TreeSet*****>");
        System.out.println("Elementos del TreeSet (orden xxxxxxx)");
        System.out.println(palabrasTreeSet);
        System.out.println();
    }

    private static void runTreeSets(Sets sets) {
        Set<String> palabrasTreeSetConComparador = sets.construirTreeSetConComparador();
        System.out.println("<******TreeSet con Comparador*****>");
        System.out.println("Elementos del TreeSet (orden por longitud)");
        System.out.println(palabrasTreeSetConComparador);
        System.out.println(

        );
    }

    private static void runTreeSetReversa(Sets sets) {
        Set<String> palabrasTreeSetReversa = sets.construirTreeSetConComparadorReversa();
        System.out.println("<******TreeSet con Comparador Reversa*****>");
        System.out.println("Elementos del TreeSet (orden por longitud inversa)");
        System.out.println(palabrasTreeSetReversa);
        System.out.println();
    }
    
    public static void runEjercicio1(Ejercicios ejercicios) {
        System.out.println("<*******Ejercicio 1*******>");
        System.out.println("Tiene duplicados: " + ejercicios.tieneDuplicados(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Tiene duplicados: " + ejercicios.tieneDuplicados(new int[]{1, 2, 3, 4, 5, 4 ,3 ,2 ,45}));
        System.out.println();
    }
    
    public static void runEjercicio2(Ejercicios ejercicios) {
        System.out.println("<********Ejercicio 2*******>");
        System.out.println("murcielago es isograma = " + ejercicios.esIsograma("murcielago"));
        System.out.println("camaleon es isograma = " + ejercicios.esIsograma("camaleon"));
        System.out.println();
    }
    public static void runEjercicio3(Ejercicios ejercicios) {
        System.out.println("<********Ejercicio 3*******>");
        String texto = " La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?\n" + //
                        "\n" + //
                        "            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.\n" + //
                        "\n" + //
                        "            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.\n" + //
                        "";
        int palabrasUnicas = ejercicios.contarPalabrasUnicas(texto);
        System.out.println("Número de palabras únicas en el texto: " + palabrasUnicas);
        System.out.println();

    }
}