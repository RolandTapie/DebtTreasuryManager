package Dette.Configuration;

import Dette.DTO.Mappers.Convert;
import Dette.DTO.Objects.SignaletiqueDTO;
import Dette.Entites.Classes.Signaletique;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Value("${chemin.dette.inventaire}")
    private String cheminDetteInventaire="";

    public String getcheminDetteInventaire(){
        return cheminDetteInventaire;
    }

    @Bean
    public Signaletique newFonction(){
        return new Signaletique();
    }

    @Bean
    public SignaletiqueDTO newFonctionDTO(){
        return new SignaletiqueDTO();
    }

    @Bean
    public Convert newConvert(){
        return new Convert();
    }

}
