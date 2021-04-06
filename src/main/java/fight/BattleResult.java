package fight;

import classStatistics.ClassStatistics;
import enemies.ChoosingEnemy;

public class BattleResult {
    ChoosingEnemy enemyCharacter = new ChoosingEnemy();
    ClassStatistics enemy = enemyCharacter.choosingEnemy();
    KillingResult death = new KillingResult();

    public void battle(ClassStatistics player){
        death.killSomeone(player,enemy);
        System.out.println(player);
        System.out.println(enemy);
    }
}
