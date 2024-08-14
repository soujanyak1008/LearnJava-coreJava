package com.tutorials.coreJava.comparatorEx;

import java.util.Comparator;

public class EmployeeRankComparatr implements Comparator<Employees> {


    @Override
    public int compare(Employees o1, Employees o2) {
        return (o1.getRanking()-o2.getRanking());
    }



}
