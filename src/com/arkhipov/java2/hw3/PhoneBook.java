package com.arkhipov.java2.hw3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    public static void main(String[] args) {

        System.out.println("Task1");
        task1();
        System.out.println("\nTask2");
        task2();
    }


    private static void task1() {
            ArrayList<String> notebook1 = new ArrayList<>();
            notebook1.add("one");
            notebook1.add("two");
            notebook1.add("four");
            notebook1.add("three");
            notebook1.add("five");
            notebook1.add("three");
            notebook1.add("four");
            notebook1.add("four");
            notebook1.add("four");
            notebook1.add("five");
            notebook1.add("five");

            System.out.print(notebook1);

            HashMap<String, Integer> notebook1HashMap = new HashMap<>();
            for (String note:notebook1) {
                int count = 0;
                for (String note1: notebook1) {
                    if (note == note1)
                        count ++;
                }

                notebook1HashMap.put(note, count);
            }
            System.out.print(notebook1HashMap);

    }


    private static void task2() {
        Phonebook.addphonebook("name1","phone1");
        Phonebook.addphonebook("name2","phone2");
        Phonebook.addphonebook("name1","phone3");
        Phonebook.addphonebook("name1","phone4");
        Phonebook.addphonebook("name3","phone5");
        //Set<String> keys = Phonebook.addphonebook().keySet();
        //ArrayList<String> numbersSet = Phonebook.getNumber ("name1");
        Phonebook.getNumber ("name1");
        Phonebook.getNumber ("name2");
        Phonebook.getNumber ("name3");


    }

    private static class Phonebook {
        public static HashMap<String, ArrayList<String>> phonebookHm = new HashMap<>();

        public static void addphonebook(String name, String phone) {
            if (phonebookHm.containsKey(name)){
                phonebookHm.get(name).add(phone);
            }
            else{
                ArrayList<String>phoneAl = new ArrayList<>();
                phoneAl.add(phone);
                phonebookHm.put(name, phoneAl);
            }


            //System.out.println(phonebookHm.get(name) + "|");
            //return phonebookHm;
        }

        public static HashMap<String, ArrayList<String>> addphonebook() {
            return phonebookHm;
        }

        public static ArrayList<String> getNumber(String name1) {
            System.out.println("Name: " + name1 +" - Phone: "+ phonebookHm.get(name1));
            return phonebookHm.get(name1);
        }
    }

}


