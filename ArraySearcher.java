public class ArraySearcher{

    public static int linearSearch(int[] inputArray, int a){
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] == a)return i;
        }
        return -1;
    }

    public static int binarySearch(int[] inputArray, int a){
        //lb is the lower bound , ub is the upper bound and c is the centre
        int lb = 0,ub = inputArray.length-1,c;
        while(lb<=ub){
            c = (lb+ub)/2;
            if(inputArray[c] > a) lb = c - 1;
            if(a > inputArray[c]) ub = c + 1;
            if(inputArray[c] == a)return c;
        }
        return -1;
    }

}