import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        List<String> 신고당한리스트 = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();       
        Set<String> 리포트중복제거 = new HashSet<>();

        List<String[]> report중복제거 = new ArrayList<>();

        for(int i = 0; i < report.length; i++) {
            리포트중복제거.add(report[i]);
        }

        Iterator<String> iter =  리포트중복제거.iterator();
        while(iter.hasNext()) {
            String str  = iter.next();
            String[] 신고당한사람 = str.split(" ");
            신고당한리스트.add(신고당한사람[1]);
            report중복제거.add(신고당한사람);
        }

        for(int i = 0; i < 신고당한리스트.size(); i++) {        
            String name = 신고당한리스트.get(i);
            map.put(name, map.getOrDefault(name,0) +1);
        }

        List<String> 정지당한사람 = new ArrayList<>(); //게시판 정지된 사람

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() >= k) {
                정지당한사람.add(entry.getKey());
            }
        }

        int[] answer = new int[id_list.length];

        for(int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            int count =0;
            for(int j = 0; j < report중복제거.size(); j++) {

                String 신고한사람 = report중복제거.get(j)[0];  
                String 신고당한사람  = report중복제거.get(j)[1];         

                if(name.equals(신고한사람)) {
                    for(int m = 0; m < 정지당한사람.size(); m++) {
                        if(신고당한사람.equals(정지당한사람.get(m))) {
                            count++;
                        }

                    }
                }
            }
            answer[i] = count;
        }    

        return answer;
    }
}