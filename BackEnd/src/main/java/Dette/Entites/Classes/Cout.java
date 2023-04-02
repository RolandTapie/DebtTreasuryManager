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
public class Cout implements Serializable {

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

    @OneToOne
    public Echeance echeance;

    @ManyToOne
    public Signaletique signaletique;

    public String banque="";
    public String libellepret="";
    public String devise="";
    public String duree="";
    public String tauxInt="";
    public String dateRev="";
    public String perInt="";
    public String echInitInt="";
    public String perRemb="";
    public String echInitRemb="";
    public String nombreTranche="";
    public String differer="";
    public String fin="";
    public String compteInit="";
    public String compteRemb="";
    public String tauxRemb="";
    public String tauxRev="";
    public String perRev="";
    public String plan="";

    public Object clone()
    {
        Cout ct = new Cout();
        ct.setDuree(duree);
        ct.setTauxInt(tauxInt);
        ct.setDateRev(dateRev);
        ct.setPerInt(perInt);
        ct.setEchInitInt(echInitInt);
        ct.setPerRemb(perRemb);
        ct.setEchInitRemb(echInitRemb);
        ct.setNombreTranche(nombreTranche);
        ct.setDifferer(differer);
        ct.setFin(fin);
        ct.setCompteInit(compteInit);
        ct.setCompteRemb(compteRemb);
        ct.setCompteRemb(tauxRemb);
        ct.setTauxRev(tauxRev);
        ct.setPerRev(perRev);
        ct.setPlan(plan);

        return ct;

    }
}
