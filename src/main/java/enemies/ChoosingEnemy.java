package enemies;

import classStatistics.ClassStatistics;

import java.util.Random;
import java.util.Scanner;

public class ChoosingEnemy {
    Scanner scanner = new Scanner(System.in);
    ClassStatistics enemy;
    boolean shouldBeContinued = true;

    public ClassStatistics choosingEnemy() {

        Random random = new Random();
            switch (random.nextInt(4)) {
                case 0 -> enemy = new Goblin();
                case 1 -> enemy = new Ork();
                case 2 -> enemy = new Ghost();
                case 3 -> enemy = new Skieleton();
            }
        return enemy;
    }
}
