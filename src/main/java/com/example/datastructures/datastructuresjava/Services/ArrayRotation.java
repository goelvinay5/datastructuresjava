package com.example.datastructures.datastructuresjava.Services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.datastructures.models.ArrayDS;
 
@RestController
public class ArrayRotation {
    @GetMapping("/arrayrotation")
    public ArrayDS solve() {
        ArrayDS obj = new ArrayDS();
        int n =5;
        int[] A = {1,2,3,4,5};
        obj.input = A.clone();
        int B=3;
        B=B%n;
        ArrayReverse ar = new ArrayReverse();
        ar.reverse (A,0,n-1);
        ar.reverse(A,0,B-1);
        ar.reverse(A,B,n-1);
        obj.Title = "Array Rotation";
        obj.output = A;
        return obj;
    }

    
}