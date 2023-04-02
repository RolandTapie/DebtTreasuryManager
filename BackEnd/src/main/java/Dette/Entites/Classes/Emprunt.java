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
public class Emprunt implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type="1";

    @ManyToOne
    private Banque banque;
    private String designation="emprunt test";
    private String statut="en cours";
    private String nature="710";
    private double mad=100000;
    private double montant=100000;
    private double conversion=100000;
    private double taux=1.5;
    private double revision=0;
    private String moderemboursement="constant";
    private String pInt="Annuelle";
    private String pCap="Annuelle";
    private String codeOperation="à definir";

    //@ManyToOne
    private String codeFonctionnel="000";
    //@ManyToOne
    private String codeEconomique="21101";
    //@ManyToOne
    private String codeEconomiqueRembCap="21101";
    //@ManyToOne
    private String codeEconomiqueRembInt="21101";
    private String codeActivite="Entité publique";
    private String structure="SWAP";
    private String chargeNette="totale";
    private double annuite=0;
}
