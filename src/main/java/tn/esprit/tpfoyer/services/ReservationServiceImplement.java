package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.ReservationRepository;
import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

@Service
public class ReservationServiceImplement implements IReservationService{
    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation addreservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updatereservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deletereservation(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    @Override
    public List<Reservation> getreservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getreservationById(String idReservation) {
        return reservationRepository.findById(idReservation).get();
    }
}
