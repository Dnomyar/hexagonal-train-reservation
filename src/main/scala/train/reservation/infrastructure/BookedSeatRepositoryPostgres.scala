package train.reservation.infrastructure

import train.reservation.domain.BookedSeatRepository
import train.reservation.domain.model.SeatBooked
import train.reservation.domain.model.Seat

class BookedSeatRepositoryPostgres extends BookedSeatRepository {
    def find(seat: Seat): Option[SeatBooked] = ??? 
    def save(seatBooked: SeatBooked): Unit = ???
}