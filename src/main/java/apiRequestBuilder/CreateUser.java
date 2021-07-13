package apiRequestBuilder;

import io.restassured.response.Response;
import model.PostRequest.CreateUserRequest;
import model.PostRequest.CreateUserResponse;
import util.APIEndPoints;
import util.BaseApi;
import util.JacksonJsonImpl;
import util.LocalConfig;

import java.io.IOException;

public class CreateUser extends BaseApi implements APIInterface {

    public static final String DEFAULT_CREATEUSER_REQUEST = "{\"firstName\":\"testFirstName\",\"lastName\":\"testLastName\",\"email\":\"testEmail@gmail.com\",\"dayOfBirth\":\"1994-03-09\"}";
    private CreateUserRequest createUserRequest;
    private CreateUserResponse createUserResponse;
    private Response response;
    private String request;

    public CreateUser(String request) {
        setContentType(ContentType.JSON); //setting the content type application/json
        setMethod(MethodType.POST); //setting method type
        setBaseUri(LocalConfig.USER_MANAGER); //setting base URL
        setBasePath(APIEndPoints.CreateUser.CREATEUSER); //setting base path /api/users
        this.request = request;
        if (this.request != "") {
            try {
                createUserRequest = JacksonJsonImpl.getInstance().fromJson(this.request,
                        CreateUserRequest.class);
                System.out.println("------------Creating User------------");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public CreateUserRequest getRequestPojo() {
        return createUserRequest;
    }

    public CreateUserResponse getResponsePojo() {
        return createUserResponse;
    }

    public Response getApiResponse() {
        return response;
    }

    public void createRequestJsonAndExecute() {
        try {
            if (this.request != "")
                this.request = JacksonJsonImpl.getInstance().toJSon(createUserRequest); //converting POJO request to JSON
            setBody(request); //Set to builder method
            response = execute();
            createUserResponse = JacksonJsonImpl.getInstance().fromJson(response.asString(),
                    CreateUserResponse.class); //convert the response to POJO
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
