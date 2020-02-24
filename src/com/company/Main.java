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

        System.out.println("spisok A " + listA);

        listA.ensureCapacity(10);
        ArrayList<String> listB = new ArrayList<>(10);
        System.out.println("Список B");
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());

        System.out.println("spisok B " + listB);

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

        }
        System.out.println("spisok C2" +listC);


        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }

        });
        iter = listC.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println("spisok sort" +str);
        }

    }
}

//        listC.add(1, listB.get(4));
//        listC.add(3, listB.get(3));
//        listC.add(5, listB.get(2));
//        listC.add(7, listB.get(1));
//        listC.add(9, listB.get(0));
//        System.out.println("spisok C " +listC);
//       Collections.sort(listC);