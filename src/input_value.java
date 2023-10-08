import java.util.Scanner;

public class input_value {

    public static void main(String[] args) {
        int currentyear=2022;

        try {
            System.out.println(getinputfromconsole(currentyear));
        } catch (NullPointerException e){
            System.out.println(getinputfromscanner(currentyear));
        }
    }
    public static String getinputfromconsole(int currentyear){

        String name = System.console().readLine("Name");

        System.out.println("name");

        return "";
    }

    public static String getinputfromscanner(int currentyear){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Name 1");
        String name = scanner.nextLine();

        System.out.println("what year were you born?"+name);

        boolean validob=false;
        int age =0;

        do{
            System.out.println("Enter a year of birth >"+ (currentyear-125) + "and <"+(currentyear));
            String dateofBirth=scanner.nextLine();
            try{
                age = checkdata(currentyear, scanner.nextLine());
                validob = age <0 ?false:true;
            } catch (NumberFormatException badUserData){
                System.out.println("again");
            }

        } while (!validob);


        return "your olds"+age;
    }

    public static int checkdata(int currentyear, String dateofbirth){

        int dob = Integer.parseInt(dateofbirth);
        int minimumyear = currentyear-125;

        if ((dob<minimumyear)|| (dob >currentyear)){
            return -1;
        }
        return currentyear - dob;
    }
}
