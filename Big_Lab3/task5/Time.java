package lab3.task5;
public class Time implements Comparable<Time> {
    private int hour, minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int compareTo(Time o) {
        if (hour != o.hour) return hour - o.hour;
        return minute - o.minute;
    }
}