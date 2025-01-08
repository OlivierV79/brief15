package simplon2024.brief15bibliotheque.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplon2024.brief15bibliotheque.Repository.GenreRepository;
import simplon2024.brief15bibliotheque.Repository.LivreRepository;
import simplon2024.brief15bibliotheque.model.Genre;
import simplon2024.brief15bibliotheque.model.Livre;

import java.util.List;

@Service
public class LivreService {

    private final LivreRepository livreRepository;

    @Autowired
    public LivreService(LivreRepository livreRepository) { this.livreRepository = livreRepository; }

    public List<Livre> findAll() { return livreRepository.findAll(); }


}
