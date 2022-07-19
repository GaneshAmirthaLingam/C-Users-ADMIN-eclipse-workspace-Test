package org.sample;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
static Map<Character, Integer>occuranceOfCharacter(String s){
	
	char[] c = s.toCharArray();
	Map<Character, Integer> m = new LinkedHashMap();
	for (int i = 0; i < c.length; i++) {
		if (m.containsKey(c[i])) {
			Integer I = m.get((c[i]));
			m.put((c[i]), I+1);
						
		}else {
			m.put((c[i]), 1);
		}
	}
	return m;
}
public static void main(String[] args) {
	Map<Character, Integer>occuranceOfCharacter = occuranceOfCharacter("AmirthaLingam");
	System.out.println(occuranceOfCharacter);
}
	}
