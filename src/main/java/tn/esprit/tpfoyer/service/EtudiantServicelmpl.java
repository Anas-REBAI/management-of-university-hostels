package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.repository.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServicelmpl implements IEtudiant{
    EtudiantRepository etudiantRepository;

    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantRepository.findAll();
    }

    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
