package com.amrith.sample;

import sun.management.Sensor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {


  /*      List<String> student=new ArrayList<>();
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
*/
/*  Sensors sensor=new Sensors();
  sensor.setName("main door");
  sensor.setValue((double) 25);
*/
List<Sensors> sensors=new ArrayList<>();
Sensors sensor1=new Sensors("Living Room",28);
Sensors.add(sensor1);
Sensors sensor2 = new Sensors("Office Room",26);
Sensors.add(sensor2);
Sensors sensor3 = new Sensors("Bed Room",31);
Sensors.add(sensor3);
Sensors sensor4 = new Sensors("Bath Room",25);
Sensors.add(sensor4);







    }
}
