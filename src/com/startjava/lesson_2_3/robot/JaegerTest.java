package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger coyoteTango = new Jaeger();

        coyoteTango.setModelName("Coyote Tango");
        coyoteTango.setMark("Mark-1");
        coyoteTango.setOrigin("Japan");
        coyoteTango.setHeight(85.34f);
        coyoteTango.setWeight(2.31f);
        coyoteTango.setStrength(7);
        coyoteTango.setArmor(4);
        System.out.println(coyoteTango.getModelName() + " is from " + coyoteTango.getOrigin());

        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 
                1.85f, 10, 9);
        System.out.println(strikerEureka.getModelName() + " is from " + strikerEureka.getOrigin());

        if(coyoteTango.getStrength() > strikerEureka.getStrength()) {
            System.out.println(coyoteTango.getModelName() + " stronger than " + 
                    strikerEureka.getModelName());
        } else {
            System.out.println(coyoteTango.getModelName() + " weaker than " + 
                    strikerEureka.getModelName());
        }
        if(coyoteTango.getWeight() > strikerEureka.getWeight()) {
            System.out.println(coyoteTango.getModelName() + " heavier than " + 
                    strikerEureka.getModelName());
        } else {
            System.out.println(coyoteTango.getModelName() + " lighter than " + 
                    strikerEureka.getModelName());
        }

        if(coyoteTango.isDrift()) {
            System.out.println(coyoteTango.getModelName() + " ready to deploy");
        }
        System.out.println(strikerEureka.getModelName() + " " + strikerEureka.scanKaiju());
        System.out.print(coyoteTango.getModelName() + " ") ;
        coyoteTango.useVortexCannon();

    }
}