import Controllers.GameController;
import Model.*;
import Strategy.WinningStrategy.ColWinningStrategy;
import Strategy.WinningStrategy.RowWinningStrategy;
import Strategy.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Board board=new Board(3);
        Scanner sc=new Scanner(System.in);
        List<Player> players=new ArrayList<>();
        GameController gameController=new GameController();
        System.out.println("Let's begin tic tak toe");
        System.out.println("Enter the dimensions of the board");
        int dimension=sc.nextInt();
        System.out.println("Enter number of players");
        int nb=sc.nextInt();
        System.out.println("Is there a bot playing in this game (y/n)");
        String b=sc.next();
        for(int i=0;i<nb;i++){
            System.out.println("Enter name of the "+i+1+"player");
            String pname=sc.next();
            System.out.println("Enter Symbol of the player");
            String psymbol=sc.next();
            players.add(new Player(pname,psymbol.charAt(0),i,PlayerType.HUMAN));
        }
        if(b.charAt(0)=='y'){
            System.out.println("Enter name of the bot");
            String pname=sc.next();
            System.out.println("Enter Symbol of the bot");
            String psymbol=sc.next();
            players.add(new BotPlayer(pname,psymbol.charAt(0),99,PlayerType.BOT,BotDifficultyLevel.EASY));
        }
        Game game=gameController.createGame(dimension,players);
        int count=0;

        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS) && count<(dimension*dimension)){
            int ind=count%players.size();
            gameController.displayBoard(game);
            gameController.executeNextMove(game,ind);
            if(gameController.getGameStatus(game).equals(GameStatus.WIN)){
                break;

            }
            count++;
        }
        if(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){
            System.out.println("--------------------------------------------");
            System.out.println("The game has concluded and the game is draw");
            System.out.println("--------------------------------------------");
        }
        else{
            System.out.println("--------------------------------------------");
            System.out.println("The game has concluded and "+gameController.getWinner(game)+" has won");
            System.out.println("--------------------------------------------");
        }



    }
}