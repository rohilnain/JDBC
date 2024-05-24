package Enums;

public enum DaysOfTheWeek  {
    SUNDAY("sun",0),
    MONDAY("mon",1),
    TUESDAY("tue",2),
    WEDNESDAY("wed",3),
    THRUSDAY("thr",4),
    FRIDAY("fri",5),
    SATURDAY("sat",6);
    private String shortName;
    private int Day;
    DaysOfTheWeek(String shortName,int Day){
        this.shortName=shortName;
        this.Day=Day;
    }

    public String getShortName() {
        return shortName;
    }

    public int getDay() {
        return Day;
    }
}
