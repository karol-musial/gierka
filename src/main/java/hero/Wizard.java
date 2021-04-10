package hero;

import classStatistics.ClassStatistics;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wizard extends ClassStatistics {

    private int hp = 300;
    private final int defense = 3;
    private final int attack = 30;

    @Override
    public String toString() {
        return "Wizard's stats: " +
                "hp=" + hp +
                ", defense=" + defense +
                ", attack=" + attack;
    }
}
