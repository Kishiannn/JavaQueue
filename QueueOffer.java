package hackerRank;

import java.util.LinkedList;
import java.util.Queue;



public class Solution {

    public static void main(String[] args) {
        Queue<String> myHobbies = new LinkedList<String>();
        
        myHobbies.offer("watch");
        myHobbies.offer("Guitar");
        myHobbies.offer("Drawing");
        
        
        System.out.println(myHobbies);
    }
}
