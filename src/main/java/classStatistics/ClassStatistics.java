package classStatistics;

public interface ClassStatistics {
    int getHp();
    int getAttack();
    int getDefense();
    void setHp(int hp);
    default int gettingDamage(int hp, int numberOfDamageTaken) {
        return hp-numberOfDamageTaken;
    }
}
