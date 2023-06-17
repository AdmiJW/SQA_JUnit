package org.example;

public class Student {

    private String name;
    private String studentID;
    private int attendance;
    private int mark;
    private int carryCredit;
    private int currentCredit;
    private double carryCPA;
    private double CGPA;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getCarryCredit() {
        return carryCredit;
    }

    public void setCarryCredit(int carryCredit) {
        this.carryCredit = carryCredit;
    }

    public int getCurrentCredit() {
        return currentCredit;
    }

    public void setCurrentCredit(int currentCredit) {
        this.currentCredit = currentCredit;
    }

    public double getCarryCPA() {
        return carryCPA;
    }

    public void setCarryCPA(double carryCPA) {
        this.carryCPA = carryCPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

}
