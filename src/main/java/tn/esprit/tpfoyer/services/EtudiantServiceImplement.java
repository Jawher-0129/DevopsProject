package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.EtudiantRepository;
import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.List;

@Service
public class EtudiantServiceImplement implements IEtudiantService{

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addetudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
    @Override
    public Etudiant updateetudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }


    @Override
    public void deleteetudiant(long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public List<Etudiant> getetudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getetudiantById(long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }
}
