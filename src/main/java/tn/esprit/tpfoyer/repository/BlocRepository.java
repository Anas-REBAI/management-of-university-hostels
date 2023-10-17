package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entity.Bloc;

// Long : type de la clé primaire
public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
