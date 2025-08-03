class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; 
		int n = 0;
		
		for (int i = 0; i < commands.length; i++) {
			int k = 0;
                                    
			int[] list = new int[commands[i][1] - commands[i][0] + 1]; 
                                     
			for (int j = commands[i][0]; j <= commands[i][1]; j++) { 
				list[k++] = array[j - 1]; 
			}
            
            
			int temp = 0;
		    for (int a = 0; a < list.length; a++) {
			    for (int b = 0; b < list.length - 1- a; b++) {
				    if (list[b] > list[b + 1]) {
					    temp = list[b];
					    list[b] = list[b + 1];
					    list[b + 1] = temp;
				    }
			    }
		    }
            
			answer[n++] = list[commands[i][2] - 1]; 
		}
		return answer;
    }
}