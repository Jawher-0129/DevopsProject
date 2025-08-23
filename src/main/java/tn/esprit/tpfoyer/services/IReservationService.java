package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation addreservation(Reservation reservation);
    Reservation updatereservation(Reservation reservation);
    void deletereservation(String idReservation);
    List<Reservation> getreservation();
    Reservation getreservationById(String idReservation);

}
