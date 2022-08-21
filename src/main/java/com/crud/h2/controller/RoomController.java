package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Room;
import com.crud.h2.service.RoomServiceImpl;

@RestController
@RequestMapping("/api")
public class RoomController {
	
	@Autowired
	RoomServiceImpl roomServiceImpl;
	
	@GetMapping("/rooms")
	public List<Room> listRooms(){
		return roomServiceImpl.listRooms();		
	}
	
	@PostMapping("/rooms")
	public Room saveRoom(@RequestBody Room room) {
		return roomServiceImpl.saveRoom(room);
	}
	
	@GetMapping("/rooms/{id}")
	public Room roomXID(@PathVariable(name="id")int id) {
		Room room_xid = new Room();
		//we store in room_xid what the service method returns
		room_xid = roomServiceImpl.roomXID(id);
		return room_xid;		
	}
	
	@PutMapping
	public Room updateRoom(@PathVariable(name="id")int id ,@RequestBody Room room) {
		Room selected_room = new Room();
		Room updated_room = new Room();
		selected_room.setName(room.getName());
		selected_room.setFilm(room.getFilm());
		//apply service method
		updated_room = roomServiceImpl.updateRoom(selected_room);	
		return updated_room;		
	}
	
	@DeleteMapping
	public void eliminateRoom(@PathVariable(name="id")int id) {
		roomServiceImpl.eliminateRoom(id);
	}
	

}
