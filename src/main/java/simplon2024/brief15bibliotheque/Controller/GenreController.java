package simplon2024.brief15bibliotheque.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import simplon2024.brief15bibliotheque.Service.GenreService;
import simplon2024.brief15bibliotheque.model.Emprunt;
import simplon2024.brief15bibliotheque.model.Genre;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {

    private final GenreService genreService;

    @Autowired
    public GenreController(GenreService genreService) { this.genreService = genreService; }

    @GetMapping
    public List<Genre> findAll() { return genreService.findAll(); }

    @PostMapping("/creation")
    public Genre creationEmprunt(@RequestBody Genre genre) {
        return genreService.saveGenre(genre);

    }
}
