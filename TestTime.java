// TestTime.java for qap 1
// By Brian Jackman
// 09/24/2024

public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set their time
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // Call nextSecond() for t1 and previousSecond() for t2
        t1.nextSecond();
        t2.previousSecond();

        // Display the final times
        System.out.println("Time t1: " + t1.toString());
        System.out.println("Time t2: " + t2.toString());
    }
}