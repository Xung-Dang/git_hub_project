public class Score_of_class {
    public static void main(String[] args) {
        int score= 0;
        int player = position(score);
        annountvalues("Jim",player, score);

    }

    public static void annountvalues(String name, int player, int score){

        System.out.println(name+" have score " +score+" have position "+ player);
    }

    public static int position (int score){
        int position =0;
        if (score>=1000){
            position = 1;
        } else if (500< score && score < 1000){
            position = 2;
        } else if (100< score && score < 500){
            position = 2;
        } else {
            position = 4;
        }
        return position;

    }
}
