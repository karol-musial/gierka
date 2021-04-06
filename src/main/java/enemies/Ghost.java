package enemies;

import classStatistics.ClassStatistics;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ghost implements ClassStatistics {

    private int hp = 200;
    private final int defense = 3;
    private final int attack = 10;

    @Override
    public String toString() {
        return "Ghost's stats: " +
                "hp=" + hp +
                ", defense=" + defense +
                ", attack=" + attack;
    }
}