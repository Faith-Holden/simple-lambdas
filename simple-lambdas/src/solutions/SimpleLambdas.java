package solutions;

public class SimpleLambdas {
    public static final ArrayProcessor maxNum = doubleArray -> {
        double largestNum = 0;
        for (double v : doubleArray) {
            if (v >= largestNum) {
                largestNum = v;
            }
        }
        return largestNum;
    };
    public static final ArrayProcessor minNum = doubleArray ->{
        double smallestNum;
        smallestNum = doubleArray[0];
        for(int i=1; i<doubleArray.length; i++){
            if(doubleArray[i]<smallestNum){
                smallestNum = doubleArray[i];
            }
        }
        return smallestNum;
    };
    public static final ArrayProcessor sumArray = doubleArray ->{
        double sum = 0;
        for (double v : doubleArray){
            sum += v;
        }
        return sum;
    };
    public static final ArrayProcessor aveArray = doubleArray ->{
        return (sumArray.apply(doubleArray))/doubleArray.length;
    };
    public static ArrayProcessor counter (double value){
        return doubleArray->{
            int valueCounter = 0;
            for (double v : doubleArray) {
                if (v == value) {
                    valueCounter++;
                }
            }
            return valueCounter;
        };
    }
}
