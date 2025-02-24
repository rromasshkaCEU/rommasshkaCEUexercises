import java.util.*;
import java.io.*;


public class Main{

    public static int Sum(int n){
        if (n == 0){
            return 0;
        }
        return n + Sum(n-1);
    }
    public static int Factorial(int n){
        if (n == 0){
            return 0;
        }
        return n*Factorial(n-1)
    }
    public static int Power(int n, int a){
        if (n==1){
            return a;
        }
        return n*Power(a,n-1);
    }
    public static int SumList(int [] Array, int index){
        if (index == Array.length -1 ){
            return Array[index];
        }
        return Array[index] + SumList(Array, index + 1);
    }
    public static int Mean(int [] Array, int index){
        if (index == Array.length -1){
            return Array[index]
        }
        return Array[index]/ Mean(Array.length);
    }
    public static int StandardDeviation(int n, Mean){
        if (n == 1){
            return n;
        }
        return Math.sqrt()/(n-1);
        int sum = 0;
        for (int num : n) {
            sum += num;
        }
        double mean = (double) sum / n.size();

        double SD1 = 0;
        for (int num : n) {
            SD1 += Math.pow(num - mean, 2);
        }
        double SD2 = Math.sqrt(SD1 / n.size());
    }
}