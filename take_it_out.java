import java.util.Arrays;
import java.util.Scanner;

public class take_it_out {
    static int[] Game_String = randomString();
    static int score1 = 0;
    static int score2 = 0;
    static int player1 = 100;
    static int player2 = 100;
    static int[] updated_string;
    static boolean Game_Over = false;

    public static void main(String[] args){

        while (!Game_Over){
            playGame();
        }
    }

    static void playGame(){
        Scanner in = new Scanner(System.in);
        System.out.println("Game String : "+ Arrays.toString(Game_String));
        if(Game_String.length!=0){
            //System.out.println("Player 1 Turn : ");
            //int n1 = in.nextInt();
            int n1 = AI_Evaluation(Game_String);
            System.out.println("Player 1 Selection : "+n1);
            updated_string = returnString(Game_String, n1);
            Game_String = updated_string;
            System.out.println("New String : "+Arrays.toString(Game_String));
            score1 = player1 - n1;
            player1 = score1;
            System.out.println("Player 1 Score : "+score1);
        }
        if(Game_String.length!=0){
            System.out.println("Player 2 Turn : ");
            int n2 = in.nextInt();
            updated_string = returnString(Game_String, n2);
            Game_String = updated_string;
            System.out.println("New String : "+Arrays.toString(Game_String));
            score2 = player2 - n2;
            player1 = score1;
            System.out.println("Player 2 Score : "+score2);
        }
        if(Game_String.length==0){
            if(score1>score2){
                System.out.println("Player 1 wins the game with the highest score : "+score1);
            }
            else {
                System.out.println("Player 2 wins the game with the highest score : "+score2);
            }
            Game_Over = true;
        }
    }
    static int[] returnString(int[] arr, int c){
        int x = 0, y = 0;
        int[] newArr = new int[arr.length-1];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==c) {
                x++;
                if(x==1){
                    continue;
                }else{
                    newArr[y]=arr[i];
                    y++;
                }
            }
            else{
                newArr[y]=arr[i];
                y++;
            }
        }
        return newArr;
    }
    static int[] randomString(){
        int max = 999999999;
        int min = 9999999;
        int random_number = (int)Math.floor(Math.random()*(max-min+1)+min);
        String number = Integer.toString(random_number);
        int[] arr = new int[number.length()];
        for(int i = 0; i < number.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return arr;
    }

    static int AI_Evaluation(int[] arr){
        int i, value = arr[0];
        for(i = 0; i < arr.length; i++){
            if(arr[i] < value){
                value = arr[i];
            }
        }
        return value;
    }
}