package systemTesting.userDetails;

import apiRequestBuilder.CreateUser;
import apiRequestBuilder.GetUser;
import helpers.UserGlobal;
import org.testng.annotations.Test;
import util.GenericMethods;
import validator.ValidateUserResponse;
import validator.global.CustomAssert;

public class GetUserInfoTest {
    GenericMethods gm = new GenericMethods();

    @Test(description = "Get valid user details")
    public void TC001_GetValidUserDetails() {
        CreateUser createUser = UserGlobal.getInstance().createUserWithValidData();
        GetUser getUser = new GetUser(createUser.getResponsePojo().getId());
        getUser.createRequestJsonAndExecute();
        CustomAssert.assertEquals(getUser.getApiResponse().getStatusCode(), 200,"Validating the API Status code");
        ValidateUserResponse.getInstance().validateUserDetails(getUser, createUser);
    }
}
