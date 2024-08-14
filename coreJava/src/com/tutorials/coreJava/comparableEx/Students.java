package com.tutorials.coreJava.comparableEx;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Students implements Comparable<Students>{
   private String name;
   private int rank;
   private String grade;

   public Students(String name,int rank,String grade){
       this.rank = rank;
       this.name = name;
       this.grade = grade;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students student) {
       // return Integer.compare(getRank(),student.getRank()); //-- this will sort based on rank in ascending order
       // return getName().compareTo(student.getName()); //-- this will sort based on name in ascending order
        //below logic will print in descending order
        if(getRank()== student.getRank())
            return 0;
        else if (getRank()< student.getRank()){
            return 1;
        } else
            return -1;
    }
}