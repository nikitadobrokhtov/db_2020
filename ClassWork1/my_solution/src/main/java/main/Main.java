package main;

import hero.Hero;
import hero.game_manager.GameManager;
import hero_factory.HeroFactory;

public class Main {
    public static void main( String[] args ) {
        HeroFactory heroFactory = new HeroFactory();
        GameManager gameManager = new GameManager();

        //Hero hero1 = heroFactory.createHero();
        //Hero hero2 = heroFactory.createHero();

        //gameManager.fight(hero1, hero2);
    }
}
