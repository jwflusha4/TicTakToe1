package Service;

import Model.Game;
import Model.GameStatus;
import Model.Move;
import Model.Player;
import Strategy.WinningStrategy.WinningStrategy;

public class GameService {
     Game game;
     int i;

    public GameService(Game game,int i) {
        this.game = game;
        this.i=i;
    }

    public void executeNextMove(int i){
        Player currPlayer=game.getPlayers().get(this.i);
        Move move=currPlayer.makeMove(game.getBoard());
        game.addMove(move);
        game.updateBoard(move);

        for (WinningStrategy winningStrategy: game.getWinningStrategies()) {
            if (winningStrategy.checkWinner(game.getBoard(), move)) {
                System.out.printf("The player %s has won.\n", currPlayer.getName());
                game.setGameState(GameStatus.WIN);
                game.setWinner(currPlayer);
                //go=false;
                break;
            }
        }
    }
}
