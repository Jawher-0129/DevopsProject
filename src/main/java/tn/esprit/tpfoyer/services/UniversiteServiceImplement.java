package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.UniversiteRepository;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;

@Service
public class UniversiteServiceImplement implements IUniversiteService{
    @Autowired
    private UniversiteRepository universiteRepository;


    @Override
    public Universite adduniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateuniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteuniversite(long idUniversite) {
        universiteRepository.deleteById(idUniversite);
        
    }

    @Override
    public List<Universite> getuniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite getuniversiteById(long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }
}
