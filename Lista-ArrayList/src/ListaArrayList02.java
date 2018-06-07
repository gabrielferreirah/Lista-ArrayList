
import java.util.ArrayList;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class ListaArrayList02 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add("João");
        nomes.add("Joana");
        nomes.add("Rafael");
        nomes.add("Rafaela");
        nomes.add("Maria");
        nomes.add("Mario");
        nomes.add("Carla");
        nomes.add("Carlos");
        nomes.add("Gabriel");
        
        System.out.println("Nomes: "
                + "\nPosição 00: " + nomes.get(0)
                + "\nPosição 01: " + nomes.get(1)
                + "\nPosição 02: " + nomes.get(2)
                + "\nPosição 03: " + nomes.get(3)
                + "\nPosição 04: " + nomes.get(4)
                + "\nPosição 05: " + nomes.get(5)
                + "\nPosição 06: " + nomes.get(6)
                + "\nPosição 07: " + nomes.get(7)
                + "\nPosição 08: " + nomes.get(8)
        );
    }

}
