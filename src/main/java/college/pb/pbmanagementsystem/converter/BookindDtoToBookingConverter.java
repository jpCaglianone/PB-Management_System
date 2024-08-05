package college.pb.pbmanagementsystem.converter;

import college.pb.pbmanagementsystem.model.dto.BookingDto;
import college.pb.pbmanagementsystem.model.entity.Booking;
import jakarta.annotation.Nonnull;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookindDtoToBookingConverter implements Converter<BookingDto, Booking> {

    @Override
    public Booking convert(@Nonnull BookingDto bookingDto) {
        var booking = new Booking();
        BeanUtils.copyProperties(bookingDto, booking);
        return booking;
    }
}
