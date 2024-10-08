import java.util.ArrayList;

public class JSONExport implements Export {


    @Override
    public void export(ArrayList<Artikel> list) {
        System.out.println("[");
        int i=0;
        for (Artikel artikel : list) {
            System.out.println("{");
            System.out.println(" \"Nummer\": "+artikel.getNummer()+",");
            System.out.println("   \"Bezeichnung\": " + artikel.getBezeichnung()+",");
            System.out.println("   \"Einkaufspreis\": " + artikel.getEinkaufspreis()+",");
            System.out.println("   \"Ablaufdatum\": " + artikel.getAblaufdatum()+",");
            System.out.println("   \"Kategorienummer\": " + artikel.getKategorienummer());


            if(i<list.size()){
                System.out.println(" }");
            }else {
                System.out.println(" },");
                i++;
            }

        }
        System.out.println("]");
    }
}
