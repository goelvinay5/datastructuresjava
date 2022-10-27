package com.example.datastructures.datastructuresjava.Services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.datastructures.models.ArrayDS;

@CrossOrigin
@RestController
@RequestMapping()
public class ArrayRotation {
    @GetMapping("/arrayrotation")
    public ArrayDS solve() {
        ArrayDS obj = new ArrayDS();
        try {
            obj.problem = new String(Files.readAllBytes(Paths.get("src/main/resources/problems/arrayrotation.txt")));
            obj.solution = new String(Files.readAllBytes(Paths.get("src/main/resources/solutions/arrayrotation.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        };
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