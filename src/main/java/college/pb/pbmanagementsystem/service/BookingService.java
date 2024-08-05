package college.pb.pbmanagementsystem.service;

import college.pb.pbmanagementsystem.model.dto.BookingDto;
import college.pb.pbmanagementsystem.model.entity.Booking;

public interface BookingService {

    Booking createBooking(BookingDto bookingDto);
    Booking getBookingById(Long id);
    Booking updateBooking(BookingDto bookingDto);
    void deleteBookingById(Long id);

}
