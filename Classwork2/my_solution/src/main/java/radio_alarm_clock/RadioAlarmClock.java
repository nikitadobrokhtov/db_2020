package radio_alarm_clock;



import java.time.LocalTime;

public class RadioAlarmClock implements Radio, AlarmClock{

    private String time;

    @Override
    public void setTime( String time ) {
        System.out.println("Time " + time + " was assigned");
        this.time = time;
    }

    @Override
    public void setAlarm() {
        if(time == "some assigned time"){
            System.out.println("Pi pi pi pi pi pi!");
        }
    }

    @Override
    public void increaseVolume( int delta ) {
        System.out.println("Volume is increased by " + delta);
    }

    @Override
    public void setFrequency( double frequency ) {
        System.out.println("Frequency " + frequency + " is set");
    }
}
