package validator;

import apiRequestBuilder.CreateUser;
import apiRequestBuilder.GetUser;
import helpers.UserGlobal;
import validator.global.CustomAssert;
import validator.global.CustomSoftAssert;

public class ValidateUserResponse {
    private static volatile ValidateUserResponse instance;

    private ValidateUserResponse() {
    }

    public static ValidateUserResponse getInstance() {
        if (instance == null) {
            synchronized (ValidateUserResponse.class) {
                if (instance == null) {
                    instance = new ValidateUserResponse();
                }
            }
        }
        return instance;
    }

    public void validateUserCreation(CreateUser createUser) {
        CustomSoftAssert csa = new CustomSoftAssert();
        csa.assertEquals(createUser.getResponsePojo().getFirstName(), createUser.getRequestPojo().getFirstName(), "Validating First Name: ");
        csa.assertEquals(createUser.getResponsePojo().getLastName(), createUser.getRequestPojo().getLastName(), "Validating Last Name: ");
        csa.assertEquals(createUser.getResponsePojo().getEmail(), createUser.getRequestPojo().getEmail(), "Validating Email: ");
        csa.assertEquals(createUser.getResponsePojo().getDayOfBirth(), createUser.getRequestPojo().getDayOfBirth(), "Validating DOB: ");
        csa.assertEquals(true, createUser.getResponsePojo().getId() != null, "Validating ID Generation: ");
        csa.assertAll();
    }

    public void validateUserDetails(GetUser getUser, CreateUser createUser) {
        CustomSoftAssert csa = new CustomSoftAssert();
        csa.assertEquals(getUser.getResponsePojo().getFirstName(), createUser.getRequestPojo().getFirstName(), "Validating First Name: ");
        csa.assertEquals(getUser.getResponsePojo().getLastName(), createUser.getRequestPojo().getLastName(), "Validating Last Name: ");
        csa.assertEquals(getUser.getResponsePojo().getEmail(), createUser.getRequestPojo().getEmail(), "Validating Email: ");
        csa.assertEquals(getUser.getResponsePojo().getDayOfBirth(), createUser.getRequestPojo().getDayOfBirth(), "Validating DOB: ");
        csa.assertEquals(getUser.getResponsePojo().getId(), createUser.getResponsePojo().getId(), "Validating ID: ");
        csa.assertAll();
    }

    public void validateUserDeletion(CreateUser createUser) {
        GetUser getUser = UserGlobal.getInstance().getUserDetails(createUser);
        CustomAssert.assertEquals(getUser.getApiResponse().getStatusCode(), 404,"Validating the API Status code");
    }
}
