# techmojo
Techmojo Coding Test

## Prerequisites
* Java 8

## Classes
* Application.java Main Method Class.
* HashtagExtractor.java - Class respnsible to extract HashTag from the tweet.
* HashtagCounter.java - Class reposonsible to create a hashmap (structure), which will hold a hashtag and there count.
* HashtagPrinter.java - Class holds methods to print hashtags with diff options (1. Print top trending hashtag 2. Print top trending hashtag with occurance count).

### Run the application
* run the run.bat file with tweet as an argument 
* $ run.bat "This is a sample test string of tweet - Indian Cricket #cricket #india #team #mensinblue Sachin Tendulkar #sachin Virendra Sehvag #sehvag Rahul Dravid #dravid #sourabh #dhoni #yuvraj #harbhajan #raina #rohit #rahul #vipin #india #mumbai #sachin #sehvag #dravid #sourabh #dhoni  #sachin #sehvag #dravid #sourabh #dhoni  #sachin #sehvag #dravid #sourabh #dhoni  #sachin #sehvag #dravid #sourabh #dhoni  #sachin #sehvag #dravid #sourabh #dhoni #sachin #sehvag #dravid #sachin #sehvag #dravid #sachin #sehvag #sachin #sehvag #sachin #sehvag #sachin #sehvag #sachin #sehvag #vipin #vipin #vipin #kedar #kedar #ravi #ravi #sachin #kapil #kapil #kapil #irfan #jaheer"

### Output
#sachin
#sehvag
#dravid
#dhoni
#sourabh
#vipin
#kapil
#india
#ravi
#kedar
