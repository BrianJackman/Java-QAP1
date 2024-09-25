// Time.java for qap 1
// By Brian Jackman
// 09/24/2024

public class Time {
    // Private fields for hour, minute, and second
    private int hour;
    private int minute;
    private int second;

    // Constructor to initialize the time
    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Get method for hour
    public int getHour() {
        return hour;
    }

    // Get method for minute
    public int getMinute() {
        return minute;
    }

    // Get method for second
    public int getSecond() {
        return second;
    }

    // Set method for hour with validation
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
        this.hour = hour;
    }

    // Set method for minute with validation
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
        this.minute = minute;
    }

    // Set method for second with validation
    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }
        this.second = second;
    }

    // Method to set the time with hour, minute, and second
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // Override toString() method to provide a string representation of the time
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Method to increase the time by one second
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Method to decrease the time by one second
    public Time previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}