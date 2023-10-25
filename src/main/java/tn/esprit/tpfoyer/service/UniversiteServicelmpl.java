package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.repository.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServicelmpl implements IUniversite{
    UniversiteRepository universiteRepository;

    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    public Universite modifyUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
}
