
package com.example.demo.practice;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>(); 
		map.put("apple", 3); 
		map.put("mango", 4);

		System.out.println("map before calling compute: " + map); 
		map.compute("apple", (key, value) -> value == null ? 1 : value + 1); 
		System.out.println("map after calling compute on apple: " + map);

		ConcurrentMap<String, LongAdder> map2 = new ConcurrentHashMap<>(); 
		System.out.println("map with LongAdder before calling compute: " + map2); 
		map2.computeIfAbsent("apple", key -> new LongAdder()).increment(); 
		map2.computeIfAbsent("mango", key -> new LongAdder()).increment();
		map2.computeIfAbsent("apple", key -> new LongAdder()).increment(); 
		System.out.println("map with LongAdder after calling compute on apple, mango, apple: " + map2); 
		
		ConcurrentMap<String, Long> map3 = new ConcurrentHashMap<>();
		map3.put("apple", 1l); 
		map3.computeIfPresent("mango", (key, value) -> value+1);
		map3.computeIfPresent("apple", (key, value) -> value+1); 
		System.out.println("map with Long after calling compute on apple, mango, apple: " + map3); 

	}
}
