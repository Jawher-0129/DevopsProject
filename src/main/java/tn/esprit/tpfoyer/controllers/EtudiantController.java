package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    @Autowired
    private IEtudiantService etudiantService;

    @PostMapping("/addetudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant)
    {
        return etudiantService.addetudiant(etudiant);
    }

    @PutMapping("/updateetudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant)
    {
        return etudiantService.updateetudiant(etudiant);
    }

    @DeleteMapping("/deleteetudiant/{idEtudiant}")
    public void deleteEtudiant(@PathVariable long idEtudiant)
    {
        etudiantService.deleteetudiant(idEtudiant);
    }

    @GetMapping("/getetudiant")
    public List<Etudiant> getAllEtudiant()
    {
        return etudiantService.getetudiant();
    }

    @GetMapping("/getetudiantbyid/{idEtudiant}")
    public Etudiant getEtudiantByid(@PathVariable("idEtudiant") long idEtudiant)
    {
        return etudiantService.getetudiantById(idEtudiant);
    }


}
