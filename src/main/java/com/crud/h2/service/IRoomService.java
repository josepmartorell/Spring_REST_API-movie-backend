package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Room;

public interface IRoomService {
	
	//CRUD methods
	public List<Room> listRooms(); //List All 
	
	public Room saveRoom(Room room);	//CREATE
	
	public Room roomXID(int id); //READ
	
	public Room updateRoom(Room room); //UPDATE
	
	public void eliminateRoom(int id);//DELETE

}
