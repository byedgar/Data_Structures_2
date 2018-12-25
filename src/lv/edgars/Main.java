package lv.edgars;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size= 1000000;
        int rndom;
        long startTime;
        long endTime;
        Random rnd = new Random();

        ArrayClass arr = new ArrayClass(size);
        ArrayClass arr1 = new ArrayClass(size);
        ArrayClass arr2 = new ArrayClass(size);
        ArrayClass arr3 = new ArrayClass(size);
        for (int i = 0; i < size; i++) {
            rndom= rnd.nextInt(10000 - 5 + 1) + 5;
            arr.add(rndom);
            arr1.add(rndom);
            arr2.add(rndom);
            arr3.add(rndom);
        }

        //arr.display();

        startTime = System.currentTimeMillis();
        arr1.sortBubble();
        endTime = System.currentTimeMillis();
        System.out.println("Bubble sort : " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        arr2.sortInsert();
        endTime = System.currentTimeMillis();
        System.out.println("Insert sort : " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        arr3.sortSelect();
        endTime = System.currentTimeMillis();
        System.out.println("Select sort : " + (endTime - startTime) + " ms");


    }
}
