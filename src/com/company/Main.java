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

        Iterator<String> iter1 = listA.iterator();
        iter1 = listA.iterator();
        while (iter1.hasNext()){
            String s1 = iter1.next();
            System.out.println(s1);
        }
        System.out.println("___________________");


        listA.ensureCapacity(10);
        ArrayList<String> listB = new ArrayList<>(10);
        System.out.println("Список B");
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());

        Iterator<String> iter2 = listB.iterator();
        iter2 = listB.iterator();
        while (iter2.hasNext()){
            String s2 = iter2.next();
            System.out.println(s2);
        }
        System.out.println("___________________");

        ArrayList<String> listC = new ArrayList<>();
        Collections.reverse(listB);

        Iterator<String> iter = listC.iterator();

        for (int i = 0; i < listB.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
            iter = listC.iterator();
        }
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
        System.out.println("____________________________");


        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }

        });
        iter = listC.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }
}
