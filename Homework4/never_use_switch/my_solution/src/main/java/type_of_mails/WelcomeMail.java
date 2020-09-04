package type_of_mails;

import never_use_switch.MailInfo;

public class WelcomeMail implements ProcesserOfMail {

    @Override
    public void processOfMail( MailInfo mailInfo ) {
        // 60 lines of code which will send WELCOME mail
        System.out.println("WELCOME " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
