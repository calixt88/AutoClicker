package com.company;
import java.awt.event.InputEvent;

import java.awt.*;
import java.awt.event.InputEvent;

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
