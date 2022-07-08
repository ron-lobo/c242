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
        useGender(isMale, isAMale, gender);
    }

    private void useGender(boolean isMale, Boolean isAMale, Gender gender) {
        String s = "";
        if (isMale) {
            s = "he";
        } else {
            s = "she";
        }
        String s2 = isMale ? "he" : "she";
        String s3 = isAMale == null ? "null" : isAMale ? "he" : "she";

        String s4 = switch (gender) {
            case MALE -> "he";
            case FEMALE -> "she";
            case DONT_KNOW -> {
                System.out.println("hi there");
                yield "Mx";
            }
            case BOTH -> "shehe";
            default -> null;
        };
    }

    private void x() {
        String xyzHtml = """
                <html>
                    <body>
                        hi mum
                    </body>
                </html>
                                """;
    }
}
