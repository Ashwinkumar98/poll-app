package io.hack.poll.app.service;

import java.util.List;
import java.util.Optional;

import io.hack.poll.app.dto.UserDto;
import io.hack.poll.app.model.User;

public interface UserService {
	List<User> getAllCandidates();
	Optional<User> getCandidateById(int userId);
	Optional<User> updateUser(int userId,UserDto user);
	Optional<User> voteUser(int votee,int voter);
}
