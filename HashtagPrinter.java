import java.util.Map;

/**
 * HashTagPrinter Class holds methods to print hashtags with diff options
 */
public class HashtagPrinter {

	/**
	 * Method to print topN hashtag searches
	 * 
	 * @param topN
	 * @param hashtagMap
	 */
	public void printTrendingHashtag(int topN, Map<String, Integer> hashtagMap) {

		if (hashtagMap.isEmpty())
			System.out.println("Nothing to print [no hashtag found]");

		int counter = 0;
		for (String hashtag : hashtagMap.keySet()) {

			if (counter >= topN)
				break;

			System.out.println(hashtag);
			counter++;
		}
	}

	/**
	 * Method to print topN hashtag with there occurence count
	 * 
	 * @param topN
	 * @param hashtagMap
	 */
	public void printTrendingHashtagWithCount(int topN, Map<String, Integer> hashtagMap) {

		if (hashtagMap.isEmpty())
			System.out.println("Nothing to print [no hashtag found]");

		int counter = 0;

		for (Map.Entry entry : hashtagMap.entrySet()) {

			if (counter >= topN)
				break;

			System.out.println("[" + entry.getKey() + " - " + entry.getValue() + "]");
			counter++;
		}
	}

}
