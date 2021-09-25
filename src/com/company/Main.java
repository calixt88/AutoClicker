package com.company;
import java.awt.event.InputEvent;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

/*

An auto clicker that closely resembles a human and may be able to surpass some anticheat.
This auto clicker is currently in development and will only be used for experimental purposes.

I am currently a software engineering student at Milwuakee School of Engineering.
I am using this autoclicker as a personal project to better my java skills for the work/intern enviorment.

Feel free to use this auto clicker at your OWN RISK. Auto clickers are against many of the terms of service
for most online games. It is an unfair advantage and I advise that you to try to refrain from cheating.

 */


public class Main {

    //Click Method
    static void click() throws InterruptedException, AWTException {
        System.out.println("Click");
        int button = InputEvent.BUTTON1_DOWN_MASK; // Init of click button
        Robot r = new Robot(); //Init of robot object
        r.mousePress(button); //Mouse press
        int pressTime = getRandomInteger(100, 2000);
        System.out.println(pressTime);
        Thread.sleep(pressTime); // Pause for random number in milliseconds (pressTime)
        r.mouseRelease(button); // Release click button
        int releaseTime = getRandomInteger(100,400);
        System.out.println(releaseTime);
        Thread.sleep(releaseTime); // Pause for random number in milliseconds (releaseTime)
    }

    public static void main(String[] args) throws AWTException, InterruptedException {
        click();


    }

    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }

}
