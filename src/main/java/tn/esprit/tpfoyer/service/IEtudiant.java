package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;

public interface IEtudiant {
    public List<Etudiant> retrieveAllEtudiant();
    public Etudiant retrieveEtudiant(Long idEtudiant);
    public Etudiant addEtudiant(Etudiant e);
    public void removeEtudiant(Long idEtudiant);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}
