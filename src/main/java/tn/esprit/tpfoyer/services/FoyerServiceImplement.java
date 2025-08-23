package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.FoyerRepository;
import tn.esprit.tpfoyer.entities.Foyer;

import java.util.List;

@Service
public class FoyerServiceImplement implements IFoyerService{

    @Autowired
    private FoyerRepository foyerRepository;
    @Override
    public Foyer addfoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updatefoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deletefoyer(long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public List<Foyer> getfoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer getfoyerById(long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }
}
