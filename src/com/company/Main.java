package com.company;
import java.awt.event.InputEvent;
import java.awt.*;

/*

An auto clicker that closely resembles a human and may be able to surpass some anticheat.
This auto clicker is currently in development and will only be used for experimental purposes.

I am currently a software engineering student at Milwuakee School of Engineering.
I am using this autoclicker as a personal project to better my java skills for the work/intern enviorment.

Feel free to use this auto clicker at your OWN RISK. Auto clickers are against many of the terms of service
for most online games. It is an unfair advantage and I advise that you try to refrain from cheating.

 */


public class Main {

    public static void main(String[] args) {
        try {

            while(true) {
                Robot r = new Robot();
                int button = InputEvent.BUTTON1_DOWN_MASK;
                System.out.println("Click");
                r.mousePress(button);
                Thread.sleep(400);
                r.mouseRelease(button);
                Thread.sleep(400);
            }

        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
