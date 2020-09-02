package hero;

import hero.constants.Constants;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Hero implements HeroInterface{
    protected final String name;
    protected int power;
    protected int hp;
    protected boolean isAlive;

    abstract public void kick(Hero enemy);

    public Hero(String name, int power, int hp, boolean isAlive){
        this.name = name;
        this.power = power;
        this.hp = hp;
        this.isAlive = isAlive;
    }


    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setPower( int power ) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp( int hp ) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive( boolean alive ) {
        isAlive = alive;
    }
}
