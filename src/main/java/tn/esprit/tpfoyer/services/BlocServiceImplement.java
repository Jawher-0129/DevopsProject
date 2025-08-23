package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.BlocRepository;
import tn.esprit.tpfoyer.entities.Bloc;

import java.util.List;
@Service
public class BlocServiceImplement implements IBlocService{

    @Autowired
    private BlocRepository blocRepository;


    @Override
    public Bloc addbloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updatebloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deletebloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> getbloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc getblocById(long idBloc) {
        return blocRepository.findById(idBloc).get();
    }
}
