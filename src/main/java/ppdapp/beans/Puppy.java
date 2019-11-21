package ppdapp.beans;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="puppy")
public class Puppy {
	   @Id
	    @GeneratedValue
	    private int id;

	    @NotNull
	    @Size(min=2, max=15, message = "Name must be between 2 - 15 characters.")
	    private String name;

	    @NotNull
	    private DogBreeds breed;

	    @NotNull
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date birthday;

	    @NotNull
	    @Size(min=2, max=15)
	    private String size;

	    @ManyToOne
	    private User user;

	    @NotNull
	    @Size(min=0, max=250, message = "Description must be between 0 - 250 characters.")
	    private String description;

	    public Puppy(String name, DogBreeds breed, Date birthday, String size, User user, String description) {
	        this.name = name;
	        this.breed = breed;
	        this.birthday = birthday;
	        this.size = size;
	        this.user = user;
	        this.description = description;
	    }

	    public Puppy() { }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Date getBirthday() {
	        return birthday;
	    }

	    public void setBirthday(Date birthday) {
	        this.birthday = birthday;
	    }

	    public DogBreeds getBreed() {
	        return breed;
	    }

	    public void setBreed(DogBreeds breed) {
	        this.breed = breed;
	    }

	    public String getSize() {
	        return size;
	    }

	    public void setSize(String size) {
	        this.size = size;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

}
