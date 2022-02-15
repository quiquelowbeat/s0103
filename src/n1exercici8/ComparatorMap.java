package n1exercici8;

import java.util.Comparator;
import java.util.Map;

public class ComparatorMap implements Comparator<Map.Entry<String, String>> {

	public int compare(Map.Entry<String, String> s1, Map.Entry<String, String> s2) {
		
		if(s1.getKey() == s2.getKey())
            return 0;
        if(s1.getKey() == null)
            return 1;
        if(s2.getKey() == null)
            return -1;
        return s1.getKey().compareTo(s2.getKey());
		
	}
	
}
