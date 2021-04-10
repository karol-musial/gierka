package enemies;

import classStatistics.ClassStatistics;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Skieleton extends ClassStatistics {

    private int hp = 300;
    private final int defense = 1;
    private final int attack = 18;

    @Override
    public String toString() {
        return "Skieleton's stats: " +
                "hp=" + hp +
                ", defense=" + defense +
                ", attack=" + attack;
    }
}