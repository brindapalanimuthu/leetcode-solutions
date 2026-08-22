You are given a positive integer n. Determine whether n is divisible by the sum of the following two values:

The digit sum of n (the sum of its digits).

The digit product of n (the product of its digits).

Return true if n is divisible by this sum; otherwise, return false.

 

Example 1:

Input: n = 99

Output: true

Explanation:

Since 99 is divisible by the sum (9 + 9 = 18) plus product (9 * 9 = 81) of its digits (total 99), the output is true.

Solution:

class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int org=n;
        int prod=1;
        while(n>0){
            int d=n%10;
            sum+=d;
            prod*=d;
            n/=10;
        }
        int div=sum+prod;
        return org%div==0;
    }
}