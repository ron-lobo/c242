package org.ron.enums;

import java.time.LocalDate;
import java.time.Month;

public enum Season {

    SPRING(Month.MARCH, 20),
    SUMMER(Month.JUNE, 21),
    AUTUMN(Month.SEPTEMBER, 23, "Fall"),
    WINTER(Month.DECEMBER, 22);

    private int day;
    private Month month;
    private String altName;

    Season(Month month, int day) {
        this(month, day, null);
    }

    Season(Month month, int day, String altName) {
        this.day = day;
        this.month = month;
        this.altName = altName;
    }

    public Month getStartMonth() {
        return month;
    }

    public String getAltName() {
        return altName == null ? getPrintableValue() : altName;
    }

    public LocalDate getStartDate() {
        return LocalDate.of(LocalDate.now().getYear(), month, day);
    }

    public LocalDate getNextStartDate() {
        LocalDate now = LocalDate.now();
        LocalDate ld = LocalDate.of(now.getYear(), month, day);
        if (ld.isBefore(now)) {
            ld = LocalDate.of(ld.getYear() + 1, month, day);
        }
        return ld;
    }

    public String getPrintableValue() {
        String s = this.toString();
        return s.charAt(0) + s.substring(1).toLowerCase();
    }

    public static Season getSeason(String seasonStr) {
        for (Season season : values()) {
            if (season.name().equalsIgnoreCase(seasonStr) ||
                    (season.altName != null && season.altName.equalsIgnoreCase(seasonStr))
            ) {
                return season;
            }
        }
        System.err.println("Unknown season! " + seasonStr);
        return null;
    }

    public static Season getSeason_v1(String seasonStr) {
        try {
            return Season.valueOf(seasonStr.toUpperCase());
        } catch (Exception e) {
            System.err.println("Unknown season! " + seasonStr);
            return null;
        }
    }
}
