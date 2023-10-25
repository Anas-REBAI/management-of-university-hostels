package tn.esprit.tpfoyer.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.service.IEtudiant;

import java.util.List;

@Tag(name = "Gestion des Etudiants")
@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {

    IEtudiant etudiantService;

    // http://localhost:8089/foyer/etudiant/retrieve-all-etudiants
    @Operation(description = "get all etudiants")
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiant() {
        List<Etudiant> listEtudiant = etudiantService.retrieveAllEtudiant();
        return listEtudiant;
    }
    // http://localhost:8089/foyer/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long eId) {
        Etudiant etudiant = etudiantService.retrieveEtudiant(eId);
        return etudiant;
    }

    // http://localhost:8089/foyer/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addbloc(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }

    // http://localhost:8089/foyer/etudiant/remove-etudiant/{etudiant-id}
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long eId) {
        etudiantService.removeEtudiant(eId);
    }

    // http://localhost:8089/foyer/etudiant/modify-etudiant
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.modifyEtudiant(e);
        return etudiant;
    }
}
