package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.TypeChambre;

import java.util.List;

// Long : type de la clé primaire
public interface ChambreRepository extends JpaRepository<Chambre, Long> {

    Chambre findChambreBynumeroChambre(Long numC);
    List<Chambre> findAllBytypeC(TypeChambre tc);
}
