package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteController {
    @Autowired
    private IUniversiteService universiteService;

    @PostMapping("/adduniversite")
    public Universite addUniversite(@RequestBody Universite universite)
    {
        return universiteService.adduniversite(universite);
    }

    @PutMapping("/updateuniversite")
    public Universite updateFoyer(@RequestBody Universite universite)
    {
        return universiteService.updateuniversite(universite);
    }
    @DeleteMapping("/deleteuniversite/{idUniversite}")
    public void deleteUniversite(@PathVariable long idUniversite)
    {
        universiteService.deleteuniversite(idUniversite);
    }

    @GetMapping("/getuniversite")
    public List<Universite> getAllUniversite()
    {
        return universiteService.getuniversite();
    }

    @GetMapping("/getuniversitebyid/{idUniversite}")
    public Universite getUniversiteByid(@PathVariable("idUniversite") long idUniversite)
    {
        return universiteService.getuniversiteById(idUniversite);
    }




}
