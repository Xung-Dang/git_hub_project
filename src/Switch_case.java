public class Switch_case {

    public static void main(String[] args) {
        int value = 4;
        switch (value) {
            case 1 -> System.out.print("case 1");
            case 2, 3, 4 -> System.out.print("case234 " + value);
            default -> System.out.print("case0");
        }
    }
}
