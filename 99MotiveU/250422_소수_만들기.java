class Solution {
    public int solution(int[] nums) {
        int answer = -1; 
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    int sum = nums[i] + nums[j] + nums[k];
                    boolean isPrime = true;

                    if (sum < 2) {
                        isPrime = false;
                    } else {
                        for (int d = 2; d * d <= sum; d++) {
                            if (sum % d == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        answer++;
                    }
                }
            }
        }
        answer +=1;
        return answer; 
    }
}
