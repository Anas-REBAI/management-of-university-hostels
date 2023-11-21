package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.repository.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j

public class BlocServicelmpl implements IBloc {
    BlocRepository blocRepository;

    @Scheduled(fixedRate = 60000)
    public List<Bloc> retrieveAllBloc() {
        List<Bloc> listB = blocRepository.findAll();
        for (Bloc b: listB) {
            log.info("Blocs : "+ b);
        }
        //listB.forEach(b -> log.info("Bloc : {}", b));
        return listB;
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
