class Solution {
    public boolean isPalindrome(int x)
    {
        int original = x;
        
        int reversed=0;

        while(x>0){
            int lastdigit=x%10;
            reversed=reversed *10+lastdigit;
            x=x/10;
        }
        if(original==reversed){
            return true;
        }
        else{
            return false;
        }
    }
}