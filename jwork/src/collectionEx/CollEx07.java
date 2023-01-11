package collectionEx;

import java.util.*;
import java.util.Map.Entry;

public class CollEx07 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		// key, value로 입력이 가능
		hm.put("hello",123);
		hm.put("world",345);
		//key를 null로 할 수 있고 value도 null로 할 수 있다.
		hm.put(null,555);
		hm.put("nullkey",null);
		System.out.println(hm+"\n");
		for(String key:hm.keySet()) {
			System.out.println("key : "+key+", value : "+hm.get(key));
		}
		// entrySet메소드는 key, value를 볼 수 있게 해준다.
		for(Entry<String, Integer> s:hm.entrySet()) {
			System.out.println(s.getKey()+", "+s.getValue());
		}
		
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
		lhm.put("hello",123);
		lhm.put("world",345);
		// key를 null로 할 수 있고 value도 null로 할 수 있다.
		lhm.put(null,555);
		lhm.put("nullkey",null);
		System.out.println(lhm+"\n");
		
		for(String key:lhm.keySet()) {
			System.out.println("key : "+key+", value : "+hm.get(key));
		}
		// entrySet메소드는 key, value를 볼 수 있게 해준다.
		for(Entry<String, Integer> s:lhm.entrySet()) {
			System.out.println(s.getKey()+", "+s.getValue());
		}
	}
}
