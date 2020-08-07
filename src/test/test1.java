package test;

public class test1 {
	public static void main(String[] args) {
		Solution a =new Solution();
		int[] numss= {3,2,4};
		int[] b =a.twoSum(numss,6);
		for(int temp:b) {
			System.out.println(temp);
		}
	}
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] Sumdown=new int[2];
        f:for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int Sum =nums[i] +nums[j];
                if(Sum==target){
                    Sumdown[0]=i;
                    Sumdown[1]=j;
                    break f;
                }
            }
//         if(Sumdown.length==2){
//             break;
//         }
        }
        return Sumdown; 
    }
}