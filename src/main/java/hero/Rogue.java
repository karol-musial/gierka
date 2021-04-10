package hero;

import classStatistics.ClassStatistics;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rogue extends ClassStatistics {

    private int hp = 500;
    private final int defense = 3;
    private final int attack = 20;

    @Override
    public String toString() {
        return "Rogue's stats: " +
                "hp=" + hp +
                ", defense=" + defense +
                ", attack=" + attack;
    }
}
