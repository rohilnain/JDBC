package Enums;

public class Client {
    public static void main(String[] args) {
        System.out.println(DaysOfTheWeek.MONDAY);
        System.out.println(DaysOfTheWeek.MONDAY.getDay());

        System.out.println(DaysOfTheWeek.SATURDAY);
        System.out.println(DaysOfTheWeek.SATURDAY.getShortName());

        //name() and toString are same for enum
        System.out.println(DaysOfTheWeek.WEDNESDAY.toString());
        System.out.println(DaysOfTheWeek.WEDNESDAY.name());

        //values() method gives all values of enum
        for(DaysOfTheWeek i:DaysOfTheWeek.values()){
            System.out.println(i);
            System.out.println(i.getShortName());
            System.out.println(i.ordinal());
        }

        //DaysOfTheWeek d = DaysOfTheWeek.valueOf("fgggh");
        DaysOfTheWeek d1 = DaysOfTheWeek.SUNDAY;

        //System.out.println(d);
        System.out.println(d1);


    }
}
