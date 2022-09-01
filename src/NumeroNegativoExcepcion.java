//Jonatan Eduardo Silva Fragoso
import java.util.InputMismatchException;
import java.util.*;
import java.math.*;

public class NumeroNegativoExcepcion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        double raiz = 0;
        System.out.println("Número: " );
        num = s.nextInt();
        try{
            raiz = Math.sqrt(num);
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        System.out.println("La raiz es de: " +  raiz);
    }
}