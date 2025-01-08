package simplon2024.brief15bibliotheque.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplon2024.brief15bibliotheque.Repository.EmprunteurRepository;
import simplon2024.brief15bibliotheque.model.Emprunteur;

import java.util.List;

@Service
public class EmprunteurService {

    private final EmprunteurRepository emprunteurRepository;

    @Autowired
    public EmprunteurService(EmprunteurRepository emprunteurRepository) { this.emprunteurRepository = emprunteurRepository; }

    public List<Emprunteur> findAll() { return emprunteurRepository.findAll(); }
}
