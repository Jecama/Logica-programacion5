import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("sombrero", "hat");
        diccionario.put("fama", "fame");
        diccionario.put("gato", "cat");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("verde", "green");
        diccionario.put("amarillo", "yellow");
        diccionario.put("naranja", "orange");
        diccionario.put("peligro", "danger");
        diccionario.put("banana", "banana");
        diccionario.put("leche", "milk");
        diccionario.put("pan", "bread");
        diccionario.put("carne", "meat");
        diccionario.put("pescado", "fish");
        diccionario.put("arroz", "rice");
        diccionario.put("agua", "water");
        diccionario.put("jugo", "juice");
        diccionario.put("café", "coffee");
        diccionario.put("té", "tea");
        diccionario.put("saber", "know");

        String[] palabras = {"sombrero", "fama", "peligro", "carne", "saber"};
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        Scanner scanner = new Scanner(System.in);

        for (String palabra : palabras) {
            System.out.print("Traduce la palabra '" + palabra + "' al inglés: ");
            String respuesta = scanner.nextLine();
            if (respuesta.equals(diccionario.get(palabra))) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es '" + diccionario.get(palabra) + "'");
                respuestasIncorrectas++;
            }
        }

        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
