package Dette.Repositories;

import Dette.Entites.Classes.Echeance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcheanceRepository extends JpaRepository<Echeance,Integer> {
}
