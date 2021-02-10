import java.util.LinkedList;
import java.util.List;

public class HashtagExtractor {

    /**
     * Method to extract the hastag word from the tweets
     * @param tweets
     * @return <code>List<String></code> - List of HashTag Strings
     */
	public List<String> extractHashtags(String tweets) {
        
        List<String> hashtagList = new LinkedList<>();
        String [] wordArr = tweets.split(" ");

        for (int i = 0; i < wordArr.length ; i++){
            if(wordArr[i].startsWith("#")){
                hashtagList.add(wordArr[i]);
            }
        }

        return hashtagList;
	}
}
