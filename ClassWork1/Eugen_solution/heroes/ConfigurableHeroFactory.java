package heroes;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public class ConfigurableHeroFactory implements HeroFactory {
    private Faker faker = new Faker();

    private final HeroesConfig heroesConfig;


    @Override
    public Hero createNewHero() {
        List<HeroCreator> heroCreators = heroesConfig.getHeroCreators();
        return RandomUtil.randomItem(heroCreators).create(faker.funnyName().name());

    }
}
