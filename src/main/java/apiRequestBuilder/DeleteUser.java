package apiRequestBuilder;

import io.restassured.response.Response;
import model.PostRequest.CreateUserResponse;
import model.PostRequest.CreateUserRequest;
import util.APIEndPoints;
import util.BaseApi;
import util.LocalConfig;

public class DeleteUser extends BaseApi implements APIInterface {

    private Response response;
    private String request;

    public DeleteUser(int id) {
        setContentType(ContentType.JSON); //setting the content type application/json
        setMethod(MethodType.DELETE); //setting method type
        setBaseUri(LocalConfig.USER_MANAGER); //setting base URL
        setBasePath(APIEndPoints.DeleteUser.DELETEUSER); //setting base path /api/users
        addPathParam("id", id); //setting path param value e.g /api/users/{id}
        this.request = request;
    }

    public CreateUserRequest getRequestPojo() {
        return null;
    }

    public CreateUserResponse getResponsePojo() {
        return null;
    }

    public Response getApiResponse() {
        return response;
    }

    public void createRequestJsonAndExecute() {
        response = execute();
    }
}
