package hero.hero_character;

import hero.Hero;
import hero.Kicker;
import hero.constants.Constants;

import java.util.concurrent.ThreadLocalRandom;

public class Hobbit extends Hero {


    public Hobbit(){
        super(Constants.NAMES[ThreadLocalRandom.current().nextInt(0, Constants.NAMES.length)],
                0, 3, true);
    }

    @Override
    public void kick( Hero enemy ) {
        new Kicker().toCry();
    }

}
