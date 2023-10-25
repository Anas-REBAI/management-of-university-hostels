package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Universite;

import java.util.List;

public interface IUniversite {
        public List<Universite> retrieveAllUniversite();
        public Universite retrieveUniversite(Long idUniversite);
        public Universite addUniversite(Universite u);
        public void removeUniversite(Long idUniversite);
        public Universite modifyUniversite(Universite universite);

}
