package com.company;
import java.awt.event.InputEvent;
import java.awt.*;

/*

An auto clicker that closely resembles a human's inconsistencies and may be able to surpass some anti-cheat.
This auto clicker is currently in development and will only be used for experimental purposes.

The program runs for a certain number of clicks but can be changed longer by changing the CLICKS variable.
There are random timed pauses in between the press and release for the mouse. There are also random timed
pauses in between the clicks themselves. This is to help make the clicks more 'human' like.

The current CLICK number of 2000 takes approximately 35-40 minutes. On average each click takes a little over
1 second to complete. (60 cps) I chose 2000 clicks because I am experimenting with the online MMORPG Runescape.
I am using the 40-minute intervals as "breaks" for a person. I WILL have commented code that can be entered to
begin the loop again after an allotted break time.


Feel free to use this auto clicker at your OWN RISK. Auto clickers are against many of the terms of service
for most online games. It is an unfair advantage, and I advise that you to try to refrain from cheating.
 */


public class Main {

    //Click Method
    static void click() throws InterruptedException, AWTException {
        System.out.println("Click");
        int button = InputEvent.BUTTON1_DOWN_MASK; // Init of click button
        Robot r = new Robot(); //Init of robot object
        r.mousePress(button); //Mouse press
        int pressTime = getRandomInteger(100, 600);
        //System.out.println(pressTime);
        Thread.sleep(pressTime); // Pause for random number in milliseconds (pressTime)
        r.mouseRelease(button); // Release click button
        int releaseTime = getRandomInteger(100,600);
        //System.out.println(releaseTime);
        Thread.sleep(releaseTime); // Pause for random number in milliseconds (releaseTime)
    }

    //Pause Method
    static void pause() throws InterruptedException {
        int pause = getRandomInteger(200,500);
        Thread.sleep(pause);
    }

    //Random integer method
    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }

    public static void main(String[] args) throws AWTException, InterruptedException {
        int CLICKS = 2000; //amount of clicks performed before the program ends
        int iteration = 5;

        //This code completes only one rotation of clicks
        //If you would like to use the code with "breaks"...
        //Comment out the for loop code below and uncomment the code below the for loop
        for(int i = 0; i < CLICKS; i++)
        {
            pause();
            click();
            //pause();  //Can add another pause for security
            System.out.println("Number of clicks: " + i);
        }

        /*

        Uncomment this code for the program with included breaks.
        MAKE SURE TO COMMENT OR REMOVE THE FOR LOOP ABOVE

        for(int i = 0; i < iteration; i++) {
            for(int j = 0; j < CLICKS; j++)
            {
                pause();
                click();
                //pause();  //Can add another pause for security
                System.out.println("Number of clicks: " + i);
            }
            int sleepyTime = getRandomInteger(350000,400000)
            Thread.sleep(sleepyTime);
        }
        */

    }

}
