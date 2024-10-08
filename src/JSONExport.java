import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class JSONExport implements Export {


    @Override
    public void export(ArrayList<Artikel> list) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("[");
        int i=0;
        for (Artikel artikel : list) {
            String date = sdf.format(artikel.getAblaufdatum().getTime());

            System.out.println("{");
            System.out.println(" \"Nummer\": "+artikel.getNummer()+",");
            System.out.println("   \"Bezeichnung\": " + artikel.getBezeichnung()+",");
            System.out.println("   \"Einkaufspreis\": " + artikel.getEinkaufspreis()+",");
            System.out.println("   \"Ablaufdatum\": " + date+",");
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
