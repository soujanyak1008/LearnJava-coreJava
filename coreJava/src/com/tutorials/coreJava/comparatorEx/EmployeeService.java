package com.tutorials.coreJava.comparatorEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmployeeService {

    public static void main(String []args){
        ArrayList<Employees> MyEmployees = new ArrayList<>();
        MyEmployees.add(new Employees("SK","Sr Developer",3));
        MyEmployees.add(new Employees("SH","Developer",2));
        MyEmployees.add(new Employees("L","Jr Developer",1));
        MyEmployees.add(new Employees("A","Analyst",2));

        EmployeeNameComparatr nameComparatr =  new EmployeeNameComparatr();
        System.out.println("Employees list before sort ::" +MyEmployees);

        MyEmployees.sort(nameComparatr);

        System.out.println("Employees list after sort by name::" +MyEmployees);

        EmployeeRankComparatr rankComparatr = new EmployeeRankComparatr();
        MyEmployees.sort(rankComparatr);
        System.out.println("Employees list after sort by rank::" +MyEmployees);


    }
}
