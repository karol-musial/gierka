package hero;

import classStatistics.ClassStatistics;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Palladyn extends ClassStatistics {

    private int hp = 750;
    private final int defense = 4;
    private final int attack = 10;

    @Override
    public String toString() {
        return "Palladyn's stats: " +
                "hp=" + hp +
                ", defense=" + defense +
                ", attack=" + attack;
    }
}
