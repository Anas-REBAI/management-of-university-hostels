package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.repository.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServicelmpl implements IBloc {
    BlocRepository blocRepository;

    public List<Bloc> retrieveAllBloc() {
        return blocRepository.findAll();
    }

    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}
