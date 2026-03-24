import java.util.*;
class Solution{
public int longestSubarray(int[]nums,int limit){
Deque<Integer>maxD=new ArrayDeque<>();
Deque<Integer>minD=new ArrayDeque<>();
int l=0,res=0;
for(int r=0;r<nums.length;r++){
while(!maxD.isEmpty()&&nums[maxD.peekLast()]<nums[r])maxD.pollLast();
while(!minD.isEmpty()&&nums[minD.peekLast()]>nums[r])minD.pollLast();
maxD.offerLast(r);
minD.offerLast(r);
while(nums[maxD.peekFirst()]-nums[minD.peekFirst()]>limit){
if(maxD.peekFirst()==l)maxD.pollFirst();
if(minD.peekFirst()==l)minD.pollFirst();
l++;
}
res=Math.max(res,r-l+1);
}
return res;
}
}