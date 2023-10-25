package tn.esprit.tpfoyer.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.service.IReservation;

import java.util.List;

@Tag(name = "Gestion des Reservations")
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
    IReservation reservationService;

    // http://localhost:8089/foyer/reservation/retrieve-all-reservations
    @Operation(description = "get all reservations")
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservation() {
        List<Reservation> listReservation = reservationService.retrieveAllReservation();
        return listReservation;
    }
    // http://localhost:8089/foyer/reservation/retrieve-reservation/8
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveBloc(@PathVariable("reservation-id") String rId) {
        Reservation reservation = reservationService.retrieveReservation(rId);
        return reservation;
    }

    // http://localhost:8089/foyer/reservation/add-reservation
    @PostMapping("/add-bloc")
    public Reservation addbloc(@RequestBody Reservation r) {
        Reservation reservation = reservationService.addReservation(r);
        return reservation;
    }

    // http://localhost:8089/foyer/reservation/remove-reservation/{reservation-id}
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeBloc(@PathVariable("reservation-id") String rId) {
        reservationService.removeReservation(rId);
    }

    // http://localhost:8089/foyer/reservation/modify-reservation
    @PutMapping("/modify-reservation")
    public Reservation modifyBloc(@RequestBody Reservation r) {
        Reservation reservation = reservationService.modifyReservation(r);
        return reservation;
    }
}
