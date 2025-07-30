package zairastra.u5w3d3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class AdapterRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Calendar calendar = Calendar.getInstance();
        calendar.set(1993, Calendar.JANUARY, 28);

        Info info = new Info("Zaira", "Straticò", calendar.getTime());

        DataSource adapter = new InfoAdapter(info);

        UserData userData = new UserData(adapter.getNomeCompleto(), adapter.getEta());

        System.out.println("Il mio nome completo è " + userData.getNomeCompleto() + ", ho " + userData.getEta() + " anni");
    }
}
