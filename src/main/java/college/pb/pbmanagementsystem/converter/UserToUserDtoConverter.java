package college.pb.pbmanagementsystem.converter;

import college.pb.pbmanagementsystem.model.dto.UserDto;
import college.pb.pbmanagementsystem.model.entity.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserToUserDtoConverter implements Converter<User, UserDto> {

    @Override
    public UserDto convert(User user) {
        return new UserDto(user.getId(), user.getName(), user.getEmail(), user.getUserType());
    }
}
