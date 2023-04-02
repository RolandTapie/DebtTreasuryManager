package Dette.Repositories;

import Dette.Entites.Classes.Banque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface BanqueRepository extends JpaRepository<Banque,Integer> {
    List<Banque> findByNom(String nom);
    List<Banque> findByImmatriculation(String immatriculation);
    List<Banque> findAll();
}
