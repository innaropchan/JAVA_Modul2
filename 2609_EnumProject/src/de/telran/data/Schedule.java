package de.telran.data;

public class Schedule {
    private DayOfWeek dayOfWeek;

    public Schedule(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void wakeUp() {
        if (getDayOfWeek() == DayOfWeek.SATURDAY || getDayOfWeek() == DayOfWeek.SUNDAY){ // if (dayOfWeek.ordinal()>4) another variant
            System.out.println("you can sleep longer");
        }
       else {
            System.out.println("you need wake up");
        }
    }
    public void getMenu(){
        switch (dayOfWeek){
            case MONDAY:
                System.out.println("Spaghetti");
                break;
            case TUESDAY:
                System.out.println("Chicken");
                break;
            case WEDNESDAY:
                System.out.println("Pizza");
                break;
            case THURSDAY:
                System.out.println("Fish chips");
                break;
            case FRIDAY:
                System.out.println("Burger");
                break;
            case SATURDAY:
                System.out.println("Pelmeni");
                break;
            case SUNDAY:
                System.out.println("Borsch");
                break;
        }
    }
}
