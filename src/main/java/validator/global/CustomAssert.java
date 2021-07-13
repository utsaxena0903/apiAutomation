package validator.global;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.testng.Assert;

public class CustomAssert {
    private List<Throwable> m_errors;

    private CustomAssert() {
    }

    public static void assertTrue(boolean condition, String message) {
        Assert.assertTrue(condition, message);
    }

    public static void assertNotNull(Object condition, String message) {
        Assert.assertNotNull(condition, message);
    }

    public static void assertFalse(boolean condition, String message) {
        Assert.assertTrue(!condition, message);
    }

    public static void assertEquals(String actual, String expected, String message) {
        Assert.assertEquals(actual, expected, message);
        String str = message + "<br><b>Actual : </b>" + actual + "<br><b>Expected : </b>" + expected;
    }

    public static void assertEquals(Boolean actual, Boolean expected, String message) {
        Assert.assertEquals(actual, expected, message);
        String str = message + "<br><b>Actual : </b>" + actual + "<br><b>Expected : </b>" + expected;
    }

    public static void assertEquals(Object actual, Object expected, String message) {
        Assert.assertEquals(actual, expected, message);
        String str = message + "<br><b>Actual : </b>" + actual + "<br><b>Expected : </b>" + expected;
    }

    public static void assertEquals(double actual, double expected, String message) {
        Assert.assertEquals(actual, expected, message);
        String str = message + "<br><b>Actual : </b>" + actual + "<br><b>Expected : </b>" + expected;
    }

    public static void assertEquals(int actual, int expected, String message) {
        Assert.assertEquals(actual, expected, message);
        String str = message + "<br><b>Actual : </b>" + actual + "<br><b>Expected : </b>" + expected;
    }

    public static void assertNotEquals(String actual, String expected, String message) {
        Assert.assertNotEquals(actual, expected, message);
        String str = message + "<br><b>Actual : </b>" + actual + "<br><b>Expected : </b>" + expected;
    }

    public static void assertNotEquals(Boolean actual, Boolean expected, String message) {
        Assert.assertNotEquals(actual, expected, message);
        String str = message + "<br><b>Actual : </b>" + actual + "<br><b>Expected : </b>" + expected;
    }

    public static void assertNotEquals(Object actual, Object expected, String message) {
        Assert.assertNotEquals(actual, expected, message);
        String str = message + "<br><b>Actual : </b>" + actual + "<br><b>Expected : </b>" + expected;
    }

    public static void assertNotEquals(double actual, double expected, String message) {
        Assert.assertNotEquals(actual, expected, message);
        String str = message + "<br><b>Actual : </b>" + actual + "<br><b>Expected : </b>" + expected;
    }

    public static void assertNotEquals(int actual, int expected, String message) {
        Assert.assertNotEquals(actual, expected, message);
        String str = message + "<br><b>Actual : </b>" + actual + "<br><b>Expected : </b>" + expected;
    }

    public static void assertContainsIgnoreCase(String completeString, String subString, String message) {
        String str = message + "<br><b>Complete String : </b>" + completeString + "<br><b>Substring : </b>" + subString;
        String errorMessage = message + " -- \nComplete String : " + completeString + "\nSubstring : " + subString + "\n\n";
        Assert.assertTrue(completeString.toLowerCase().contains(subString.toLowerCase()), errorMessage);
    }

    public static void assertEqualsIgnoreCase(String actual, String expected, String message) {
        Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase(), message);
        String str = message + "<br><b>Actual : </b>" + actual + "<br><b>Expected : </b>" + expected;
    }

    public static void assertContains(String completeString, String subString, String message) {
        String str = message + "<br><b>Complete String : </b>" + completeString + "<br><b>Substring : </b>" + subString;
        String errorMessage = message + " -- \nComplete String : " + completeString + "\nSubstring : " + subString + "\n\n";
        Assert.assertTrue(completeString.contains(subString), errorMessage);
    }

    public static void assertNotContains(String completeString, String subString, String message) {
        String str = message + "<br><b>Complete String : </b>" + completeString + "<br><b>Substring : </b>" + subString;
        String errorMessage = message + " -- \nComplete String : " + completeString + "\nSubstring : " + subString + "\n\n";
        Assert.assertTrue(!completeString.contains(subString), errorMessage);
    }

    public static void assertFail(String message) {
        Assert.fail(message);
    }

    public static void compareList(List<String> actual, List<String> expected, String message) {
        assertTrue(compareList(actual, expected), message);
    }

    private static Boolean compareList(List<String> actual, List<String> expected) {
        List<String> expectedEntryL = new ArrayList(expected);
        List<String> actualentryL = new ArrayList(actual);
        if (actualentryL.size() == 0 && expectedEntryL.size() == 0) {
            return true;
        } else if (actualentryL.size() != expectedEntryL.size()) {
            return false;
        } else {
            Boolean flag = false;
            Iterator var5 = expectedEntryL.iterator();

            while(var5.hasNext()) {
                String expectedEntry = (String)var5.next();
                List<String> actualEntryCopy = new ArrayList(actualentryL);

                for(Iterator var8 = actualEntryCopy.iterator(); var8.hasNext(); flag = false) {
                    String actualEntry = (String)var8.next();
                    if (actualEntry.equalsIgnoreCase(expectedEntry)) {
                        flag = true;
                        actualentryL.remove(actualEntry);
                        break;
                    }
                }

                if (!flag) {
                    break;
                }
            }

            return flag;
        }
    }
}
