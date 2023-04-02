package Dette.Entites.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Echeance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String dateinv="";
    public String immatriculation="";
    public String nomEmprunteur="";
    public String ins="";
    public String emprunteur="";
    public String comptabilite="";
    public String maj="";
    public String version="";
    public String datefichier="";
    public String debutmaj="";
    public String finmaj="";
    public String sequencepret="";
    public String sequenceenregistrement="";

    @ManyToOne
    public Emprunt numPret;

    @ManyToOne
    public Signaletique signaletique;

    public String libellepret="";
    public String devise="";
    public String numemprunt="";
    public String typecontenu="";
    public String numtranche="";
    public String dateech="";
    public double montant=0;
    public String sdr="";



}
