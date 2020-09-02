package hero;

import java.util.concurrent.ThreadLocalRandom;

public class Kicker {
    public void elfFight(Hero heroOneself, Hero enemy){
        if(enemy.getPower() < heroOneself.hp){
            enemy.setAlive(false);
            System.out.println("Enemy " + enemy.getName() +" is exterminated!");
        } else {
            enemy.setPower(enemy.getPower() - 1);
            System.out.println("Current " + enemy.getName() + "'s power: " + enemy.getPower());
        }
    }

    public void humanFight(Hero heroOneself, Hero enemy){
        int generatedAttack = ThreadLocalRandom.current().nextInt(0, heroOneself.getPower());
        if (generatedAttack >= enemy.getHp()){
            enemy.setAlive(false);
            System.out.println("Enemy " + enemy.getName() +" is exterminated!");
        } else {
            enemy.setHp(enemy.getHp() - generatedAttack);
            System.out.println("Current " + enemy.getName() + "'s hp: " + enemy.getHp());
        }
    }

    public void toCry(){
        System.out.println("Hnik, hnik");
    }
}
