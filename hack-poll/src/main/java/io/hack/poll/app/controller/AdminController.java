package io.hack.poll.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.hack.poll.app.dto.UserDto;
import io.hack.poll.app.exception.ResourceNotFoundException;
import io.hack.poll.app.mapper.DtoModalMapper;
import io.hack.poll.app.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@Autowired
	private DtoModalMapper mapper;
	
	@PostMapping("/admin")
	public ResponseEntity<UserDto> addUser(@RequestBody @Valid UserDto user){
		return new ResponseEntity<UserDto>(mapper.userToDto(service.addUser(user)), HttpStatus.OK);
	}
	
	@DeleteMapping("/admin/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable(name = "userId",required = true) int userId){
		if(service.removeUser(userId))
			return new ResponseEntity<>(HttpStatus.OK);
		throw new ResourceNotFoundException(userId+" not exists");
	}
}
