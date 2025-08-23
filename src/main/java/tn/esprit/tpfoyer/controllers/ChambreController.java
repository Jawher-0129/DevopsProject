package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {

    @Autowired
    IChambreService chambreService;

    @PostMapping("/addchambre")
    public Chambre addChambre(@RequestBody Chambre chambre)
    {
        return chambreService.addchambre(chambre);
    }

    @PutMapping("/updatechambre")
    public Chambre updateChambre(@RequestBody Chambre chambre)
    {
        return chambreService.updatechambre(chambre);
    }

    @DeleteMapping("/deletechambre/{idChambre}")
    public void deleteChambre(@PathVariable long idChambre)
    {
        chambreService.deletechambre(idChambre);
    }

    @GetMapping("/getchambre")
    public List<Chambre> getAllChambre()
    {
        return chambreService.getchambre();
    }

    @GetMapping("/getchambrebyid/{idChambre}")
    public Chambre getChambreByid(@PathVariable("idChambre") long idChambre)
    {
        return chambreService.getchambreById(idChambre);
    }



































}
