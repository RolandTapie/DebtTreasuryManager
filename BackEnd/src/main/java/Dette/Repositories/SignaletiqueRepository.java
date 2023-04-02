package Dette.Repositories;

import Dette.Entites.Classes.Signaletique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SignaletiqueRepository extends JpaRepository<Signaletique,Integer> {
    List<Signaletique> findAll();
    List<Signaletique> findByNumPret(String numeroPret);
}
