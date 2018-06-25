package com.brainacad.oop.testgenerics1;

public class MyTuple<A,B,C> {
    private A aField;
    private B bField;
    private C cField;

    public A getaField() {
        return aField;
    }

    public void setaField(A aField) {
        this.aField = aField;
    }

    public B getbField() {
        return bField;
    }

    public void setbField(B bField) {
        this.bField = bField;
    }

    public C getcField() {
        return cField;
    }

    public void setcField(C cField) {
        this.cField = cField;
    }

    public MyTuple(A aField, B bField, C cField) {

        this.aField = aField;
        this.bField = bField;
        this.cField = cField;
    }
}
