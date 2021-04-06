package hero;

import classStatistics.ClassStatistics;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Assassin implements ClassStatistics {

    private int hp = 500;
    private final int defense = 2;
    private final int attack = 40;

    @Override
    public String toString() {
        return "Assassin's stats: " +
                "hp=" + hp +
                ", defense=" + defense +
                ", attack=" + attack;
    }
}
