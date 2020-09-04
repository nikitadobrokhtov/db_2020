package type_of_mails;

import never_use_switch.MailInfo;

public class CallbackMail implements ProcesserOfMail{
    @Override
    public void processOfMail( MailInfo mailInfo ) {
        // 80 lines of code which will send CALLBACK mail
        System.out.println("EMAIL_CALLBACK " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
