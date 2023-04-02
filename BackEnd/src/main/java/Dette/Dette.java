package Dette;


import Dette.Configuration.ServiceConfig;
import Dette.Repositories.*;
import Dette.Services.Interfaces.ILireInventaireDette;
import Dette.Services.Service.LireInventaireDette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Dette implements CommandLineRunner {

    @Autowired
    CommunRepository communRepository;
    @Autowired
    BanqueRepository banqueRepository;
    @Autowired
    SignaletiqueRepository signaletiqueRepository;
    @Autowired
    EcheanceRepository echeanceRepository;
    @Autowired
    CoutRepository coutRepository;
    @Autowired
    LireInventaireDette lireInventaireDette;
    @Autowired
    ServiceConfig serviceConfig;

    public static void main(String[] args) {
        SpringApplication.run(Dette.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("2-Lecture des Inventaires Dettes");
        lireInventaireDette.execution(serviceConfig.getcheminDetteInventaire());
//
//        System.out.println("   > Sauvegarde des données communes...");
//        lireInventaireDette.getListeCom().forEach(commun -> {
//            communRepository.save(commun);
//        });
//        System.out.println("   > Sauvegarde des signalétiques...");
//        lireInventaireDette.getListeSign().forEach(signaletique -> {
//            signaletiqueRepository.save(signaletique);
//        });
//        System.out.println("   > Sauvegarde des échéances...");
//        lireInventaireDette.getListeEch().forEach(echeance -> {
//            echeanceRepository.save(echeance);
//        });
//        System.out.println("   > Sauvegarde des échéances : coût...");
//        lireInventaireDette.getListecout().forEach(cout -> {
//            coutRepository.save(cout);
//        });
        System.out.println("Lecture de l'inventaire terminée.");
    }
}
