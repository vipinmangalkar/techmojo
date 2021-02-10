import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        //check if argument is passed or not
        if(args.length == 0) {
            System.out.println("Please pass tweet string as argument to run the program");
            return;
        } 
        
        //String tweets = "This is a sample test string of tweet #cricket #india #team #mensinblue #sachin #sehvag #dravid #sourabh #dhoni #yuvraj #harbhajan #raina #rohit #rahul #vipin #india #mumbai #sachin #sehvag #dravid #sourabh #dhoni  #sachin #sehvag #dravid #sourabh #dhoni  #sachin #sehvag #dravid #sourabh #dhoni  #sachin #sehvag #dravid #sourabh #dhoni  #sachin #sehvag #dravid #sourabh #dhoni #sachin #sehvag #dravid #sachin #sehvag #dravid #sachin #sehvag #sachin #sehvag #sachin #sehvag #sachin #sehvag #sachin #sehvag #vipin #vipin #vipin #kedar #kedar #ravi #ravi #sachin #kapil #kapil #kapil #irfan #jaheer";

        final int TOP_N_HASHTAG = 10; // to print n number of top hashtags

        Map<String, Integer> hashtagMap; // structure which will hold and keep track of hashtag and there total count

        HashtagExtractor hashtagExtractor = new HashtagExtractor(); // Class which will extract hashtag from tweets - input given by user
        
        HashtagCounter hashtagCounter = new HashtagCounter();       // Class which will create stucture of hashtag and its occurance count

        HashtagPrinter hashtagPrinter = new HashtagPrinter();       // Class which will print trending hashtags

        List<String> hashtagList = hashtagExtractor.extractHashtags(args[0]);

        hashtagMap = hashtagCounter.createHashTagMapWithCount(hashtagList);

        hashtagPrinter.printTrendingHashtag(TOP_N_HASHTAG, hashtagMap);

        //hashtagPrinter.printTrendingHashtagWithCount(TOP_N_HASHTAG, hashtagMap);
    }

}
