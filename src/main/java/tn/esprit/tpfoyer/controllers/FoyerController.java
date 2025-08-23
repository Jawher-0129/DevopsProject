package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.services.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerController {
    @Autowired
    private IFoyerService foyerService;

    @PostMapping("/addfoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer)
    {
        return foyerService.addfoyer(foyer);
    }

    @PutMapping("/updatefoyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer)
    {
        return foyerService.updatefoyer(foyer);
    }
    @DeleteMapping("/deletefoyer/{idFoyer}")
    public void deleteFoyer(@PathVariable long idFoyer)
    {
        foyerService.deletefoyer(idFoyer);
    }

    @GetMapping("/getfoyer")
    public List<Foyer> getAllFoyer()
    {
        return foyerService.getfoyer();
    }

    @GetMapping("/getfoyerbyid/{idFoyer}")
    public Foyer getFoyerByid(@PathVariable("idFoyer") long idFoyer)
    {
        return foyerService.getfoyerById(idFoyer);
    }


}
