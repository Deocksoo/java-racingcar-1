package racinggame.util;

import racinggame.domain.LeagueHistory;
import racinggame.domain.TrialHistory;

import java.util.List;

public class OutputView {
    public static void showErrorMessage(String message) {
        System.err.println(message);
    }

    public static void showHistoryOf(LeagueHistory leagueHistory) {
        System.out.println("실행 결과");
        for (TrialHistory trialHistory : leagueHistory.values()) {
            System.out.println(trialHistory);
        }
    }

    public static void showWinnersOf(LeagueHistory leagueHistory, int trial) {
        List<String> winners = leagueHistory.findWinnersOf(trial);
        String winnerMessage = String.join(", ", winners.toArray(new String[winners.size()]));

        System.out.println(winnerMessage + "가 최종 우승했습니다.");
    }
}