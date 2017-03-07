package com.thunisoft.quickSort;

/**
 * @author minghui
 * @create 2017-03-07 11:29
 */
public class Main {
    public static void main(String[] args) {

//        Integer[] arr = {50,8,45,2,33,56,84,88,11};
//        QuickSort.quickSort(arr, 0, arr.length-1);



        TestSort t1 = new TestSort(1,"mh");
        TestSort t2 = new TestSort(2,"mh");
        TestSort t3 = new TestSort(3,"mh");
        TestSort t4 = new TestSort(4,"mh");
        TestSort t5 = new TestSort(5,"mh");
        TestSort t6 = new TestSort(6,"mh");

        TestSort[] testArr = {t2,t5,t6,t4,t3,t1};
        QuickSort.quickSort(testArr, 0, testArr.length-1);

    }
}
