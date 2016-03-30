/*
	Solution to Codility's Chocolates By Numbers
	Run Time O(log(N+M))
*/

class Solution 
{
    public int solution(int N, int M) 
        {return (int) (lcm(N, M)/M);} //Return LCM of Numbers Divided By M
    
    long lcm (int a, int b) //Get Least Common Multiple of Numbers
    {
        long A = (long) a; //Convert to Long to Handle Bigger Numbers
        long B = (long) b; //Convert to Long to Handle Bigger Numbers
        
        return (A*B/gcd(A, B, 1)); //LCM is Factor of Numbers Divided By Their GCD
    }
    
    long gcd(long a, long b, long res) //Get Greatest Common Denominator Using Binary Euclidean Algorithm
    {   
        if (a==b) return res*a; //a=b, a Now Equals b, Product of res and a is GCD
        else if ((a&1)==0 && (b&1)==0) return gcd(a>>1, b>>1, res<<1); //a and b are Even, Get Next CD By Halving Them, and Doubling res 
        else if ((a&1)==0) return gcd(a>>1, b, res); //Only a is Even, Get Next CD by Halving a
        else if ((b&1)==0) return gcd(a, b>>1, res); //Only b is Even, Get Next CD by Halving b
        else if (a>b) return gcd(a-b, b, res); //a is Greater, Get Next CD by Subtraction
        else return gcd(a, b-a, res); //b is Greater, Get Next CD by Subtraction
    }
}