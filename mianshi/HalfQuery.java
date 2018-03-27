package com.zj.javatest;

import java.util.ArrayList;
import java.util.List;

public class HalfQuery {

    /**
     * 1、使用二分法对一个数组中的数据进行查找（数组已排序），返回目标数值所在的下标，如果没有找到则返回-1。
     * <p>
     * a)注意：数组元素类型应该可以是任意满足可排序算法的类型
     * <p>
     * b)注意：需返回所有等于目标值的下标
     * <p>
     * c)注意：数组可以是升序也可以是降序，尽量让代码简介无重复逻辑
     */


    public static void main(String[] args) {

        int[] arr = {1,1, 5, 9, 10, 11, 30, 31, 40,40,40};
        int[] arr1 = {30,20,20,20,6,2,1,1,1};
        List<Integer> query = query(arr1, 20);
        for (Integer i : query) {
            System.out.println(i);
        }


    }



    public static List<Integer> aa(int[] arr, int mid, int key) {
        List<Integer> list = new ArrayList<>();
        //向左
        int a = mid;
        list.add(mid);
        while (++a <arr.length && arr[a] == key) {
            list.add(a);
        }
        //向右
        while (--mid >= 0 && arr[mid] == key) {
            list.add(mid);
        }
        return list;
    }

    public static List<Integer> query(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        boolean isAsc = false;
        //若是升序
        if (arr[left] < arr[right]) {
            isAsc = true;
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > key) {
                if (isAsc) {
                    //若key在mid的左边
                    right = mid - 1;
                } else {
                    //若key在mid的右边
                    left = mid + 1;
                }
            } else if (arr[mid] < key) {
                if (isAsc) {
                    //若key在mid的右边
                    left = mid + 1;
                } else {
                    //若key在mid的左边
                    right = mid - 1;
                }
            } else {
                //如果mid等于key，则向左，向右遍历，找到重复的值
                return aa(arr, mid, key);
            }
        }
        return null;
    }
    public int fun(int a[], int key) {
        int low, high, mid;
        low = 0;
        high = a.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key < a[mid])
                high = mid - 1;
            else if (key > a[mid])
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }

}
