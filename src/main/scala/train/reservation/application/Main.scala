package train.reservation.application

import train.reservation.domain.model._
import train.reservation.domain.BookedSeatRepository
import train.reservation.infrastructure.BookedSeatRepositoryPostgres
import train.reservation.domain.SeatReservationService


object Main {
     def main(args: Array[String]): Unit = {
          // instanciation of classes
          val bookedSeatRepository: BookedSeatRepository = new BookedSeatRepositoryPostgres()
          val seatReservationService = new SeatReservationService(bookedSeatRepository)
        
          // calling the service to register the user
          val seat = Seat("A", 14)
          val customer = Customer("Damien")
          seatReservationService.book(seat, customer) 
     }
}  