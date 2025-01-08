package simplon2024.brief15bibliotheque.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import simplon2024.brief15bibliotheque.Service.EmpruntService;
import simplon2024.brief15bibliotheque.Service.EmprunteurService;
import simplon2024.brief15bibliotheque.model.Emprunt;
import simplon2024.brief15bibliotheque.model.Emprunteur;

import java.util.List;

@RestController
@RequestMapping("/emprunteur")
public class EmprunteurController {

    private final EmprunteurService emprunteurService;

    @Autowired
    public EmprunteurController(EmprunteurService emprunteurService) { this.emprunteurService = emprunteurService; }

    @GetMapping
    public List<Emprunteur> findAll() { return emprunteurService.findAll(); }
}


