package com.crud.h2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Room;
import com.crud.h2.service.FilmServiceImpl;
import com.crud.h2.service.RoomServiceImpl;

@RestController
@RequestMapping("/api")
public class RoomController {
	
	@Autowired
	RoomServiceImpl roomServiceImpl;
	
	@Autowired
	FilmServiceImpl filmServiceImpl;
		
    @RequestMapping(value = "/getAllRooms", method = RequestMethod.GET)
    public List<Room> getRooms() {
        return roomServiceImpl.getRooms();
    }
	
    @RequestMapping(value = "/{film_id}/room", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Room createRoom(@PathVariable(value = "film_id") int film_id, @RequestBody Room room) {
        return roomServiceImpl.createRoom(film_id, room);
    }

    @RequestMapping(value = "/room/{roomId}", method = RequestMethod.GET)
    public Optional<Room> getRoomById(@PathVariable(value = "roomId") int roomId) {
        return roomServiceImpl.getRoomById(roomId);
    }
	

}
