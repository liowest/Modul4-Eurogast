import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CSVExport implements Export {
    @Override
    public void export(ArrayList<Artikel> list) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Nummer;Bezeichnung;Einkaufspreis;Ablaufdatum;Kategorienummer");
        for(Artikel artikel : list){
            String date = sdf.format(artikel.getAblaufdatum().getTime());
            System.out.println(artikel.getNummer()+";"+artikel.getBezeichnung()+";"+artikel.getEinkaufspreis()+";"+date+";"+artikel.getKategorienummer());
        }
    }
}
