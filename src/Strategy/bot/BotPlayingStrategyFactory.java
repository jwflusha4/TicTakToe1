package Strategy.bot;

import Model.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotStrategyLevel getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        return new EasyBotPlayingStrategy();
    }
}
