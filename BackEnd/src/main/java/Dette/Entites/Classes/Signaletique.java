package Dette.Entites.Classes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Signaletique {

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
    public String numPret="";

    public String banque="";
    public String libellepret="";
    public String devise="";
    public String montant="";
    public String typecredit="";
    public String dateconseil="";
    public String dateaccord="";
    public String tiers="";
    public String compte="";
    public String mode="";
    public String categorie="";
    public String structure="";
    public String finstructure="";
    public String datetutelle="";
    public String dettepret="";
    public String typepret="";
    public String statut="";
    public String destination="";
    public String signeAv="";
    public String avance="";
    public String signeDispo="";
    public String disponible="";
    public String signeSolde="";
    public String solde="";

    public Object clone()
    {
        Signaletique sign = new Signaletique();
        sign.setMontant(montant);
        sign.setTypecredit(typecredit);
        sign.setDateconseil(dateconseil);
        sign.setDateaccord(dateaccord);
        sign.setTiers(tiers);
        sign.setCompte(compte);
        sign.setMode(mode);
        sign.setCategorie(categorie);
        sign.setStructure(structure);
        sign.setFinstructure(finstructure);
        sign.setDatetutelle(datetutelle);
        sign.setDettepret(dettepret);
        sign.setTypepret(typepret);
        sign.setStatut(statut);
        sign.setDestination(destination);
        sign.setSigneAv(signeAv);
        sign.setAvance(avance);
        sign.setSigneDispo(signeDispo);
        sign.setDisponible(disponible);
        sign.setSigneSolde(signeSolde);
        sign.setSolde(solde);

        return sign;

    }
}
