package org.ron.enums;

public class EnumUser {

    public static void main(String[] args) {
        EnumUser enumUser = new EnumUser();
        enumUser.useGender();
        enumUser.seasons();
    }

    private void seasons() {
        for (Season season : Season.values()) {
            System.out.println("season = " + season + ", " + season.getPrintableValue() +
                    " starts in " + season.getStartMonth() +
                    ", alternative name = " + season.getAltName() +
                    ", starts on " + season.getStartDate() +
                    ", next starts on " + season.getNextStartDate());
        }
        System.out.println();

//        List<String> dbVals1 = List.of("Spring", "Summer", "Wintr", "Fall", "winter");
        String[] dbVals = new String[]{"Spring", "Summer", "Wintr", "Fall", "winter", null};
        for (String dbVal : dbVals) {
            System.out.printf("val=%s, season=%s %n", dbVal, Season.getSeason(dbVal));
        }
    }

    private void useGender() {

        boolean isMale = true;
        Boolean isAMale = null;
        Gender gender = Gender.MALE;

        String s = "";
        if (isMale) {
            s = "he";
        } else {
            s = "she";
        }
        String s2 = isMale ? "he" : "she";

    }


}
