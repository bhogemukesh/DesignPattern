package com.mukesh.designpattern.corejava.structural.adaptor;

/**
 * @author Mukesh Bhoge
 * Analogy : Mobile chargers. One charger having adaptors which will help charging different mobile phones
 * Consider as scenario here one of pear programer only share class file of PilotPen.class and no source code
 * Now i have to use that in our code to write the assignment then  how to implement that.
 **/
public class AdaptorMainApp {

    public static void main(String[] args) {
        Pen p = new PenAdaptor();
        AssignmentWork  assignmentWork = new AssignmentWork();
        assignmentWork.setP(p);
        assignmentWork.writeAssignment("!!! Hello Welcome to adaptor pattern !!!");
    }

}
