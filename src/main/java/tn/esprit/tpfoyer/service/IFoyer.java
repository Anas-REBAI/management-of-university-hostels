package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface IFoyer {
    public List<Foyer> retrieveAllFoyer();
    public Foyer retrieveFoyer(Long idFoyer);
    public Foyer addFoyer(Foyer foyer);
    public void removeFoyer(Long idFoyer);
    public Foyer modifyFoyer(Foyer foyer);
}
