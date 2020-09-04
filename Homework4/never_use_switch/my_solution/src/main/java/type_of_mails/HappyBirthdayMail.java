package type_of_mails;

import never_use_switch.MailInfo;

public class HappyBirthdayMail implements ProcesserOfMail{
    @Override
    public void processOfMail( MailInfo mailInfo ) {
        // 80 lines of code which will send HAPPY_BIRTHDAY mail
        System.out.println("HAPPY_BIRTHDAY " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
