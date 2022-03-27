import java.util.Scanner;

public class take_it_out {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String Game_String = randomString();
        int score1 = 0;
        int score2 = 0;
        int player1 = 100;
        int player2 = 100;
        String updated_string;
        boolean win = false;
        System.out.println("Enter Start To start the game");
        String game = in.next();
        switch(game){
            case "Start":
                while (!win){
                    System.out.println("Game String : "+Game_String);
                    if(Game_String!=null){
                        System.out.println("Player 1 Turn : ");
                        String num1 = in.next();
                        char n1 = num1.charAt(0);
                        updated_string = returnString(Game_String, n1);
                        Game_String = updated_string;
                        System.out.println("New String : "+Game_String);
                        int number1 = Integer.parseInt(num1);
                        score1 = player1 - number1;
                        player1 = score1;
                        System.out.println("Player 1 Score : "+score1);
                    }
                    if(Game_String!=null){
                        System.out.println("Player 2 Turn : ");
                        String num2 = in.next();
                        char n2 = num2.charAt(0);
                        updated_string = returnString(Game_String, n2);
                        Game_String = updated_string;
                        System.out.println("New String : "+Game_String);
                        int number2 = Integer.parseInt(num2);
                        score2 = player2 - number2;
                        player2 = score2;
                        System.out.println("Player 2 Score : "+score2);
                    }
                    if(Game_String.isEmpty()){
                        if(score1>score2){
                            System.out.println("Player 1 wins the game with the highest score : "+score1);
                        }
                        else {
                            System.out.println("Player 2 wins the game with the highest score : "+score2);
                        }
                        win = true;
                    }
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + game);
        }

    }
    static String returnString(String str, int c){
        String s = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==c)continue;
            else s+=str.charAt(i);
        }
        return s;
    }
    static String randomString(){
        int max = 999999999;
        int min = 9999999;
        int random_number = (int)Math.floor(Math.random()*(max-min+1)+min);
        String random_string = String.valueOf(random_number);
        return random_string;
    }
}