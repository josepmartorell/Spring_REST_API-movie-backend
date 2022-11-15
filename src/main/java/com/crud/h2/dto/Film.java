package com.crud.h2.dto;
  
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Film")
public class Film implements Serializable {

    @Column(name = "CODE", nullable = false, length = 10)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    
    @Column(name = "Name")
    public String name;
    
	@Column(name="Qualification")
	private int qualification;
	

    @OneToMany(mappedBy = "film", fetch = FetchType.LAZY)
    private Set<Room> rooms = new HashSet<>();

    public Film() {
    }

    //getters and setters omitted for brevity
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
	public int getQualification() {
		return qualification;
	}

	public void setQualification(int qualification) {
		this.qualification = qualification;
	}

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }
    
    
}
	
	




