package enemies;

import classStatistics.ClassStatistics;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ork implements ClassStatistics {

    private int hp = 300;
    private final int defense = 2;
    private final int attack = 13;

    @Override
    public String toString() {
        return "Ork's stats: " +
                "hp=" + hp +
                ", defense=" + defense +
                ", attack=" + attack;
    }
}