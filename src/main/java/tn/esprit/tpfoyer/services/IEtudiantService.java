package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addetudiant(Etudiant etudiant);
    Etudiant updateetudiant(Etudiant etudiant);
    void deleteetudiant(long idEtudiant);
    List<Etudiant> getetudiant();
    Etudiant getetudiantById(long idEtudiant);


}
