package com.tutorials.coreJava.comparableEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentsCompare {

    public static void main(String []args){

        ArrayList<Students> StudentsGrade2 = new ArrayList<Students>();

        StudentsGrade2.add(new Students("Aarya",3,"2"));
        StudentsGrade2.add(new Students("Hasvi",1,"2"));
        StudentsGrade2.add(new Students("Thanvi",2,"2"));
        StudentsGrade2.add(new Students("Peter",4,"2"));
        System.out.println("Students before sorting ::" +StudentsGrade2);

        Collections.sort(StudentsGrade2);

        System.out.println("Students after sorting::" +StudentsGrade2 );


    }
}
