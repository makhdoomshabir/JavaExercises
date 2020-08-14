package com.qa.day5;


public class ConstructorExamples {
       private String name;
       private String pathway;

        public ConstructorExamples(String name, String pathway){
           this.name=name;
           this.pathway = pathway;
        }

    public static void main(String[] args) {
        ConstructorExamples UserOne = new ConstructorExamples("Mak","Software Development");
        System.out.println("Name is: " + UserOne.name);
        System.out.println("Pathway is: " + UserOne.pathway);
        }
    }


