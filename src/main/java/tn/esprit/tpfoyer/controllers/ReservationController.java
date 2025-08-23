package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    private IReservationService reservationService;

    @PostMapping("/addreservation")
    public Reservation addReservation(@RequestBody Reservation reservation)
    {
        return reservationService.addreservation(reservation);
    }

    @PutMapping("/updatereservation")
    public Reservation updateReservation(@RequestBody Reservation reservation)
    {
        return reservationService.updatereservation(reservation);
    }
    @DeleteMapping("/deletereservation/{idReservation}")
    public void deleteReservation(@PathVariable String idReservation)
    {
        reservationService.deletereservation(idReservation);
    }

    @GetMapping("/getreservation")
    public List<Reservation> getAllReservation()
    {
        return reservationService.getreservation();
    }

    @GetMapping("/getreservationbyid/{idReservation}")
    public Reservation getReservationByid(@PathVariable("idReservation") String idReservation)
    {
        return reservationService.getreservationById(idReservation);
    }


}
