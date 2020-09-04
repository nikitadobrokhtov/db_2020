package never_use_switch;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import random_util.RandomUtil;

public class MailMockProducer {

    private MailDistributor mailDistributor = new MailDistributor();
    private Faker faker = new Faker();
    private DataFactory dataFactory = new DataFactory();


    @SneakyThrows
    public void sendMailsForever()  {
        while (true) {
            int mailType = RandomUtil.getIntBetween(0, 3) + 1;
            MailInfo mailInfo = MailInfo.builder()
                    .email(dataFactory.getEmailAddress())
                    .mailType(mailType)
                    .text(faker.chuckNorris().fact()).build();
            mailDistributor.sendMailInfo(mailInfo);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        new MailMockProducer().sendMailsForever();
    }
}
