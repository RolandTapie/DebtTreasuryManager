package Dette.Repositories;

import Dette.Entites.Classes.Cout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoutRepository extends JpaRepository<Cout,Integer> {
}
