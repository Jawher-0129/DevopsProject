package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addchambre(Chambre chambre);
    Chambre updatechambre(Chambre chambre);
    void deletechambre(long idChambre);
    List<Chambre> getchambre();
    Chambre getchambreById(long idChambre);



}
