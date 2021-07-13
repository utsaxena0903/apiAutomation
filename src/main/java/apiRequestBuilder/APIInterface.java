package apiRequestBuilder;

import io.restassured.response.Response;

public interface APIInterface {

    RequestPojo getRequestPojo();

    ResponsePojo getResponsePojo();

    Response getApiResponse();

    void createRequestJsonAndExecute();

    interface ResponsePojo{
    }

    interface RequestPojo{
    }

}
