package com.application.model;

public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String employeeAddress;
    private Pancard pancard;

    Employee(Integer employeeId,String employeeName,String employeeAddress,Pancard pancard){
        super();
        this.employeeId = employeeId;
        this.employeeName= employeeName;
        this.employeeAddress= employeeAddress;
        this.pancard = pancard;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Pancard getPancard() {
        return pancard;
    }

    public void setPancard(Pancard pancard) {
        this.pancard = pancard;
    }
}
