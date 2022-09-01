//Jonatan Eduardo Silva Fragoso
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] argsMain;
        argsMain = new String[2];

        System.out.println("Introduzca el texto: ");
        argsMain[0] = entrada.nextLine();
        System.out.println("Introduzca el caracter que quiera saber:");
        argsMain[1] = entrada.nextLine();
        try {
            caracterEn.main(argsMain);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Has intentado recuperar una posición de la " +
                     " cadena de caracteres que no existe");
            System.exit(1);
        }
    }
}
