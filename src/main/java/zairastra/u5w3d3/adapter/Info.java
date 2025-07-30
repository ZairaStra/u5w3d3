package zairastra.u5w3d3.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Info {

    private String nome;
    private String cognome;
    private Date dataDiNascita;

}
