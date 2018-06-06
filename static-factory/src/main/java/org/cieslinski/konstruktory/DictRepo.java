package org.cieslinski.konstruktory;

import java.util.HashMap;
import java.util.Map;

public class DictRepo {

	public Map<String, String> getMap() {
		HashMap<String,String> map = new HashMap<>();
		map.put("300", "500");
		return map;
	}

}
