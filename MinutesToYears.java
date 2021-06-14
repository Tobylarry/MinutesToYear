public class MinutesToYears {
    public static void main(String[] args) {
printYearsAndDays(525600);
    }
    public static void printYearsAndDays (long minutes){
        if (minutes < 0){
            System.out.println("Invalide Value");
        }else {
            int hour = (int)(minutes/60);
            int day = (hour/24);
            int year = (day/365);
            int remDay = (day%365);

            System.out.println(minutes + " min = " + year + " y and " + remDay + " d");
        }
    }
}
