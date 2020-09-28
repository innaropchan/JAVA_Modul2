package de.telran.application;

import de.telran.data.DayOfWeek;
import de.telran.data.Schedule;
import de.telran.data.WeekDay;

import java.util.Arrays;

public class EnumApp {

    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.MONDAY;

       // System.out.println(weekDay);

        DayOfWeek monday = DayOfWeek.MONDAY;
        System.out.println(DayOfWeek.FRIDAY.ordinal());
        System.out.println(Arrays.toString(DayOfWeek.values()));

        Schedule schedule = new Schedule(DayOfWeek.MONDAY);
        schedule.wakeUp();
        schedule.getMenu();
    }
}
