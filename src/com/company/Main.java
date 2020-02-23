package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>(5);
        System.out.println("Список А");
        listA.add(sc.nextLine());
        listA.add(sc.nextLine());
        listA.add(sc.nextLine());
        listA.add(sc.nextLine());
        listA.add(sc.nextLine());

        System.out.println(listA);

        listA.ensureCapacity(10);
        ArrayList<String> listB = new ArrayList<>(10);
        System.out.println("Список B");
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());

        System.out.println(listB);

        ArrayList<String> listC = new ArrayList<>();
       //Collections.sort(listA);
        //Collections.sort(listB);
        //Collections.reverse(listB);


        listC.addAll(listA);
        listC.add(1, listB.get(4));
        listC.add(3, listB.get(3));
        listC.add(5, listB.get(2));
        listC.add(7, listB.get(1));
        listC.add(9, listB.get(0));
        System.out.println(listC);
        Collections.sort(listC);
        System.out.println(listC);

        }
    }

