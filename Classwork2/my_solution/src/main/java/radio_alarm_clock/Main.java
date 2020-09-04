package radio_alarm_clock;

public class Main {
    public static void main( String[] args ) {
        RadioAlarmClock radioAlarmClock = new RadioAlarmClock();
        
        radioAlarmClock.increaseVolume(8);
        radioAlarmClock.setAlarm();
        radioAlarmClock.setTime("8:00:00");
        radioAlarmClock.setFrequency(104.45);

    }
}
