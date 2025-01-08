package simplon2024.brief15bibliotheque.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import simplon2024.brief15bibliotheque.Service.EmpruntService;
import simplon2024.brief15bibliotheque.model.Emprunt;

import java.util.List;

@RestController
@RequestMapping("/emprunt")
public class EmpruntController {

    private final EmpruntService empruntService;

    @Autowired
    public EmpruntController(EmpruntService empruntService) { this.empruntService = empruntService; }

    @GetMapping
    public List<Emprunt> findAll() { return empruntService.findAll(); }

    @PostMapping( "/creation")
    public Emprunt creationEmprunt(@RequestBody  Emprunt emprunt) {
        return empruntService.createEmprunt(emprunt);

    }

    @PutMapping("/updateDateRetour/{id}")
    public Emprunt updateDateRetour(@PathVariable Long id) {
        Emprunt updatedEmprunt = empruntService.updateDateRetour(id);
        return updatedEmprunt;
    }

}


