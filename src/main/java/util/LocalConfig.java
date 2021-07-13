package util;

public class LocalConfig {
    public static final String USER_MANAGER;
    static {
        try
        {
            PropertyUtils.getInstance().load("config.properties");
            USER_MANAGER = PropertyUtils.getInstance().getValue("USER_MANAGER");
        }
        catch (Throwable t) {
            t.printStackTrace();
            throw new RuntimeException("Something wrong !!! Check configurations.", t);
        }
    }
}
