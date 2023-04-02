package Dette.Repositories;

import Dette.Entites.Classes.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt,Integer> {
}
