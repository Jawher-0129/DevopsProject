package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    Universite adduniversite(Universite universite);
    Universite updateuniversite(Universite universite);
    void deleteuniversite(long idUniversite);
    List<Universite> getuniversite();
    Universite getuniversiteById(long idUniversite);
}
