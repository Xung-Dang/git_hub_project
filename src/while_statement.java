public class while_statement {

    public static void main(String[] args) {

        int number = 4;
        int max_number=20;
        int odd_number=0;
        int even_number=0;

        while (number<=max_number){
            number++;
            if (!even_number(number)){
                odd_number++;
                continue;
            }

            System.out.println(number + " is even number");
            even_number++;
            if (even_number==5){
                System.out.println(number+" is 5 postion");
                break;
            }


        }
        System.out.println("oll total number"+odd_number);
        System.out.println("oll total number"+even_number);

    }

    public static boolean even_number(int number){

        if (number%2==0){

            return true;
        }else{
            return false;

        }


    }
}
