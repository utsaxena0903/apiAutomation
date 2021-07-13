package systemTesting.userDetails;

import apiRequestBuilder.CreateUser;
import apiRequestBuilder.DeleteUser;
import helpers.UserGlobal;
import org.testng.annotations.Test;
import util.GenericMethods;
import validator.ValidateUserResponse;
import validator.global.CustomAssert;

public class DeleteUserTest {
    GenericMethods gm = new GenericMethods();

    @Test(description = "Delete a valid user details")
    public void TC001_DeleteValidUser() {
        CreateUser createUser = UserGlobal.getInstance().createUserWithValidData();
        DeleteUser deleteUser = new DeleteUser(createUser.getResponsePojo().getId());
        deleteUser.createRequestJsonAndExecute();
        CustomAssert.assertEquals(deleteUser.getApiResponse().getStatusCode(), 204, "Validating the API Status code");
        ValidateUserResponse.getInstance().validateUserDeletion(createUser);
    }
}
