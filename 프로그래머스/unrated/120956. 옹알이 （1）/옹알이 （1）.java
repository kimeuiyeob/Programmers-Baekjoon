import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++) {
            if(babbling[i].contains("aya")) {
                babbling[i] = babbling[i].replaceAll("aya","1");
            }
            if(babbling[i].contains("ye")) {
                babbling[i] = babbling[i].replaceAll("ye","1");
            }
            if(babbling[i].contains("woo")) {
                babbling[i] = babbling[i].replaceAll("woo","1");
            }
            if(babbling[i].contains("ma")) {
                babbling[i] = babbling[i].replaceAll("ma","1");
            }
            babbling[i] = babbling[i].replaceAll("1","");
            if(babbling[i].equals("")) {
                answer++;
            }
        }           
    
        return answer;
    }
}