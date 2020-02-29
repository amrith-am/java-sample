package com.amrith.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {


        List<String> student=new ArrayList<>();
        student.add("Amrith");
        student.add("Aqueel");
        student.add("Falil");
        student.add("FAris");
        student.add("Yusuf");
        System.out.println(student);
        List<String> filtereddata=student.stream()
                .filter(s->s.length()>5)
                .collect(Collectors.toList());
        System.out.println(filtereddata);

    }
}
