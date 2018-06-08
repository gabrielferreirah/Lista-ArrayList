
import java.util.ArrayList;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class ListaArrayList04 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
            
        }
        System.out.println("Números");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("Números restantes: " + numeros.size());
        
        numeros.remove(3);
        System.out.println("Números");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("Números restantes: " + numeros.size());
        
        numeros.remove(4);
        System.out.println("Números");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("Números restantes: " + numeros.size());
    }

}
