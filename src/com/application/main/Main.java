package com.application.main;

import com.application.model.Employee;
import com.application.model.Pancard;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Employee employee = context.getBean("employee",Employee.class);
        System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeAddress());
        if(employee != null){
            Pancard pancard = employee.getPancard();
            System.out.println(pancard.getPancardHolderName()+"\t"+pancard.getPancardNo());
        }
    }
}
