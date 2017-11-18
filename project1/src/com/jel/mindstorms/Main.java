package com.jel.mindstorms;


import lejos.hardware.BrickFinder;
import lejos.hardware.BrickInfo;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.*;
import lejos.hardware.motor.Motor;

public class Main {

    public static void main(String[] args) {
        //BrickInfo q[] = BrickFinder.discover();
        //int i = 0;
        //ev3.getVideo();

        LCD.drawString("Hello", 0, 0);

        Motor.A.rotate(10);

    }
}
