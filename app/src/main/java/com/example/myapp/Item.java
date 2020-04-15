package com.example.myapp;

public class Item {
    private String label;
    private double value;


    public Item(String label,double value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel(){
        return this.label;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public double getValue(){
        return this.value;
    }
    public void setValue(double value){
        this.value = value;
    }

    @Override
    public String toString() {
        return label;
    }
}
