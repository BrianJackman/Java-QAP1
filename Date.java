// Date.java for qap 1
// By Brian Jackman
// 09/24/2024

public class Date {
    // Private fields for day, month, and year
    private int day;
    private int month;
    private int year;

    // Constructor to initialize the date
    public Date(int day, int month, int year) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        if (year < 1900 || year > 9999) {
            throw new IllegalArgumentException("Year must be between 1900 and 9999");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Get method for day
    public int getDay() {
        return day;
    }

    // Get method for month
    public int getMonth() {
        return month;
    }

    // Get method for year
    public int getYear() {
        return year;
    }

    // Set method for day with validation
    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }
        this.day = day;
    }

    // Set method for month with validation
    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        this.month = month;
    }

    // Set method for year with validation
    public void setYear(int year) {
        if (year < 1900 || year > 9999) {
            throw new IllegalArgumentException("Year must be between 1900 and 9999");
        }
        this.year = year;
    }

    // Method to set the date with day, month, and year
    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    // Override toString() method to provide a string representation of the date
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}