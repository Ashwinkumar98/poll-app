package io.hack.poll.app.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.hack.poll.app.dto.UserDto;
import io.hack.poll.app.model.User;

@Component
public class DtoModalMapper {
	
	@Autowired
	private ModelMapper mapper;
	
	public User DtoToUser(UserDto dto) {
		return mapper.map(dto, User.class);
	}
	
	public UserDto userToDto(User user) {
		return mapper.map(user, UserDto.class);
	}

}
