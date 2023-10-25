package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class FoyerServiceImpI implements IFoyer{
    FoyerRepository foyerRepository;
    public List<Foyer> retrieveAllFoyer() { return foyerRepository.findAll(); }

    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    public void removeFoyer(Long idFoyer) {foyerRepository.deleteById(idFoyer);}

    public Foyer modifyFoyer(Foyer foyer) {return foyerRepository.save(foyer);}
}
