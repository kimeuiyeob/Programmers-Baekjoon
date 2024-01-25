import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        List<int[]> tempList = new ArrayList<>();
        
        for(int i = 0; i < data.length; i++) {
            
            int code = data[i][0];
            int date = data[i][1];
            int maximum = data[i][2];
            int remain = data[i][3];
            
            if(ext.equals("code")) {
                if(code < val_ext) {
                    int[] arr = {code,date,maximum,remain}; 
                    tempList.add(arr);
                }
            }else if(ext.equals("date")) {
                if(date < val_ext) {
                    int[] arr = {code,date,maximum,remain}; 
                    tempList.add(arr);
                }
            }else if(ext.equals("maximum")) {
                if(maximum < val_ext) {
                    int[] arr = {code,date,maximum,remain}; 
                    tempList.add(arr);
                }
            }else if(ext.equals("remain")) {
                if(remain < val_ext) {
                    int[] arr = {code,date,maximum,remain}; 
                    tempList.add(arr);
                }
            }
        }      
        
        Comparator<int[]> comparator = new Comparator<int[]>() {
            private int elementIndex = 0; 

            public Comparator<int[]> setElementIndex(int index) {
                this.elementIndex = index;
                return this;
            }

            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[elementIndex], o2[elementIndex]);
            }
        };

        if(sort_by.equals("code")) {
            Collections.sort(tempList, Comparator.comparingInt(arr -> arr[0]));
        }else if(sort_by.equals("date")) {
            Collections.sort(tempList, Comparator.comparingInt(arr -> arr[1]));
        }else if(sort_by.equals("maximum")) {
            Collections.sort(tempList, Comparator.comparingInt(arr -> arr[2]));
        }else if(sort_by.equals("remain")) {
            Collections.sort(tempList, Comparator.comparingInt(arr -> arr[3]));
        }
        
        int[][] answer = new int[tempList.size()][4]; 
        
        for(int i = 0; i < tempList.size(); i++) {
            int[] arry = tempList.get(i);
            answer[i] = arry;
        }
    
        return answer;
    }
}