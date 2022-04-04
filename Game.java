import java.util.Arrays;

/**
 *
 * @author harshvardhan
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        panel3 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        computer = new javax.swing.JButton();
        game_string = new javax.swing.JLabel();
        current_string = new javax.swing.JLabel();
        computer_choice = new javax.swing.JLabel();
        computer_score = new javax.swing.JLabel();
        player_score = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        winner = new javax.swing.JLabel();
        player_choice = new javax.swing.JTextField();
        enter_player = new javax.swing.JButton();
        player = new javax.swing.JButton();
        option = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 20, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        computer.setText("Computer");
        computer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerActionPerformed(evt);
            }
        });

        game_string.setForeground(new java.awt.Color(102, 102, 0));
        game_string.setText("Game String : ");

        current_string.setForeground(new java.awt.Color(102, 0, 102));
        current_string.setText("Current String : ");

        computer_choice.setForeground(new java.awt.Color(0, 102, 102));
        computer_choice.setText("Computer Choice :");

        computer_score.setForeground(new java.awt.Color(0, 102, 102));
        computer_score.setText("Computer Score : ");

        player_score.setForeground(new java.awt.Color(0, 102, 102));
        player_score.setText("Player Score : ");

        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setText("Error : ");

        winner.setForeground(new java.awt.Color(0, 0, 255));
        winner.setText("Winner :");

        player_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player_choiceActionPerformed(evt);
            }
        });

        enter_player.setText("Enter");
        enter_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_playerActionPerformed(evt);
            }
        });

        player.setText("Player");
        player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerActionPerformed(evt);
            }
        });

        option.setText("Select who starts the Game");

        title.setForeground(new java.awt.Color(255, 102, 0));
        title.setText("Take It Out Game");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(computer_choice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                                                                .addComponent(current_string, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(game_string, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(129, Short.MAX_VALUE))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(computer_score, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(player_score, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(option, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(computer, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(86, 86, 86)
                                                .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(370, 370, 370)
                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(player_choice, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(enter_player, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(359, 359, 359)
                                                .addComponent(title)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(computer)
                                        .addComponent(player)
                                        .addComponent(option))
                                .addGap(18, 18, 18)
                                .addComponent(game_string, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(current_string, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(computer_choice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(computer_score, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(player_score, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(player_choice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(enter_player)
                                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void player_choiceActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void enter_playerActionPerformed(java.awt.event.ActionEvent evt) {
        //Player Enter click will continue the game
        //Entering the loop of game until all given string is empty
        while(!Game_Over){
            playUser();
            playComputer();
        }
    }

    private void computerActionPerformed(java.awt.event.ActionEvent evt) {
        //Generates a Random string for the Game
        //Computer plays first
        Game_String = randomString();
        game_string.setText("Game String : "+Arrays.toString(Game_String));
        Score();
        playComputer();
    }

    private void playerActionPerformed(java.awt.event.ActionEvent evt) {
        //Generates a Random string for the Game
        //Player plays first
        Game_String = randomString();
        game_string.setText("Game String : "+Arrays.toString(Game_String));
        Score();
        winner.setText("Play your first move..!!");
    }
    static int[] Game_String;
    static int score1 = 0;
    static int score2 = 0;
    static int player1;
    static int player2;
    static int[] updated_string;
    static boolean Game_Over = false;

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }


    static void playUser(){
        if(Game_String.length!=0){
            //System.out.println("Player 2 Turn : ");
            //int n2 = in.nextInt();

            int n2 = Integer.parseInt(player_choice.getText());
            //System.out.println("Player 2 Selection : "+n1);

            updated_string = returnString(Game_String, n2);
            Game_String = updated_string;
            //System.out.println("New String : "+ Arrays.toString(Game_String));
            current_string.setText("Left Choice : "+ Arrays.toString(Game_String));
            score2 = player2 - n2;
            player2 = score2;
            player_score.setText("Player Score : "+player2);
            //System.out.println("Player 2 Score : "+score2);
            End();
        }
    }

    static void playComputer(){
        if(Game_String.length!=0){
            //System.out.println("Player 1 Turn : ");
            //int n1 = in.nextInt();

            int n1 = AI_Evaluation(Game_String);
            computer_choice.setText("Computer Move : "+n1);
            //System.out.println("Player 1 Selection : "+n1);

            updated_string = returnString(Game_String, n1);
            Game_String = updated_string;
            //System.out.println("New String : "+ Arrays.toString(Game_String));
            current_string.setText("Left Choice : "+ Arrays.toString(Game_String));
            score1 = player1 - n1;
            player1 = score1;
            computer_score.setText("Computer Score : "+player1);
            //System.out.println("Player 1 Score : "+score1);
            End();
        }
    }

    static int[] returnString(int[] arr, int c){
        //This Function is used to update the game array(string) and remove the selection entered
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
        //This Function generates new game array(string) when called
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
        //This Function is used by the Computer to evaluate and check the smallest number in the string and return it as its selection
        int i, value = arr[0];
        for(i = 0; i < arr.length; i++){
            if(arr[i] < value){
                value = arr[i];
            }
        }
        return value;
    }
    static void Score(){
        //Refresh the score of the player on each button click of computer and player to start fresh with new string
        player1 = 100;
        player2 =100;
        computer_score.setText("Computer Score : "+player1);
        player_score.setText("Player Score : "+player2);
    }
    static void End(){
        //Check if the current string is empty or not if empty then declare the winner
        if(Game_String.length==0){
            if(score1>score2){
                winner.setText("Player 1 wins the game with the highest score : "+score1);
            }
            else {
                winner.setText("Player 2 wins the game with the highest score : "+score2);
            }
            Game_Over = true;
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton computer;
    private static javax.swing.JLabel computer_choice;
    private static javax.swing.JLabel computer_score;
    private static javax.swing.JLabel current_string;
    private javax.swing.JButton enter_player;
    private javax.swing.JLabel error;
    private javax.swing.JLabel game_string;
    private javax.swing.JLabel option;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JButton player;
    private static javax.swing.JTextField player_choice;
    private static javax.swing.JLabel player_score;
    private javax.swing.JLabel title;
    private static javax.swing.JLabel winner;
    // End of variables declaration
}