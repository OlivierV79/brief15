package simplon2024.brief15bibliotheque.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplon2024.brief15bibliotheque.Repository.EmpruntRepository;
import simplon2024.brief15bibliotheque.Repository.LivreRepository;
import simplon2024.brief15bibliotheque.model.Emprunt;
import simplon2024.brief15bibliotheque.model.Livre;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EmpruntService {

    private final EmpruntRepository empruntRepository;
    private final LivreRepository livreRepository;

    @Autowired
    public EmpruntService(EmpruntRepository empruntRepository, LivreRepository livreRepository) {
        this.empruntRepository = empruntRepository;
        this.livreRepository = livreRepository;
    }

    public List<Emprunt> findAll() {
        return empruntRepository.findAll();
    }

    public Emprunt createEmprunt(Emprunt emprunt) {

        if (!emprunt.getLivre().getDisponible()) {
            throw new IllegalStateException("Le livre n'est pas disponible pour l'emprunt.");
        }

        Emprunt empruntNouvel = new Emprunt();
        empruntNouvel.setDateEmprunt(LocalDateTime.now());
        empruntNouvel.setEmprunteur(emprunt.getEmprunteur());
        empruntNouvel.setLivre(emprunt.getLivre());

        Livre livre = emprunt.getLivre();
        livre.setDisponible(false);
        livreRepository.save(livre);

        return empruntRepository.save(empruntNouvel);
    }

    public Emprunt updateDateRetour(Long empruntId) {
        Optional<Emprunt> empruntOptional = empruntRepository.findById(empruntId);
        if (empruntOptional.isPresent()) {
            Emprunt emprunt = empruntOptional.get();
            emprunt.setDateRetour(LocalDateTime.now());

            Livre livre = emprunt.getLivre();
            livre.setDisponible(true);
            livreRepository.save(livre);

            return empruntRepository.save(emprunt);
        } else {
            throw new IllegalStateException("Emprunt non trouvé.");
        }
    }
}
