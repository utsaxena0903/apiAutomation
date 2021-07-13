package model.GetRequest;

import apiRequestBuilder.APIInterface;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class GetUserResponse implements APIInterface.ResponsePojo {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("dayOfBirth")
    private String dayOfBirth;
    @JsonProperty("content")
    private List<Object> content = null;
    @JsonProperty("links")
    private List<GetUserResponse.Link> links = null;
    @JsonProperty("status")
    private String status;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("message")
    private String message;
    @JsonProperty("debugMessage")
    private String debugMessage;
    @JsonProperty("subErrors")
    private Object subErrors;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public GetUserResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public GetUserResponse withFirstName(String firstName) {
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

    public GetUserResponse withLastName(String lastName) {
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

    public GetUserResponse withEmail(String email) {
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

    public GetUserResponse withDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
        return this;
    }

    @JsonProperty("content")
    public List<Object> getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(List<Object> content) {
        this.content = content;
    }

    public GetUserResponse withContent(List<Object> content) {
        this.content = content;
        return this;
    }

    @JsonProperty("links")
    public List<GetUserResponse.Link> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<GetUserResponse.Link> links) {
        this.links = links;
    }

    public GetUserResponse withLinks(List<GetUserResponse.Link> links) {
        this.links = links;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public GetUserResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public GetUserResponse withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public GetUserResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    @JsonProperty("debugMessage")
    public String getDebugMessage() {
        return debugMessage;
    }

    @JsonProperty("debugMessage")
    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }

    public GetUserResponse withDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
        return this;
    }

    @JsonProperty("subErrors")
    public Object getSubErrors() {
        return subErrors;
    }

    @JsonProperty("subErrors")
    public void setSubErrors(Object subErrors) {
        this.subErrors = subErrors;
    }

    public GetUserResponse withSubErrors(Object subErrors) {
        this.subErrors = subErrors;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("firstName", firstName).append("lastName", lastName).append("email", email).append("dayOfBirth", dayOfBirth).append("links", links).append("content",content).append("status",status).append("timestamp",timestamp).append("message",message).append("debugMessage",debugMessage).append("subErrors",subErrors).toString();
    }

    //Fetching Link details
    public static class Link {

        @JsonProperty("rel")
        private String rel;
        @JsonProperty("href")
        private String href;

        @JsonProperty("rel")
        public String getRel() {
            return rel;
        }

        @JsonProperty("rel")
        public void setRel(String rel) {
            this.rel = rel;
        }

        public GetUserResponse.Link withRel(String rel) {
            this.rel = rel;
            return this;
        }

        @JsonProperty("href")
        public String getHref() {
            return href;
        }

        @JsonProperty("href")
        public void setHref(String href) {
            this.href = href;
        }

        public GetUserResponse.Link withHref(String href) {
            this.href = href;
            return this;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).append("rel", rel).append("href", href).toString();
        }
    }
}
