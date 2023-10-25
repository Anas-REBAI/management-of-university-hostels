package tn.esprit.tpfoyer.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.service.IFoyer;

import java.util.List;

@Tag(name = "Gestion des foyers")
@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {
    IFoyer foyerService;

    // http://localhost:8089/foyer/foyer/retrieve-all-foyers
    @Operation(description = "get all foyers")
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyer = foyerService.retrieveAllFoyer();
        return listFoyer;
    }
    // http://localhost:8089/foyer/foyer/retrieve-foyer/8
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long fId) {
        Foyer foyer = foyerService.retrieveFoyer(fId);
        return foyer;
    }

    // http://localhost:8089/foyer/foyer/add-foyer
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.addFoyer(f);
        return foyer;
    }
    // http://localhost:8089/foyer/foyer/remove-foyer/{foyer-id}
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long fId) {
        foyerService.removeFoyer(fId);
    }

    // http://localhost:8089/foyer/foyer/modify-foyer
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.modifyFoyer(f);
        return foyer;
    }
}
