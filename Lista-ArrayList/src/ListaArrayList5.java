
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class ListaArrayList5 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            nomes.add(JOptionPane.showInputDialog("Digite um nome"));
        }
        String nomeBusca = "";
        try {
            nomeBusca = JOptionPane.showInputDialog("Digite um nome para verificação");
        } catch (Exception e) {
            
        }
        byte quantidadeNomes = 0;
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.contains(nomeBusca)) {
                quantidadeNomes++;
            }
        }

        JOptionPane.showMessageDialog(null, "Nome corresponde com " + quantidadeNomes + " dos nomes cadastrados");
    }

}
