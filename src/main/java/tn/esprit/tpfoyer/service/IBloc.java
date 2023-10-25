package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;

public interface IBloc {
    public List<Bloc> retrieveAllBloc();
    public Bloc retrieveBloc(Long idBloc);
    public Bloc addBloc(Bloc b);
    public void removeBloc(Long idBloc);
    public Bloc modifyBloc(Bloc bloc);
}
