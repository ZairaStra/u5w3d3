package zairastra.u5w3d3.chainOfResponsability;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public abstract class Ufficiale {
    private String grado;
    private int stipendio;
    //ogni ufficiale conosce il suo superiore - ex next
    private Ufficiale responsabile;

    public Ufficiale(int stipendio, String grado) {
        this.stipendio = stipendio;
        this.grado = grado;
    }

    //catena
    public void next(int importo) {
        if (stipendio >= importo) {
            System.out.println(grado);
        }

        if (responsabile != null) {
            responsabile.next(importo);
        } else {
            System.out.println("Fine della catena");
        }
    }
}
