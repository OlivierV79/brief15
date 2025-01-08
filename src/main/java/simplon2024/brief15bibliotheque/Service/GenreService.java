package simplon2024.brief15bibliotheque.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplon2024.brief15bibliotheque.Repository.GenreRepository;
import simplon2024.brief15bibliotheque.model.Genre;

import java.util.List;

@Service
public class GenreService {

    private final GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) { this.genreRepository = genreRepository; }

    public List<Genre> findAll() { return genreRepository.findAll(); }

    public Genre saveGenre(Genre genre) {
        Genre genreNouveau = new Genre();
        genreNouveau.setNom(genre.getNom());
        genreRepository.save(genreNouveau);
        return genreNouveau;
    }

}
