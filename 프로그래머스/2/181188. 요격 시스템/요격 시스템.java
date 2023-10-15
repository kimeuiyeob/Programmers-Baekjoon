import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        Arrays.sort(targets, (o1, o2) -> {
            int compareVal = Integer.compare(o1[1], o2[1]);

            if (compareVal == 0) {
                return Integer.compare(o1[0], o2[0]);
            }
            return compareVal;
        });

        int end = targets[0][1];
        answer++; 

        for (int[] target : targets) {
            if (target[0] >= end) {
                end = target[1];
                answer++; 
            }
        }

        return answer;
    }
}