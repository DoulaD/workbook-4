package com.hotel;

import java.time.LocalTime;

public class Employee {
    private String employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;

    public Employee(String employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchInTime = -1;
    }

    public void setPunchInTime(double time){
        if (punchInTime == -1){
            punchInTime = time;
        }
    }
    public void punchInTime(){
        LocalTime now = LocalTime.now();
                if (punchInTime == -1){
                    punchInTime = now.getHour() + (now.getMinute() / 60.0) + (now.getSecond() / 3600.0);
                }
    }

    public void punchOut(double time) {
        if (punchInTime != -1) {
            double worked = time - punchInTime;
            hoursWorked = hoursWorked + worked;
            punchInTime= -1;
        }
    }

    public void punchOut() {
        LocalTime now = LocalTime.now();

        if (punchInTime != -1) {
            double endTime = now.getHour() + (now.getMinute() / 60.0) + (now.getSecond() / 3600.0);
            double worked = endTime - punchInTime;
            hoursWorked = hoursWorked + worked;
            punchInTime = -1;
        }
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }
    public double getOvertimeHours(){
        return Math.max(0, hoursWorked - 40);
    }
    public double getTotalPay(){
        double regularPay = getRegularHours() * payRate;
        double overTimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overTimePay;
    }

    public void punchInTime(double time){
        punchInTime = time;
        System.out.println(name + "punched in at " + time);
    }






}
