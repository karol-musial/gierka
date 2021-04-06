package hero;


import classStatistics.ClassStatistics;

import java.util.Scanner;

import static messageProvider.MessageProvider.ARE_YOU_SURE;

public class ChoosingHero {
    Scanner scanner = new Scanner(System.in);
    ClassStatistics player;
    boolean shouldBeContinued = true;
    ClassStatistics assassin = new Assassin();
    ClassStatistics palladyn = new Palladyn();
    ClassStatistics rogue = new Rogue();
    ClassStatistics wizard = new Wizard();

    public ClassStatistics choosingCharacter() {
        System.out.println("Nie pozwól, aby żaden z Twoich bohaterów zginął!");
        System.out.println();
        while (shouldBeContinued) {
            System.out.println("Wybierz swojego bohatera:");
            System.out.println("1. Assassin");
            System.out.println("2. Palladyn");
            System.out.println("3. Rogue");
            System.out.println("4. Wizard");
            System.out.println("5. Statystyki postaci");

            int startingClass = scanner.nextInt();

            switch (startingClass) {
                case 1 -> player = assassin;
                case 2 -> player = palladyn;
                case 3 -> player = rogue;
                case 4 -> player = wizard;
                case 5 -> {
                    System.out.println(assassin.toString());
                    System.out.println(palladyn.toString());
                    System.out.println(rogue.toString());
                    System.out.println(wizard.toString());
                    System.out.println();
                }
                default -> System.out.println("Nie ma takiej klasy");
            }
            if((startingClass<5)&&(startingClass>0)) {
                System.out.println(ARE_YOU_SURE);
                String accept = scanner.next();
                if((accept.toUpperCase()).equals("Y")){
                    shouldBeContinued=false;
                }
            }

        }
        shouldBeContinued=true;
        return player;
    }
}
