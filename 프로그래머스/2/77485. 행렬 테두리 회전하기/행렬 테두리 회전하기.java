import java.util.*;

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {

        int[][] intArr = new int[rows][columns];
        int cnt = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                intArr[i][j] = cnt;
                cnt++;
            }
        }

        List<Integer> 최소값 = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int[] oneQuery = queries[i];
            int x1 = oneQuery[0] - 1;
            int y1 = oneQuery[1] - 1;
            int x2 = oneQuery[2] - 1;
            int y2 = oneQuery[3] - 1;

            int x거리 = x2 - x1;
            int y거리 = y2 - y1;

            int minNum = Integer.MAX_VALUE;

            int saveRight = intArr[x1][y1 + y거리];
            for (int j = y거리; j > 0; j--) {
                intArr[x1][y1 + j] = intArr[x1][y1 + j - 1];
                minNum = Math.min(minNum, intArr[x1][y1 + j - 1]);
            }

            int saveDown = intArr[x1 + x거리][y1 + y거리];
            for (int j = x거리; j > 0; j--) {
                intArr[x1 + j][y1 + y거리] = intArr[x1 + j - 1][y1 + y거리];
                minNum = Math.min(minNum, intArr[x1 + j - 1][y1 + y거리]);
                if (j == 1) {
                    intArr[x1 + 1][y1 + y거리] = saveRight;
                    minNum = Math.min(minNum, saveRight);
                }
            }

            int saveLeft = intArr[x1 + x거리][y1];
            for (int j = y거리; j > 0; j--) {
                intArr[x1 + x거리][y1 + y거리 - j] = intArr[x1 + x거리][y1 + y거리 - j + 1];
                minNum = Math.min(minNum, intArr[x1 + x거리][y1 + y거리 - j + 1]);
                if (j == 1) {
                    intArr[x1 + x거리][y1 + y거리 - 1] = saveDown;
                    minNum = Math.min(minNum, saveDown);
                }
            }

            for (int j = x거리; j > 0; j--) {
                intArr[x1 + x거리 - j][y1] = intArr[x1 + x거리 - j + 1][y1];
                minNum = Math.min(minNum, intArr[x1 + x거리 - j + 1][y1]);
                if (j == 1) {
                    intArr[x1 + x거리 - 1][y1] = saveLeft;
                    minNum = Math.min(minNum, saveLeft);
                }
            }

            최소값.add(minNum);
        }

        return 최소값.stream().mapToInt(i -> i).toArray();
    }
}