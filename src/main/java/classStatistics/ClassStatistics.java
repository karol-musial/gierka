package classStatistics;

public abstract class ClassStatistics{
    public int gettingDamage(int hp, int numberOfDamageTaken) {
        return hp-numberOfDamageTaken;
    }
    abstract public int getHp();
    abstract public int getDefense();
    abstract public int getAttack();
    abstract public void setHp(int hp);
}
