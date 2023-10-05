public class main {

    public static void main(String[] args) {

        int variable = 100;
        int variable0 = 10;
        double variable2= 2.000d;
        boolean variable3= false;

        if (variable==100) {
            System.out.println("true1"+ calulatevalue(variable,variable3,variable0) );
            calulatevalue(variable,variable3,variable0);
        } else if (variable2==2) {
            System.out.print ("true2");
            }
        else {
            System.out.println("true3");
        }

    }
    public static int calulatevalue( int cal1, boolean cal2, int variablecal){
        int resultvariable=10;
        if (variablecal==10){
            resultvariable += 10;
            System.out.println("cal_complete");

        }
        return resultvariable;

    }
}
