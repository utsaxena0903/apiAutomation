package apiRequestBuilder;

import io.restassured.response.Response;
import model.GetRequest.GetUserResponse;
import model.PostRequest.CreateUserRequest;
import util.APIEndPoints;
import util.BaseApi;
import util.JacksonJsonImpl;
import util.LocalConfig;

import java.io.IOException;

public class GetUser extends BaseApi implements APIInterface {

    private GetUserResponse getUserResponse;
    private Response response;
    private String request;

    public GetUser(int id) {
        setContentType(ContentType.JSON); //setting the content type application/json
        setMethod(MethodType.GET); //setting method type
        setBaseUri(LocalConfig.USER_MANAGER); //setting base URL
        setBasePath(APIEndPoints.GetUser.GETUSER); //setting base path /api/users
        addPathParam("id", id); //setting path param value e.g /api/users/{id}
        this.request = request;
    }

    public CreateUserRequest getRequestPojo() {
        return null;
    }

    public GetUserResponse getResponsePojo() {
        return getUserResponse;
    }

    public Response getApiResponse() {
        return response;
    }

    public void createRequestJsonAndExecute() {
        try {
            if (this.request != "")
                response = execute();
            if (response.getStatusCode()==200){
                getUserResponse = JacksonJsonImpl.getInstance().fromJson(response.asString(),
                        GetUserResponse.class); //convert the response to POJO
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
