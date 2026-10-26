bool isPalindrome(int x) 
    {
        int rem=0;
        int rev=0;
        int p=x;
        if(p<0) return false;
        while(x!=0){
            rem=x%10;
            if(rev>INT_MAX/10 || rev<INT_MIN/10) return false;
            rev=rev*10+rem;
            x=x/10;
        }
        if(p==rev) return true;
        else return false;
    }