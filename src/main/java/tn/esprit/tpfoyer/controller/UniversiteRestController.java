package tn.esprit.tpfoyer.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.service.IUniversite;

import java.util.List;

@Tag(name = "Gestion des universités")
@RestController
@AllArgsConstructor
@RequestMapping("/universite")

public class UniversiteRestController {
    IUniversite universiteService;

    // http://localhost:8089/foyer/universite/retrieve-all-universites
    @Operation(description = "get all universites")
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        List<Universite> listUniversite = universiteService.retrieveAllUniversite();
        return listUniversite;
    }
    // http://localhost:8089/Universite/Universite/retrieve-Universite/8
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long uId) {
        Universite universite = universiteService.retrieveUniversite(uId);
        return universite;
    }

    // http://localhost:8089/foyer/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }
    // http://localhost:8089/foyer/universite/remove-universite/{universite-id}
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long uId) {
        universiteService.removeUniversite(uId);
    }

    // http://localhost:8089/foyer/universite/modify-universite
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.modifyUniversite(u);
        return universite;
    }
    
    
    
}
