public class sum_digits {

    public static void main(String[] args) {

        int number =223;
        System.out.println("sum of number "+ number +" is " + sum_number(number));
        System.out.println("sum of number"+ number +"is" + sum_number(number));
    }

    public static int sum_number(int number) {
        if (number<0){
            return -1;
        }
        int sum = 0;

        while(number>0){
            sum+=(number%10);
            number=number/10;
        }
        sum+=number;

        return sum;
    }

}
