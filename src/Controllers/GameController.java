package Controllers;

import Model.Game;
import Model.GameStatus;
import Model.Move;
import Model.Player;
import Strategy.WinningStrategy.ColWinningStrategy;
import Strategy.WinningStrategy.DiagonalWinningStrategy;
import Strategy.WinningStrategy.RowWinningStrategy;
import Service.GameService;
import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> players){
        return Game.getBuilder().setDimension(dimension)
                .setPlayers(players)
                .addWinningStrategy(new RowWinningStrategy())
                .addWinningStrategy(new ColWinningStrategy())
                .addWinningStrategy(new DiagonalWinningStrategy())
                .build();
    }
    public void displayBoard( Game game){
        game.getBoard().display();
    }
    public GameStatus getGameStatus(Game game){
        return game.getGameState();
    }
    public void executeNextMove(Game game,int i){
        GameService gameService=new GameService(game,i);
        gameService.executeNextMove(i);

    }
    public String getWinner(Game game){
        return game.getWinner().getName();
    }
}
