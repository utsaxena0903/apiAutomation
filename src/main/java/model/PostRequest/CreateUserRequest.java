package model.PostRequest;

import apiRequestBuilder.APIInterface;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CreateUserRequest implements APIInterface.RequestPojo{

    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("dayOfBirth")
    private String dayOfBirth;

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public CreateUserRequest withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CreateUserRequest withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public CreateUserRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("dayOfBirth")
    public String getDayOfBirth() {
        return dayOfBirth;
    }

    @JsonProperty("dayOfBirth")
    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public CreateUserRequest withDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("firstName", firstName).append("lastName", lastName)
                .append("email", email).append("dayOfBirth", dayOfBirth).toString();
    }
}
