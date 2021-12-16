package com.mukesh.designpattern.corejava.structural.adaptor;

/**
 * @author Mukesh Bhoge
 * Analogy : Mobile chargers. One charger having adaptors which will help charging different mobile phones
 **/
public class AdaptorMainApp {

    public static void main(String[] args) {
        Pen p = new PenAdaptor();
        AssignmentWork  assignmentWork = new AssignmentWork();
        assignmentWork.setP(p);
        assignmentWork.writeAssignment("!!! Hello Welcome to adaptor pattern !!!");
    }

}
