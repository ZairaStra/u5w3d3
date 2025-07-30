package zairastra.u5w3d3.adapter;

import java.util.Calendar;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Calendar birthDate = Calendar.getInstance(); //Calendar setta normalmente l'oggetto creato alla data attuale
        birthDate.setTime(info.getDataDiNascita()); // resetto birthDate con la data di nascita
        Calendar today = Calendar.getInstance(); //today settato direttamente ocn data di oggi

        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR); //ricavo l'età dalle date

        return age;
    }
}
