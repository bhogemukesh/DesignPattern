package com.mukesh.designpattern.corejava.structural.adaptor;

/**
 * @author Mukesh Bhoge
 **/
public class AssignmentWork {

    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void writeAssignment(String str){
        p.write(str);
    }


}
