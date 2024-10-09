/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tictactoe;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;  
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author KJ
 */
public class TicTacToe extends Application     
{
    private int player=0;
    private String turn="Player 1's Move";
    private Label turnOutput;
    private Button One, Two, Three, Four, Five, Six, Seven, Eight, Nine;
    private int[][] winnerCheck;
    private GridPane gridpane;
    public static void main(String[] args) 
    {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage)
    {       
        Image image = new Image("file:BlankXO.png");
        
         One = new Button();
         One.setGraphic(new ImageView(image));
         One.setOnAction(new TicTacToe.myButtonClick1());
         
        Two = new Button();
         Two.setGraphic(new ImageView(image));
         Two.setOnAction(new TicTacToe.myButtonClick2());
         
        Three = new Button();
         Three.setGraphic(new ImageView(image));
         Three.setOnAction(new TicTacToe.myButtonClick3());
         
        Four = new Button();
         Four.setGraphic(new ImageView(image));
         Four.setOnAction(new TicTacToe.myButtonClick4());
         
       Five = new Button();
        Five.setGraphic(new ImageView(image));
        Five.setOnAction(new TicTacToe.myButtonClick5());
        
        Six = new Button();
         Six.setGraphic(new ImageView(image));
         Six.setOnAction(new TicTacToe.myButtonClick6());
         
        Seven = new Button();
         Seven.setGraphic(new ImageView(image));
         Seven.setOnAction(new TicTacToe.myButtonClick7());
         
        Eight = new Button();
         Eight.setGraphic(new ImageView(image));
         Eight.setOnAction(new TicTacToe.myButtonClick8());
         
        Nine = new Button();
         Nine.setGraphic(new ImageView(image));
         Nine.setOnAction(new TicTacToe.myButtonClick9());
        turnOutput=new Label(turn);
        winnerCheck = new int[3][3];
         
        gridpane = new GridPane();
        gridpane.add(One, 0, 0);
        gridpane.add(Two, 1, 0);
        gridpane.add(Three, 2, 0);
        gridpane.add(Four, 0, 1);
        gridpane.add(Five, 1, 1);
        gridpane.add(Six, 2, 1);
        gridpane.add(Seven, 0, 2);
        gridpane.add(Eight, 1, 2);
        gridpane.add(Nine, 2, 2);
        gridpane.add(turnOutput,1,3);
        turnOutput.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(gridpane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic-Tac-Toe");
        primaryStage.show();
    }
    
    class myButtonClick1 implements EventHandler<ActionEvent>
    {
        private int f=0;
        @Override
        public void handle(ActionEvent e)
        {
            Image x = new Image ("file:X.png");
            Image o = new Image ("file:O.png");
            if(player==0&&f==0)
            {
                One.setGraphic(new ImageView(x));
                player+=1;
                turnOutput.setText("Player 2's Move");
                f+=1;
                winnerCheck[0][0]=1;
                arrayCheck(winnerCheck);
            }
            else if(player==1&&f==0)
            {
                One.setGraphic(new ImageView(o));
                player-=1;
                turnOutput.setText("Player 1's Move");
                f+=2;
                winnerCheck[0][0]=10;
                arrayCheck(winnerCheck);
            }
            else
                ;
            
        }
    }
    class myButtonClick2 implements EventHandler<ActionEvent>
    {
        private int f;
        @Override
        public void handle(ActionEvent e)
        {
            Image x = new Image ("file:X.png");
            Image o = new Image ("file:O.png");
            if(player==0&&f==0)
            {
                Two.setGraphic(new ImageView(x));
                player+=1;
                turnOutput.setText("Player 2's Move");
                f+=1;
                winnerCheck[0][1]=1;
                arrayCheck(winnerCheck);
            }
            else if(player==1&&f==0)
            {
                Two.setGraphic(new ImageView(o));
                player-=1;
                turnOutput.setText("Player 1's Move");
                f+=2;
                winnerCheck[0][1]=10;
                arrayCheck(winnerCheck);
            }
            else
                ;
            
        }
    }
    class myButtonClick3 implements EventHandler<ActionEvent>
    {
        private int f;
        @Override
        public void handle(ActionEvent e)
        {
            Image x = new Image ("file:X.png");
            Image o = new Image ("file:O.png");
            if(player==0&&f==0)
            {
                Three.setGraphic(new ImageView(x));
                player+=1;
                turnOutput.setText("Player 2's Move");
                f+=1;
                winnerCheck[0][2]=1;
                arrayCheck(winnerCheck);
            }
            else if(player==1&&f==0)
            {
                Three.setGraphic(new ImageView(o));
                player-=1;
                turnOutput.setText("Player 1's Move");
                f+=2;
                winnerCheck[0][2]=10;
                arrayCheck(winnerCheck);
            }
            else
                ;
            
        }
    }
    class myButtonClick4 implements EventHandler<ActionEvent>
    {
        private int f;
        @Override
        public void handle(ActionEvent e)
        {
            Image x = new Image ("file:X.png");
            Image o = new Image ("file:O.png");
            if(player==0&&f==0)
            {
                Four.setGraphic(new ImageView(x));
                player+=1;
                turnOutput.setText("Player 2's Move");
                f+=1;
                winnerCheck[1][0]=1;
                arrayCheck(winnerCheck);
            }
            else if(player==1&&f==0)
            {
                Four.setGraphic(new ImageView(o));
                player-=1;
                turnOutput.setText("Player 1's Move");
                f+=2;
                winnerCheck[1][0]=10;
                arrayCheck(winnerCheck);
            }
            else
                ;
            
        }
    }
    class myButtonClick5 implements EventHandler<ActionEvent>
    {
        private int f;
        @Override
        public void handle(ActionEvent e)
        {
            Image x = new Image ("file:X.png");
            Image o = new Image ("file:O.png");
            if(player==0&&f==0)
            {
                Five.setGraphic(new ImageView(x));
                player+=1;
                turnOutput.setText("Player 2's Move");
                f+=1;
                winnerCheck[1][1]=1;
                arrayCheck(winnerCheck);
            }
            else if(player==1&&f==0)
            {
                Five.setGraphic(new ImageView(o));
                player-=1;
                turnOutput.setText("Player 1's Move");
                f+=2;
                winnerCheck[1][1]=10;
                arrayCheck(winnerCheck);
            }
            else
                ;
            
        }
    }
    class myButtonClick6 implements EventHandler<ActionEvent>
    {
        private int f;
        @Override
        public void handle(ActionEvent e)
        {
            Image x = new Image ("file:X.png");
            Image o = new Image ("file:O.png");
            if(player==0&&f==0)
            {
                Six.setGraphic(new ImageView(x));
                player+=1;
                turnOutput.setText("Player 2's Move");
                f+=1;
                winnerCheck[1][2]=1;
                arrayCheck(winnerCheck);
            }
            else if(player==1&&f==0)
            {
                Six.setGraphic(new ImageView(o));
                player-=1;
                turnOutput.setText("Player 1's Move");
                f+=2;
                winnerCheck[1][2]=10;
                arrayCheck(winnerCheck);
            }
            else
                ;
            
        }
    }
    class myButtonClick7 implements EventHandler<ActionEvent>
    {
        private int f;
        @Override
        public void handle(ActionEvent e)
        {
            Image x = new Image ("file:X.png");
            Image o = new Image ("file:O.png");
            if(player==0&&f==0)
            {
                Seven.setGraphic(new ImageView(x));
                player+=1;
                turnOutput.setText("Player 2's Move");
                f+=1;
                winnerCheck[2][0]=1;
                arrayCheck(winnerCheck);
            }
            else if(player==1&&f==0)
            {
                Seven.setGraphic(new ImageView(o));
                player-=1;
                turnOutput.setText("Player 1's Move");
                f+=2;
                winnerCheck[2][0]=10;
                arrayCheck(winnerCheck);
            }
            else
                ;
            
        }
    }
    class myButtonClick8 implements EventHandler<ActionEvent>
    {
        private int f;
        @Override
        public void handle(ActionEvent e)
        {
            Image x = new Image ("file:X.png");
            Image o = new Image ("file:O.png");
            if(player==0&&f==0)
            {
                Eight.setGraphic(new ImageView(x));
                player+=1;
                turnOutput.setText("Player 2's Move");
                f+=1;
                winnerCheck[2][1]=1;
                arrayCheck(winnerCheck);
            }
            else if(player==1&&f==0)
            {
                Eight.setGraphic(new ImageView(o));
                player-=1;
                turnOutput.setText("Player 1's Move");
                f+=2;
                winnerCheck[2][1]=10;
                arrayCheck(winnerCheck);
            }
            else
                ;
            
        }
    }
    class myButtonClick9 implements EventHandler<ActionEvent>
    {
        private int f;
        @Override
        public void handle(ActionEvent e)
        {
            Image x = new Image ("file:X.png");
            Image o = new Image ("file:O.png");
            if(player==0&&f==0)
            {
                Nine.setGraphic(new ImageView(x));
                player+=1;
                turnOutput.setText("Player 2's Move");
                f+=1;
                winnerCheck[2][2]=1;
                arrayCheck(winnerCheck);
            }
            else if(player==1&&f==0)
            {
                Nine.setGraphic(new ImageView(o));
                player-=1;
                turnOutput.setText("Player 1's Move");
                f+=2;
                winnerCheck[2][2]=10;
                arrayCheck(winnerCheck);
            }
            else
                ;
            
        }
    }
    
    public void arrayCheck(int[][] array)
    {
        int total;
        
        for (int row = 0; row<array.length; row++)
        {
            total = 0;
            for (int col = 0; col<array[row].length; col++)
            {
                total +=array[row][col];
            }
            if(total==3)
            {
                turnOutput.setText("Player 1 Wins!!!");
                One.setDisable(true);
                Two.setDisable(true);
                Three.setDisable(true);
                Four.setDisable(true);
                Five.setDisable(true);
                Six.setDisable(true);
                Seven.setDisable(true);
                Eight.setDisable(true);
                Nine.setDisable(true);
            }
            else if(total==30)
            {
                turnOutput.setText("Player 2 Wins!!!");
                One.setDisable(true);
                Two.setDisable(true);
                Three.setDisable(true);
                Four.setDisable(true);
                Five.setDisable(true);
                Six.setDisable(true);
                Seven.setDisable(true);
                Eight.setDisable(true);
                Nine.setDisable(true);;
            }
            else
                ;
        }
        for (int col = 0; col<array.length; col++)
        {
            total = 0;
            for (int row = 0; row<array[col].length; row++)
            {
                total +=array[row][col];
            }
            if(total==3)
            {
                turnOutput.setText("Player 1 Wins!!!");
                One.setDisable(true);
                Two.setDisable(true);
                Three.setDisable(true);
                Four.setDisable(true);
                Five.setDisable(true);
                Six.setDisable(true);
                Seven.setDisable(true);
                Eight.setDisable(true);
                Nine.setDisable(true);
            }
            else if(total==30)
            {
                turnOutput.setText("Player 2 Wins!!!");
                One.setDisable(true);
                Two.setDisable(true);
                Three.setDisable(true);
                Four.setDisable(true);
                Five.setDisable(true);
                Six.setDisable(true);
                Seven.setDisable(true);
                Eight.setDisable(true);
                Nine.setDisable(true);
            }
            else
                ;
        }
        total=0;
        total=array[0][0]+array[1][1]+array[2][2];
        if(total==3)
            {
                turnOutput.setText("Player 1 Wins!!!");
                One.setDisable(true);
                Two.setDisable(true);
                Three.setDisable(true);
                Four.setDisable(true);
                Five.setDisable(true);
                Six.setDisable(true);
                Seven.setDisable(true);
                Eight.setDisable(true);
                Nine.setDisable(true);
            }
            else if(total==30)
            {
                turnOutput.setText("Player 2 Wins!!!");
                One.setDisable(true);
                Two.setDisable(true);
                Three.setDisable(true);
                Four.setDisable(true);
                Five.setDisable(true);
                Six.setDisable(true);
                Seven.setDisable(true);
                Eight.setDisable(true);
                Nine.setDisable(true);
            }
            else
                ;
        total=0;
        total=array[0][2]+array[1][1]+array[2][0];
        if(total==3)
            {
                turnOutput.setText("Player 1 Wins!!!");
                One.setDisable(true);
                Two.setDisable(true);
                Three.setDisable(true);
                Four.setDisable(true);
                Five.setDisable(true);
                Six.setDisable(true);
                Seven.setDisable(true);
                Eight.setDisable(true);
                Nine.setDisable(true);
            }
            else if(total==30)
            {
                turnOutput.setText("Player 2 Wins!!!");
                One.setDisable(true);
                Two.setDisable(true);
                Three.setDisable(true);
                Four.setDisable(true);
                Five.setDisable(true);
                Six.setDisable(true);
                Seven.setDisable(true);
                Eight.setDisable(true);
                Nine.setDisable(true);
            }
            else
                ;
        total=0;
        for (int row = 0; row<array.length; row++)
        {
            for (int col = 0; col<array[row].length; col++)
            {
                total +=array[row][col];
            }
        }
        if (total==45)
        {
            turnOutput.setText("Draw!!!");
        }
        else
            ;
    }
}
