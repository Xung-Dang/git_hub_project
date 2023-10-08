public class Conver_time {
    public static void main(String[] args) {
        System.out.println(convert_seconds(3945));
        System.out.println(convert_mutil(65,45));
    }
    public static String convert_seconds(int seconds){
        int minutes = seconds/60;
        int hours= minutes/60;

        int remainingminutes= minutes%60;
        int reaminingseconds=seconds/60;

        return hours+"h"+remainingminutes+"m"+reaminingseconds+"s";

    }

    public static String convert_mutil(int minutes, int seconds){
        int hours = minutes/60;
        int remainingminutes=minutes%60;
        int remainingseconds= seconds%60;

        return hours+"h"+remainingminutes+"m"+remainingseconds+"s";

    }
}
