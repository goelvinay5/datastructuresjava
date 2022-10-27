package com.example.datastructures.datastructuresjava.Services;

public class ArrayReverse {
    public void reverse(int[] A, int start, int end) {
        while (start<end){
            int temp=A[start];
            A[start]=A[end];
            A[end]=temp;
            start++;
            end--;
        }
    }
}
