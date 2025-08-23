package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {

    Foyer addfoyer(Foyer foyer);
    Foyer updatefoyer(Foyer foyer);
    void deletefoyer(long idFoyer);
    List<Foyer> getfoyer();
    Foyer getfoyerById(long idFoyer);

}
