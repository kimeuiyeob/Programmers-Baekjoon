import java.util.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        
        int x = h; 
        int y = w; 

        String color = board[x][y];
        int cnt = 0;

        int[] dx = {-1, 1, 0, 0}; 
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            try {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (board[nx][ny].equals(color)) {
                    cnt++;
                }       
            } catch (Exception e) {
                ;
            }
        }
        
        return cnt; 
    }
}