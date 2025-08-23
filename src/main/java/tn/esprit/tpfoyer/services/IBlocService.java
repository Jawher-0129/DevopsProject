package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addbloc(Bloc bloc);
    Bloc updatebloc(Bloc bloc);
    void deletebloc(long idBloc);
    List<Bloc> getbloc();
    Bloc getblocById(long idBloc);
}
