package randomProblem;

public class maxEelementSubArray
{
    public static void main(String[] args){

                int[] arr={1,1,3,5,2,1,4,1,3,6,2,0,8};
                // int[] arr={100,102,3,5,2,1,4,1,3,6,2,0,8};
                int target=8;
                int maxW=0;
                int left=0;
                int currS=0;

                for(int right=0;right<arr.length;right++){
                    currS=currS+arr[right];

                    while(currS>target){
                        currS=currS-arr[left];
                        left++;
                    }
                    if(currS==target){
                        int cW=right-left+1;
                        if(cW>maxW){
                            maxW=cW;
                        }
                    }

                }

                System.out.println(maxW);
    }


}
