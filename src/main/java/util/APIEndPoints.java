package util;

public class APIEndPoints {
    public static class CreateUser {
        public static final String CREATEUSER = "/api/users";
    }

    public static class GetUser {
        public static final String GETUSER = "/api/users/{id}";
    }

    public static class DeleteUser {
        public static final String DELETEUSER = "/api/users/{id}";
    }
}
