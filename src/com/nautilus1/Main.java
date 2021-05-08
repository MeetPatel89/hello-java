package com.nautilus1;

import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args)  {
		System.out.println("Hello Main...");
		Map<String, Integer> random = new HashMap<>();
		random.put("RandomOne", 1);
		random.put("RandomTwo", 1);
		random.put("RandomThree", 3);
		random.put("RandomThree", 4567);
		System.out.println(random);
	}
}
