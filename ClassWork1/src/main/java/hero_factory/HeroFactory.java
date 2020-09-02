package hero_factory;


import hero.Hero;
import hero.constants.Constants;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class HeroFactory {

    private ArrayList<String> listOfHeroes = new ArrayList<>();

    private void getListOfHeroes() {
        File folder = new File("../ClassWork1/src/main/java/hero/hero_character");
        File[] listOfFiles = folder.listFiles();

        int k = 0;
        for (File file : listOfFiles) {
            if (file.isFile()) {
                String nameOfHeroFile = file.getName();
                int iend = nameOfHeroFile.indexOf(".");

                String subString;
                if (iend != -1) {
                    subString = nameOfHeroFile.substring(0, iend);
                    listOfHeroes.add(subString);
                }
            }
        }
    }

    public Hero createHero() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        getListOfHeroes();
        String newHero = listOfHeroes.get(ThreadLocalRandom.current().nextInt(0, listOfHeroes.size()));
        //???
        //How to create class by its name in string
        return null;
    }




}
