package com.thunisoft.quickSort;

import java.util.Arrays;

/**
 * @author minghui
 * @create 2017-03-07 10:13
 */
public class QuickSort {





    /**
     * @param targetArr 需要排序的数组
     * @param start     排序起始位置
     * @param end       结束位置
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void quickSort(T[] targetArr, int start, int end) {
        if (start < end) {
            int l = start, h = end;
            T key = targetArr[start];

            while (l < h) {
            /*从右向左找第一个小于key的值  */
                while (l < h && targetArr[h].compareTo(key) >= 0) {
                    h--;
                }
                if (l < h) {
                    targetArr[l++] = targetArr[h];
                }
            /*从左向右找第一个大于key的值*/
                while (l < h && targetArr[l].compareTo(key) <= 0) {
                    l++;
                }
                if (l < h) {
                    targetArr[h--] = targetArr[l];
                }
            }
            targetArr[l] = key;

            System.out.println(Arrays.toString(targetArr));
            System.out.print("l=" + (l + 1) + "   h=" + (h + 1) + "   key=" + key + "\n");

            quickSort(targetArr, start, l-1);
            quickSort(targetArr, l+1, end);


        }
    }
}
