package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class GenericMethods {

    public String randomName(int length) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(alphabets.charAt(rand.nextInt(alphabets.length())));
        }
        return sb.toString();
    }

    public String randomPhone(int length) {
        String digits = "0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(digits.charAt(rand.nextInt(digits.length())));
        }
        return sb.toString();
    }

    public String randomEmail(int nameLength, int domainLength) {
        return randomName(nameLength).concat("@").concat(randomName(domainLength)).concat(".com");
    }

    public String randomDOB() {
        GregorianCalendar gc = new GregorianCalendar();
        int year = randBetween(1900, gc.get(gc.YEAR));
        gc.set(gc.YEAR, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        System.out.println(gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));
        return randomDate(gc.get(gc.YEAR),(gc.get(gc.MONTH) + 1),gc.get(gc.DAY_OF_MONTH));
    }

    private static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    private static String randomDate(int year, int month, int day) {
        if (day < 10 && !(month <10)) {
            return String.valueOf(year + "-" + month + "-" + "0".concat(String.valueOf(day)));
        }
        else if (!(day < 10) && month <10) {
            return String.valueOf(year + "-" + "0".concat(String.valueOf(month)) + "-" + day);
        }
        else if(day < 10 && month <10){
            return String.valueOf(year + "-" + "0".concat(String.valueOf(month)) + "-" + "0".concat(String.valueOf(day)));
        }
        return String.valueOf(year + "-" + month + "-" + day);
    }
}
