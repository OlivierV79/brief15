package simplon2024.brief15bibliotheque.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import simplon2024.brief15bibliotheque.Service.GenreService;
import simplon2024.brief15bibliotheque.Service.LivreService;
import simplon2024.brief15bibliotheque.model.Genre;
import simplon2024.brief15bibliotheque.model.Livre;

import java.util.List;

@RestController
@RequestMapping("/livre")
public class LivreController {

    private final LivreService livreService;

    @Autowired
    public LivreController(LivreService livreService) { this.livreService = livreService; }

    @GetMapping
    public List<Livre> findAll() { return livreService.findAll(); }
}
