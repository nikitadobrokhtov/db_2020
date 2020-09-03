package hero.hero_character;

import hero.Hero;
import hero.Kicker;
import hero.constants.Constants;

import java.util.concurrent.ThreadLocalRandom;

public class King extends Hero {
    public King( String name, int power, int hp, boolean isAlive ) {
        super(Constants.NAMES[ThreadLocalRandom.current().nextInt(0, Constants.NAMES.length)],
                ThreadLocalRandom.current().nextInt(5, 16),
                ThreadLocalRandom.current().nextInt(5, 16), true);
    }

    @Override
    public void kick( Hero enemy ) {
        new Kicker().humanFight(this, enemy);
    }
}
