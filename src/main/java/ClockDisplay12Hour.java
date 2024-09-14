package src.main.java;


public class ClockDisplay12Hour
{
    //Extend ClockDisplay for a 12 hour clock. This means you need to track AM/PM
    //Update all methods and parameters to accomodate this change

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String display;
    private String period;

    public ClockDisplay12Hour(){
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        hours.setValue(12);
        period = "AM";
        updateDisplay();
    }
    
    public ClockDisplay12Hour(int hour, int minute, String ampm){
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        period = ampm;
        setTime(hour, minute, ampm);
    }
    
    public void timeTick(){
        minutes.increment();
        if (minutes.getValue() == 0){
            hours.increment();
        }
        if (hours.getValue() == 12 && minutes.getValue() == 0){
            if (period.equals("AM")){
                period = "PM";
            }
            else if (period.equals("PM")){
                period = "AM";
            }
        }
        if (hours.getValue() == 0){
            hours.setValue(1);
        }
        updateDisplay();
    }
    
    public void setTime(int hour, int minute, String ampm){
        hours.setValue(hour);
        minutes.setValue(minute);
        period = ampm;
        updateDisplay();
    }
    
    public String getTime(){
        return display;
    }

    public void updateDisplay(){
        display = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + period;
    }
}
