package com.shitalmoradiya.vantage_assign;
import com.shitalmoradiya.vantage_assign.util.Logger;
import com.shitalmoradiya.vantage_assign.util.OutputHelper;
//import org.jetbrains.annotations.NotNull;

public class Runner {

    private static final String FILE_PATH = "S:\\cochrane_Shital-Moradiya\\Project\\cochrone";
    private static final String OUTPUT_FILE_NAME = "cochineal_reviews.txt";

    public static void main( String[] args ) {

        // Parse the arguments
        int numTopicsToScrape;
        String filePath;
        String fileName;
        if(args.length == 3) {
            filePath = args[0];
            fileName = args[1];
            // Parse the int arg
            try {
                numTopicsToScrape = Integer.parseInt(args[2]);
                if(numTopicsToScrape < 0)
                    throw new NumberFormatException();
            } catch (NumberFormatException e) {
                Logger.logE("Third Arg:" + args[0] + " must be an integer >= 0 to declare how many topics to scrape.", e);
                return;
            }
        } else {
            Logger.logI("Allergy &" +
                    "intolerance | Antifungal therapies for allergic bronchopulmonary aspergillosis in people with cystic\n" +
                    "fibrosis | Heather E Elphick, Kevin W Southern|2016-11-08");
            return;
        }

        // Scrape Cochran Library reviews, get formatted string of results
        String formattedReviewResults = CochroneApplication.scrape(numTopicsToScrape);

        // Output to file
        OutputHelper.toFile(FILE_PATH, OUTPUT_FILE_NAME, formattedReviewResults);
        Logger.logI("Completed. Read results at " + filePath + fileName);
    }
}
