package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("Test " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(3, 45);
        String test2Output = test2.getTime();
        System.out.println("Test " + test2Output);
        
        test2.setTime(3, 32);
        System.out.println("Tick pre " + test2.getTime());
        test2.timeTick();
        System.out.println("Tick post " + test2.getTime());
        
        test2.setTime(3, 9);
        System.out.println("Tick pre " + test2.getTime());
        test2.timeTick();
        System.out.println("Tick post " + test2.getTime());
        
        test2.setTime(1, 59);
        System.out.println("Tick pre " + test2.getTime());
        test2.timeTick();
        System.out.println("Tick post " + test2.getTime());

        test2.setTime(9, 59);
        System.out.println("Tick pre " + test2.getTime());
        test2.timeTick();
        System.out.println("Tick post " + test2.getTime());
        
        test2.setTime(23, 59);
        System.out.println("Tick pre " + test2.getTime());
        test2.timeTick();
        System.out.println("Tick post " + test2.getTime());
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        ClockDisplaySeconds test3 = new ClockDisplaySeconds();
        System.out.println("Test " + test3.getTime());
        
        ClockDisplaySeconds test4 = new ClockDisplaySeconds(3, 45, 23);
        System.out.println("Test " + test4.getTime());
        
        test4.setTime(3, 32, 59);
        System.out.println("Tick pre " + test4.getTime());
        test4.timeTick();
        System.out.println("Tick post " + test4.getTime());
        
        test4.setTime(1, 0, 59);
        System.out.println("Tick pre " + test4.getTime());
        test4.timeTick();
        System.out.println("Tick post " + test4.getTime());
        
        test4.setTime(1, 59, 59);
        System.out.println("Tick pre " + test4.getTime());
        test4.timeTick();
        System.out.println("Tick post " + test4.getTime());
        
        test4.setTime(23, 59, 59);
        System.out.println("Tick pre " + test4.getTime());
        test4.timeTick();
        System.out.println("Tick post " + test4.getTime());
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        ClockDisplay12Hour test5 = new ClockDisplay12Hour();
        System.out.println("Test " + test5.getTime());
        
        ClockDisplay12Hour test6 = new ClockDisplay12Hour(3, 45, "PM");
        System.out.println("Test " + test6.getTime());
        
        test6.setTime(3, 32, "PM");
        System.out.println("Tick pre "+ test6.getTime());
        test6.timeTick();
        System.out.println("Tick post " + test6.getTime());
        
        test6.setTime(11, 59, "PM");
        System.out.println("Tick pre "+ test6.getTime());
        test6.timeTick();
        System.out.println("Tick post " + test6.getTime());
        
        test6.setTime(11, 59, "AM");
        System.out.println("Tick pre "+ test6.getTime());
        test6.timeTick();
        System.out.println("Tick post " + test6.getTime());
        
        test6.setTime(12, 59, "PM");
        System.out.println("Tick pre "+ test6.getTime());
        test6.timeTick();
        System.out.println("Tick post " + test6.getTime());
    }
}
