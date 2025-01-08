package simplon2024.brief15bibliotheque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import simplon2024.brief15bibliotheque.model.Emprunt;

@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
}
