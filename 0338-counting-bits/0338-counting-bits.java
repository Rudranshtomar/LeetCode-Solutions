class Solution {

    public int countOne(int num) {
        int c=0;
        while (num>0) {
            c+=num%2;
            num=num/2;
        }
        return c;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = countOne(i);
        }
        return ans;
    }
}