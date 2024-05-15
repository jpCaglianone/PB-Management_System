package college.pb.pbmanagementsystem.converter;

import college.pb.pbmanagementsystem.model.dto.UserDto;
import college.pb.pbmanagementsystem.model.entity.User;
import jakarta.annotation.Nonnull;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserDtoToUserConverter implements Converter<UserDto, User> {

    @Override
    public User convert(@Nonnull UserDto userDto) {
        var user = new User();
        BeanUtils.copyProperties(userDto, user);
        return user;
    }
}
