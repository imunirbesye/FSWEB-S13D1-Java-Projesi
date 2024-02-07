package tr.com.workintech.model;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("---------------------");

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println("---------------------");

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println("---------------------");

        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        System.out.println("---------------------");

        System.out.println(area(5.0));
        System.out.println(area(-1));
    }

    public static boolean shouldWakeUp(boolean isBarking, int zaman){
        if(!isBarking){
            return false;
        } else return (zaman > 20 && zaman < 23) || (zaman >= 0 && zaman < 8);
    }

    public static boolean hasTeen(int first, int second, int third) {
        return first >= 13 && first <= 19 || second >= 13 && second <= 19 || third >= 13 && third <= 19;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp){
        if(isSummer && (temp >= 35 && temp <= 45)) return true;
        else return !isSummer && (temp >= 25 && temp <= 35);
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0) return -1;

        return x * y;
    }

    public static double area(double radius){
        if(radius < 0) return -1;

        return Math.pow(radius, 2) * Math.PI;
    }
}