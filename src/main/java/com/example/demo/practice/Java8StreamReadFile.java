package com.example.demo.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Java8StreamReadFile {
	
public static void main(String[] args) {
	try {
		
		Stream <String> lines0 = Files.lines(Paths.get("D:\\demo.txt"));
        lines0.forEach(System.out::println);
        lines0.close();
		
        System.out.println("After filtered:");
        
        Stream <String> lines = Files.lines(Paths.get("D:\\demo.txt")).filter(line -> line.startsWith("F"));
        lines.forEach(System.out::println);
        lines.close();
        
        
        System.out.println("Through BufferedReader:");
        
        BufferedReader br = Files.newBufferedReader(Paths.get("d:\\demo.txt"));
        Stream <String> lines1 = br.lines().map(str -> str.toUpperCase());
        lines1.forEach(System.out::println);
        lines1.close();
        
        
    } catch (IOException e) {
        e.printStackTrace();
    }
}


}