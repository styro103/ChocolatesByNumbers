/*
	Solution to Codility's Chocolates By Numbers
	Run Time O(N+M)
*/

class Solution 
{
    public int solution(int N, int M) 
    {
        int ate = 1; //Number of Chocolates Eaten, Chocolate 0 Always Eaten First
        
        for (int X=M%N; X!=0; X=(X+M)%N) //Loop Till Back At Chocolate 0
            ate++; //Increment Number of Chocolates Eaten
        
        return ate; //Return Number of Chocolates Eaten
    }
}