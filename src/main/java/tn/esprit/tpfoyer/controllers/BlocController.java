package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocController {

    @Autowired
    IBlocService blocService;


    @PostMapping("/addbloc")
    public Bloc addbloc(@RequestBody Bloc bloc)
    {
        return blocService.addbloc(bloc);
    }

    @PutMapping("/updatebloc")
    public Bloc updatebloc(@RequestBody Bloc bloc)
    {
        return blocService.updatebloc(bloc);
    }

    @DeleteMapping("/deletebloc/{idbloc}")
    public void deleteChambre(@PathVariable long idbloc)
    {
        blocService.deletebloc(idbloc);
    }

    @GetMapping("/getbloc")
    public List<Bloc> getAllbloc()
    {
        return blocService.getbloc();
    }

    @GetMapping("/getblocbyid/{idbloc}")
    public Bloc getChambreByid(@PathVariable("idbloc") long idbloc)
    {
        return blocService.getblocById(idbloc);
    }





}
