package notebook;

public class Task_2 {
    public static void main(String[] args) {
        int s = 3600;
        int sec, m, min, h, day, week;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        System.out.println(h + " час " + min + " минут " + sec + " секунд");
        week = h * 24;
        week = week % 23;
        day = week * 7;
        System.out.println(day + " дней " + week + " неделя");

    }
}