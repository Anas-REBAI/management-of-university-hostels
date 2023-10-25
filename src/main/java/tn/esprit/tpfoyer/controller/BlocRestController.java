package tn.esprit.tpfoyer.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.service.IBloc;

import java.util.List;

@Tag(name = "Gestion des blocs")
@RestController
@AllArgsConstructor
@RequestMapping("/bloc")

public class BlocRestController {
    IBloc blocService;

    // http://localhost:8089/foyer/bloc/retrieve-all-blocs
    @Operation(description = "get all blocs")
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getFoyers() {
        List<Bloc> listBloc = blocService.retrieveAllBloc();
        return listBloc;
    }
    // http://localhost:8089/foyer/bloc/retrieve-bloc/8
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long bId) {
        Bloc bloc = blocService.retrieveBloc(bId);
        return bloc;
    }

    // http://localhost:8089/foyer/bloc/add-bloc
    @PostMapping("/add-bloc")
    public Bloc addbloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }
    // http://localhost:8089/foyer/bloc/remove-bloc/{bloc-id}
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long bId) {
        blocService.removeBloc(bId);
    }

    // http://localhost:8089/foyer/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.modifyBloc(b);
        return bloc;
    }
}
