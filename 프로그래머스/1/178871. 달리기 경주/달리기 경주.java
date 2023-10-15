import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new LinkedHashMap<>();

        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }

        for (String c : callings) {
            int index = playerMap.get(c);

            String beforePlayer = players[index - 1];
            players[index - 1] = c;
            players[index] = beforePlayer;

            playerMap.put(c, index - 1);
            playerMap.put(beforePlayer, index);
        }

        return players;

    }
}
