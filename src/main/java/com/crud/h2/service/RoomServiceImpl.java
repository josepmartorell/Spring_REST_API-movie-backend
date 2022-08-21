package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IRoomDAO;
import com.crud.h2.dto.Room;

@Service
public class RoomServiceImpl implements IRoomService{
	
	@Autowired
	IRoomDAO iRoomDAO;

	@Override
	public List<Room> listRooms() {
		// TODO Auto-generated method stub
		return iRoomDAO.findAll();
	}

	@Override
	public Room saveRoom(Room room) {
		// TODO Auto-generated method stub
		return iRoomDAO.save(room);
	}

	@Override
	public Room roomXID(int id) {
		// TODO Auto-generated method stub
		return iRoomDAO.findById(id).get();
	}

	@Override
	public Room updateRoom(Room room) {
		// TODO Auto-generated method stub
		return iRoomDAO.save(room);
	}

	@Override
	public void eliminateRoom(int id) {
		// TODO Auto-generated method stub
		iRoomDAO.deleteById(id);
		
	}

}
