import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
       setColori();
    }
    public static void setColori() {
        Set<String> colori = new HashSet<>(Arrays.asList("rosso", "bianco", "nero"));

        System.out.println("Prima lista di colori: " + colori);

        //Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
        colori.add("viola");
        System.out.println("Aggiunto nuovo colore: " + colori);

        //Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
        Iterator<String> iterator = colori.iterator();
        while (iterator.hasNext()) {
            String colore = iterator.next();
            iterator.remove();
        }
        //stampare il risultato dopo aver rimosso gli elementi
        System.out.println("Lista colori dopo rimozione: " + colori);
    }
}