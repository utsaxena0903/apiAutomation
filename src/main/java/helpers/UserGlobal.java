package helpers;

import apiRequestBuilder.CreateUser;
import apiRequestBuilder.GetUser;
import exceptions.CreateUserException;
import util.GenericMethods;
import validator.global.CustomAssert;

public class UserGlobal {

    private static volatile UserGlobal instance;
    GenericMethods gm = new GenericMethods();

    private UserGlobal() {
    }

    public static UserGlobal getInstance() {
        if (instance == null) {
            synchronized (UserGlobal.class) {
                if (instance == null) {
                    instance = new UserGlobal();
                }
            }
        }
        return instance;
    }

    public CreateUser createUserWithValidData() {
        try {
            CreateUser createUser = new CreateUser(CreateUser.DEFAULT_CREATEUSER_REQUEST);
            createUser.getRequestPojo().withFirstName(gm.randomName(8)).withLastName(gm.randomName(8)).withEmail(gm.randomEmail(8, 5)).withDayOfBirth(gm.randomDOB());
            createUser.createRequestJsonAndExecute();
            CustomAssert.assertEquals(createUser.getApiResponse().getStatusCode(), 201,"Validating the API Status code");
            return createUser;
        } catch (AssertionError e) {
            throw new CreateUserException("User not created: " + e);
        }
    }

    public GetUser getUserDetails(CreateUser createUser) {
        GetUser getUser = new GetUser(createUser.getResponsePojo().getId());
        getUser.createRequestJsonAndExecute();
        return getUser;
    }
}
