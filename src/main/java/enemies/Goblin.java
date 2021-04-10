package enemies;

import classStatistics.ClassStatistics;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Goblin extends ClassStatistics {

    private int hp = 200;
    private final int defense = 2;
    private final int attack = 9;

    @Override
    public String toString() {
        return "Goblin's stats: " +
                "hp=" + hp +
                ", defense=" + defense +
                ", attack=" + attack;
    }
}