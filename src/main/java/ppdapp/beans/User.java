package ppdapp.beans;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.*;

@Entity
@Table(name="user")
public class User {
		@Id
	    @GeneratedValue
	    @Column(name = "id")
	    private int id;

	    @Column(name = "first_name")
	    @NotEmpty(message = "Please provide your first name")
		private String firstName;

	    @Column(name = "last_name")
		@NotEmpty(message = "Please provide your last name")
		private String lastName;
		
	    
	    private String email;

	    
	    @Column(name = "password")
		@Transient
	    private String password;
	    


	    @Column(name = "description")
	    @Size(min = 0, max = 250, message = "Description cannot exceed 250 characters.")
	    private String description;

	  
	    private DogParks dogParkLocation;
	    
	    @Column(name = "enabled")
		private boolean enabled;


	    public User() {
	    }
	  
	    @OneToMany
	    @JoinTable(name = "user_puppy",
	            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
	            inverseJoinColumns = @JoinColumn(name = "puppy_id", referencedColumnName = "id"))
	    private Set<Puppy> puppies;

	    @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(name = "user_playdate",
	            joinColumns =  @JoinColumn(name = "user_id", referencedColumnName = "id"),
	            inverseJoinColumns = @JoinColumn(name = "playdate_id", referencedColumnName = "id"))
	    private Set<PlayDate> playdates = new TreeSet<>();

	    public Set<PlayDate> getPlaydates(){
	        return playdates;
	    }

	    public void addPlaydate(PlayDate playdate) {
	        this.playdates.add(playdate);
	    }

	    public void setPlaydates(Set<PlayDate> playdates){
	        this.playdates = playdates;
	    }

	    public Set<Puppy> getPuppies(){
	        return this.puppies;
	    }

	    public void setPuppies(Set<Puppy> puppies) {
	        this.puppies = puppies;
	    }
	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public int getId() {
	        return id;
	    }
	    public void seId(int id) {
	        this.id = id;
	    }
	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

		public boolean getEnabled() {
			return enabled;
		}

		public void setEnabled(boolean value) {
			this.enabled = value;
		}

	    public void addPuppy(Puppy puppy) {
	        this.puppies.add(puppy);
	    }

	    public void removePuppy(Puppy puppy) {
	        this.puppies.remove(puppy);
	    }

	    public DogParks getDogParkLocation() {
	        return dogParkLocation;
	    }

	    public void setDogParkLocation(DogParks dogParkLocation) {
	        this.dogParkLocation = dogParkLocation;
	    }

}
