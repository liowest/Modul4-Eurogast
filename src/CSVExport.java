import java.util.ArrayList;

public class CSVExport implements Export {
    @Override
    public void export(ArrayList<Artikel> list) {
        System.out.println("Nummer;Bezeichnung;Einkaufspreis;Ablaufdatum;Kategorienummer");
        for(Artikel artikel : list){
            System.out.println(artikel.getNummer()+";"+artikel.getBezeichnung()+";"+artikel.getEinkaufspreis()+";"+artikel.getAblaufdatum()+";"+artikel.getKategorienummer());
        }
    }
}
