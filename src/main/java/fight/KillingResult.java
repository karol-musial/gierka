package fight;

import classStatistics.ClassStatistics;

public class KillingResult {

    public void killSomeone(ClassStatistics firstGuy, ClassStatistics secondGuy) {
        do {
            hitSomeone(firstGuy, secondGuy);
            hitSomeone(secondGuy,firstGuy);
        }
        while((firstGuy.getHp()>0)&&(secondGuy.getHp()>0));
        if(firstGuy.getHp()<0) firstGuy.setHp(0);
        if(secondGuy.getHp()<0) secondGuy.setHp(0);
    }

        private void hitSomeone(ClassStatistics characterGettingDamage, ClassStatistics characterGivingDamage){
            int numberOfDamageTaken = 1 + characterGivingDamage.getAttack() - 4*characterGettingDamage.getDefense();
            if(numberOfDamageTaken<1) numberOfDamageTaken = 1;
            int hpAfterHit = characterGettingDamage.gettingDamage(characterGettingDamage.getHp(), numberOfDamageTaken);
            characterGettingDamage.setHp(hpAfterHit);
    }
}
