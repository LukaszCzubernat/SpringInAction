package ogre.spittr;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spitter {

    long spitterId;
    @NotNull
    @Size(min = 2, max = 30)
    String firstName;

    @NotNull
    @Size(min = 2, max = 30)
    String lastName;

    @NotNull
    @Size(min = 5, max = 40)
    String email;

    @NotNull
    @Size(min = 5, max = 16)
    String userName;

    @NotNull
    @Size(min = 2, max = 25)
    String password;

    public Spitter() {}

    public Spitter(String userName, String password, String email, String firstName, String lastName) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Spitter(long spitterId, String userName, String password, String email, String firstName, String lastName) {
        this.spitterId = spitterId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getSpitterId() {
        return spitterId;
    }

    public void setSpitterId(long spitterId) {
        this.spitterId = spitterId;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "firstName", "lastName", "userName");
    }

    @Override public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "firstName", "lastName", "userName");
    }
}
