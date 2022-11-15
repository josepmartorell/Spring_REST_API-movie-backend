package com.crud.h2.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IFilmDAO;
import com.crud.h2.dao.IRoomDAO;
import com.crud.h2.dto.Film;
import com.crud.h2.dto.Room;
import com.crud.h2.exception.ResourceNotFoundException;

@Service
public class RoomServiceImpl{
	
	@Autowired
	IFilmDAO iFilmDAO;
	
	@Autowired
	IRoomDAO iRoomDAO;

	
    public List<Room> getRooms() {
    	return iRoomDAO.findAll();
	}
	
    public Optional<Room> getRoomById(int roomId) {
        if (!iRoomDAO.existsById(roomId)) {
            throw new ResourceNotFoundException("Room with id " + roomId + " not found");
        }
        return iRoomDAO.findById(roomId);
    }


    public Room createRoom(int filmId, Room room) {
        Set<Room> rooms = new HashSet<>();
        Film film = new Film();

        Optional<Film> byId = iFilmDAO.findById(filmId);
        if (!byId.isPresent()) {
            throw new ResourceNotFoundException("Film with id " + filmId + " does not exist");
        }
        Film film1 = byId.get();

        //tie Film to Room
        room.setFilm(film1);

        Room room1 = iRoomDAO.save(room);
        //tie Room to Film
        rooms.add(room1);
        film.setRooms(rooms);

        return room1;

    }
    

}
