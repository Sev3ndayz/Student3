package com.company;

import java.util.ArrayList;
import java.util.Iterator;


public class StudentRepository {
    Student student = new Student("Jakub", "Niewadzi");
    ArrayList list = new ArrayList();

    public void WriteListObject() {
        list.add(student.name);
        list.add(student.surename);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

    }


}

