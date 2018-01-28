package com.jel.mindstorms;


import lejos.hardware.BrickFinder;
import lejos.hardware.BrickInfo;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.*;
import lejos.hardware.motor.Motor;
import lejos.utility.Delay;

public class Main {

    public static void main(String[] args) {
        GraphicsLCD g = BrickFinder.getDefault().getGraphicsLCD();
        final int SW = g.getWidth();
        final int SH = g.getHeight();

        g.setFont(Font.getDefaultFont());
        g.drawString("Hallo Finn", SW/2, SH/2, GraphicsLCD.BASELINE|GraphicsLCD.HCENTER);
        g.drawRect(10,10, 158, 108);
        Delay.msDelay(3000);

        g.clear();
        g.refresh();
    }
}
