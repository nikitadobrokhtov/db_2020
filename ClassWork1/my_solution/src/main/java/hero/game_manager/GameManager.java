package hero.game_manager;

import hero.Hero;

public class GameManager {

    public void fight( Hero c1, Hero c2 ){
        while(c1.isAlive() && c2.isAlive()){
            c1.kick(c2);
            c2.kick(c1);
        }
    }
}
