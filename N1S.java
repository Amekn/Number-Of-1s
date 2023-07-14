public class N1S{
    private N1S(){};
    
    public static int n1SFuncRecursive(long N){
        //Base case: when N is 0.
        if(N == 0) return 0;
        //Case 1: N is even.
        int result = n1SFuncRecursive(N/2);
        //Case 2: N is old.
        if(N%2 == 1) result++;
        //Return result
        return result;
    }
}
