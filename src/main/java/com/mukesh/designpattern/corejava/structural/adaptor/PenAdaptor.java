package com.mukesh.designpattern.corejava.structural.adaptor;

/**
 * @author Mukesh Bhoge
 **/
public class PenAdaptor implements Pen {

    PilotPen pilotPen = new PilotPen();
    @Override
    public void write(String str) {
        pilotPen.mark(str);
    }
}
