package com.company;

/*
0821 namesakes and namesakes
1. Create a Map dictionary (<String, String>) and add 10 people there in the form “Last Name” - “First Name”.
2. Let among these 10 people there are people with the same names.
3. Let among these 10 people there are people with the same surnames.
4. Display the contents of the Map.

Requirements:
1. The program should display the text on the screen.
2. The Solution class should contain only three methods.
3. The createPeopleList () method must create and return a Map dictionary with the element type String, String. In addition, add 10 people to the dictionary.
4. In the createPeopleList () method, people with the same last names should be added.
5. In the createPeopleList () method, people with the same name must be added.
6. The printPeopleList () method should display all the people from the Map dictionary. Print each value on a new line. Last name and first name are separated by a space.
7. The main () method should call the createPeopleList () method.
8. The main () method should call the printPeopleList () method.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args)  {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }
    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Alex","Coziosko");
        map.put("Kate","Readdy");
        map.put("Darren","Parker");
        map.put("Alex","Matte");
        map.put("Matt","Shannon");
        map.put("Peter","Parker");
        map.put("Iryna","Fedorova");
        map.put("Darren","Costino");
        map.put("Brandley","Readdy");
        map.put("Matt","Murphy");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String>s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}


