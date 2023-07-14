public class Test{
    public static void main(String[] args){
        long test1 = 65;
        long test2 = 35;
        long test3 = 15;
        int result1 = N1S.n1SFuncRecursive(test1);
        int result2 = N1S.n1SFuncRecursive(test2);
        int result3 = N1S.n1SFuncRecursive(test3);
        if(result1 == 2 && result2 == 3 && result3 == 4){
            System.out.println("Test Success");
        }else{
            System.out.println("Test failure: ");
            System.out.print("result1: " + result1 + "\n" +
                             "result2: " + result2 + "\n" +
                             "result3: " + result3 + "\n");
        }
        
    }
}
