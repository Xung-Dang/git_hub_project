public class For_statement {
    public static void main(String[] args) {

       int count = 0;

       for (int i=10; i<=50; i++){
           if (isPrime(i)){
               System.out.println(i+" prime number");
               count++;
               if (count==3){
                   System.out.println(i+" is third position");
                   break;
               }
           }
       }
       System.out.println("total "+ count);
    }

    public static boolean isPrime(int number){

        if (number<=2){
            return (number == 2);
        }

        for(int divisor=2; divisor<=number/2; divisor++) {
            if (number%divisor==0) {
                return  false;
            }

        }
        return true;
    }
}
