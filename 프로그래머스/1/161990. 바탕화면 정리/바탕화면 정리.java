import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        
        List<int[]> 바탕화면 = new ArrayList<>();
        
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                char[] txt =  wallpaper[i].toCharArray();
                if(txt[j] == '#') {
                    바탕화면.add(new int[]{i,j});
                }
            }
        }
        
        int minX1 = Integer.MAX_VALUE;
        int minX2 = Integer.MAX_VALUE;     
        int maxY1 = Integer.MIN_VALUE;
        int maxY2 = Integer.MIN_VALUE;
        
        for(int[] i : 바탕화면) {
            minX1 = Math.min(minX1,i[0]);
            minX2 = Math.min(minX2,i[1]);
            
            maxY1 = Math.max(maxY1,i[0]);
            maxY2 = Math.max(maxY2,i[1]);
        }
        
        return new int[]{minX1,minX2,maxY1 + 1,maxY2 + 1};
    }
}