package co.develhope.UploaderDownloader.entities;


import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table (indexes = {
        @Index(unique = true, name = "email_idx", columnList = "email")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    //scrivo Long con maiuscola cosi diventa ogetto e posso crearlo nullo

    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String profilePicture;




    public User(){}
    public User(long id, String firstName, String lastName, String email, String profilePicture){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.profilePicture = profilePicture;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}
