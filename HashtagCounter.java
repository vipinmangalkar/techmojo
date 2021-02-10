import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * HashtagCounter
 * Class reposonsible to create a hashmap (structure), which will hold a hashtag and there count
 */
public class HashtagCounter {

    /**
     * Method returns a Map with key as hashag and value as occurence of hashag
     * A Map is sorted by value in decending order means - hashtag with max occurence will be first element in map structure 
     * @param hashtagList
     * @return <code>Map<String, Integer></code>
     */
	public Map<String, Integer> createHashTagMapWithCount(List<String> hashtagList) {
        
        Map<String, Integer> hashtagMap = new HashMap<>(); 

        for (String hashtag : hashtagList) {
            if(hashtagMap.containsKey(hashtag)){
                hashtagMap.put(hashtag, hashtagMap.get(hashtag) + 1);
            } else {
                hashtagMap.put(hashtag, 1); 
            }
        }
        return sortMapByValue(hashtagMap);
	}


    /**
     * Method to sort inputMap with value in decending order
     * @param inputMap
     * @return
     */
    private Map<String, Integer> sortMapByValue(Map<String, Integer> inputMap) {
         return inputMap
         .entrySet()
         .stream()
         .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
         .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }  

}
