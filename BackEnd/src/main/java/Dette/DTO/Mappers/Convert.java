package Dette.DTO.Mappers;

import Dette.DTO.Objects.SignaletiqueDTO;
import Dette.Entites.Classes.Signaletique;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Convert {
    @Autowired
    Signaletique signaletique;


    public Signaletique mapIn (SignaletiqueDTO signaletiqueDTO)
    {
        //TODO: Instructions de mapping
        return signaletique;
    }

    public static SignaletiqueDTO mapIn (@NotNull Signaletique signaletique)
    {
        SignaletiqueDTO signaletiqueDTO = new SignaletiqueDTO();
        signaletiqueDTO.setId(signaletique.getId());
        signaletiqueDTO.setBanque(signaletique.getBanque());
        signaletiqueDTO.setComptabilite(signaletique.getComptabilite());
        signaletiqueDTO.setDateaccord(signaletique.getDateaccord());
        signaletiqueDTO.setDateconseil(signaletique.getDateconseil());
        signaletiqueDTO.setDatefichier(signaletique.getDatefichier());
        signaletiqueDTO.setDateinv(signaletique.getDateinv());
        signaletiqueDTO.setDettepret(signaletique.getDettepret());
        signaletiqueDTO.setDevise(signaletique.getDevise());
        signaletiqueDTO.setEmprunteur(signaletique.getEmprunteur());
        signaletiqueDTO.setLibellepret(signaletique.getLibellepret());
        signaletiqueDTO.setMode(signaletique.getMode());
        signaletiqueDTO.setMontant(signaletique.getMontant());
        signaletiqueDTO.setSolde(signaletique.getSolde());
        //TODO: Instructions de mapping
        return signaletiqueDTO;
    }

}
