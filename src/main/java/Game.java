import classStatistics.ClassStatistics;
import fight.BattleResult;
import hero.ChoosingHero;

import java.util.Scanner;

import static messageProvider.MessageProvider.DEFEAT_INFO;
import static messageProvider.MessageProvider.WIN_INFO;

public class Game {

    public void game(){

        Scanner in = new Scanner(System.in);
        ChoosingHero hero = new ChoosingHero();
        ClassStatistics player = hero.choosingCharacter();
        int score = 0;
        boolean shouldContinue = true;

        System.out.println("Chcesz wyruszyć w przygodę? - Y/N");
        System.out.println("Jeśli się zgodzisz, zaatakujesz pierwszego stwora!");
        String decision = in.next();
        if ((decision.toUpperCase()).equals("Y")) {
            while (shouldContinue) {
                if (player.getHp() > 0) {
                    BattleResult battleResult = new BattleResult();
                    battleResult.battle(player);
                    if(player.getHp()==0) continue;
                    score++;
                    System.out.println("Akcje:");
                    System.out.println("1: Walcz dalej!");
                    System.out.println("2: Zmień postać.");
                    System.out.println("3: Poddaj się.");
                    int secondDecision = in.nextInt();
                    switch (secondDecision) {
                        case 1 -> {}
                        case 2 -> player = hero.choosingCharacter();
                        case 3 -> {
                            System.out.println(String.format(WIN_INFO,score));
                            shouldContinue = false;
                        }
                    }
                }
                else {
                    System.out.println(String.format(DEFEAT_INFO,score));
                    break;
                }
            }

        }
        else System.out.println(String.format(DEFEAT_INFO,score));
    }
}
