package train.reservation.domain

import train.reservation.domain.BookedSeatRepository
import train.reservation.domain.model.Seat
import train.reservation.domain.model.Customer

class SeatReservationService(bookedSeatRepository: BookedSeatRepository) {
    def book(seat: Seat, customer: Customer): Unit = {
        // val seatBooked = bookedSeatRepository.find(seat).isDefined
        // if(! seatBooked){
        //     bookedSeatRepository.save(
        //         SeatBooked(seat, customer)
        //     )
        // }

    }    
}