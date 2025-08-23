package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.ChambreRepository;
import tn.esprit.tpfoyer.entities.Chambre;

import java.util.List;

@Service
public class ChambreServiceImplement implements IChambreService{

    @Autowired
    private ChambreRepository chambreRepository;
    @Override
    public Chambre addchambre(Chambre chambre) {
       return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updatechambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deletechambre(long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public List<Chambre> getchambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre getchambreById(long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

}
