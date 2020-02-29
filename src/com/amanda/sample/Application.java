package com.amanda.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
     /*   List<String> students =new ArrayList<>();
        students.add("Yanadhi");
        students.add("Nuwan");
        students.add("Dileepa");
        students.add("Pari");
        students.add("Thari");
        System.out.println(students);

        List<String> filterdata=students.stream()
                .filter(s -> s.length()>5)
                .collect(Collectors.toList());
        System.out.println(filterdata);
               */
          List<Sensor> sensors = new ArrayList<>();

          Sensor sensor1 =new Sensor("Bed room",28);
          sensors.add(sensor1);
        Sensor sensor2 =new Sensor("Living Room",35);
        sensors.add(sensor2);
        Sensor sensor3 =new Sensor("Kitchen",52);
        sensors.add(sensor3);
        Sensor sensor4 =new Sensor("Corridor",29);
        sensors.add(sensor4);
        Sensor sensor5 =new Sensor("Front Door",32);
        sensors.add(sensor5);

        List<Sensor> hotsensors= sensors.stream()
                .filter(sensor -> sensor.getValue()>32)
                .collect(Collectors.toList());
        System.out.println(hotsensors);














          }


        }



