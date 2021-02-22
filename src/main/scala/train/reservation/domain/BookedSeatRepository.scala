package train.reservation.domain

import train.reservation.domain.model.Seat
import train.reservation.domain.model.SeatBooked

trait BookedSeatRepository {
    def find(seat: Seat): Option[SeatBooked] // the `Option` here expresses that there might or might not be any `Train` returned by this function
    def save(seatBooked: SeatBooked): Unit
}