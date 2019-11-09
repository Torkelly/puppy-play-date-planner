package ppdapp.beans;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;

@Entity
@TableGenerator(name="playdate")
public class PlayDate {
	  @Id
	    @GeneratedValue
	    private int id;

	    @NotNull
	    private DogParks dogParkLocation;

	    @NotNull
	    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	    private Date date;

	    @NotNull
	    @Size(min = 2, message = "Please provide a message.")
	    private String description;

	    @ManyToMany(mappedBy="playdates")
	    @OrderColumn
	    private Set<User> users = new HashSet<>();

	    public PlayDate(int id, DogParks dogParkLocation, Date date, String description, Set<User> users) {
	        this.id = id;
	        this.dogParkLocation = dogParkLocation;
	        this.date = date;
	        this.description = description;
	        this.users = users;
	    }

	    public PlayDate() {
	    }

	    @Override
	    public int compareTo(PlayDate o) {
	        if (this.date.compareTo(o.date) > 0) {
	            return 1;
	        } else if (this.date.compareTo(o.date) < 0) {
	            return -1;
	        } else {
	            return 0;
	        }
	    }

	    public Set<User> getUsers() {
	        return users;
	    }

	    public void setUsers(Set<User> users) {
	        this.users = users;
	    }

	    public void addUser(User user) {
	        this.users.add(user);
	    }

	    public int getId() {
	        return id;
	    }

	    public DogParks getDogParkLocation() {
	        return dogParkLocation;
	    }

	    public void setDogParkLocation(DogParks dogParkLocation) {
	        this.dogParkLocation = dogParkLocation;
	    }

	    public Date getDate() {
	        return date;
	    }

	    public void setDate(Date date) {
	        this.date = date;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

}
