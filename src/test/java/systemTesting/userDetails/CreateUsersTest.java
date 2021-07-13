package systemTesting.userDetails;

import apiRequestBuilder.CreateUser;
import org.testng.annotations.Test;
import util.GenericMethods;
import validator.ValidateUserResponse;
import validator.global.CustomAssert;

public class CreateUsersTest {
    GenericMethods gm = new GenericMethods();

    @Test(description = "Create a user with valid details")
    public void TC001_CreateUserWithValidData() {
        CreateUser createUser = new CreateUser(CreateUser.DEFAULT_CREATEUSER_REQUEST);
        createUser.getRequestPojo().withFirstName(gm.randomName(8)).withLastName(gm.randomName(8)).withEmail(gm.randomEmail(8,5)).withDayOfBirth(gm.randomDOB());
        createUser.createRequestJsonAndExecute();
        CustomAssert.assertEquals(createUser.getApiResponse().getStatusCode(), 201,"Validating the API Status code");
        ValidateUserResponse.getInstance().validateUserCreation(createUser);
    }
}
