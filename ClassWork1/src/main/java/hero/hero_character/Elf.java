package hero.hero_character;

import hero.Hero;
import hero.Kicker;
import hero.constants.Constants;

import java.util.concurrent.ThreadLocalRandom;

public class Elf extends Hero {

    public Elf() {
        super(Constants.NAMES[ThreadLocalRandom.current().nextInt(0, Constants.NAMES.length)],
                10, 10, true);
    }

    /*@Override
    public void kick( Hero enemy ) {
        if(enemy.getPower() < super.hp){
            enemy.setAlive(false);
            System.out.println("Enemy is exterminated");
        } else {
            enemy.setPower(enemy.getPower() - 1);
        }
    }*/
    @Override
    public void kick(Hero enemy){
        new Kicker().elfFight(this, enemy);
    }



}
