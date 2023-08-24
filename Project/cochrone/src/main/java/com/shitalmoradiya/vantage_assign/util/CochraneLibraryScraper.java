package com.shitalmoradiya.vantage_assign.util;
import com.shitalmoradiya.vantage_assign.modules.Reviews;

import java.util.Set;
import java.lang.StringBuilder;

    public class CochraneLibraryScraper {

        public static final String COCHRANE_LIBRARY_TOPICS_URL = "https://www.cochranelibrary.com/cdsr/reviews/topics";
        private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.132 Safari/537.36";
        public static final int MAX_CONNECTIONS = 40;
        private static Set<Reviews> reviewSyncSet;



        // Output a string containing the formatted information of all review entries in the sync set
        public static String toOutputString(Set<Reviews> set) {
            StringBuilder formattedString = new StringBuilder();
            Reviews[] reviews = set.toArray(new Reviews[0]);
            for(int i = 0; i < reviews.length-1; i++) {
                formattedString.append(reviews[i].toString());
                formattedString.append("\n\n");
            }
            formattedString.append(reviews[reviews.length-1].toString());
            return formattedString.toString();
        }

        // Return true if an array of ints are all equal
        public static boolean utilIntComp(int[] nums) {
            if(nums == null || nums.length <= 0) return false;
            int first = nums[0];
            for(int i = 1; i < nums.length; i++)
                if(first != nums[i]) return false;
            return true;
        }

    } // End Class CochraneLibraryScraper

