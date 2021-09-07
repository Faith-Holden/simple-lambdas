package solutions;

public class Main {
    public static void main(String[]args){
        //tests the solution for 4.5
        double[] testArray = {0,3,3,1,3,32,-4,36,3,3,-127,100};
        System.out.println(SimpleLambdas.maxNum.apply(testArray));
        System.out.println(SimpleLambdas.minNum.apply(testArray));
        System.out.println(SimpleLambdas.sumArray.apply(testArray));
        System.out.println(SimpleLambdas.aveArray.apply(testArray));
        ArrayProcessor test = SimpleLambdas.counter(3);
        System.out.println(test.apply(testArray));
    }
}
