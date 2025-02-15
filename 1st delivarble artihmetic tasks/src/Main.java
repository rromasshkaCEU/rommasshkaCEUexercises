import java.util.ArrayList;

public class Main {
    public static void subNumber(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of " + n + " is " + sum);
    }

    public static void factorialNumber(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + n + " is " + factorial);
    }

    public static void powerNumber(int n, int exponent) {
        int power = 1;
        for (int i = 0; i < exponent; i++) {
            power *= n;
        }
        System.out.println("The " + exponent + "th power of " + n + " is " + power);
    }

    public static void sumListNumber(ArrayList<Integer> n) {
        int sum = 0;
        for (int num : n) {
            sum += num;
        }
        System.out.println("The sum of the elements in the list " + n + " is " + sum);
    }

    public static void arithmeticMean(ArrayList<Integer> n) {
        int sum = 0;
        for (int num : n) {
            sum += num;
        }
        int mean = sum / n.size();
        System.out.println("The arithmetic mean of the list " + n + " is " + mean);
    }

    public static void standardDeviation(ArrayList<Integer> n) {
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
        System.out.println("The standard deviation of the list " + n + " is " + SD2);
    }

    public static void sumEven(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("The even sum of " + n + " is " + sum);
    }

    public static void sumEvent(ArrayList<Integer> n) {
        int sum = 0;
        for (int num : n) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("The even sum of the list " + n + " is " + sum);
    }

    public static ArrayList<Integer> getEvenList(ArrayList<Integer> n) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int num : n) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        System.out.println("The even numbers in the list " + n + " are " + evenList);
        return evenList;
    }

    public static ArrayList<Integer> evensList(int n) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int i = 2; i <= n; i += 2) {
            evens.add(i);
        }
        System.out.println("The list of the first even numbers up to " + n + " is " + evens);
        return evens;
    }

    public static int computeDotProduct(ArrayList<Integer> a, ArrayList<Integer> b) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i) * b.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(11);

        subNumber(5);
        factorialNumber(5);
        powerNumber(2, 3);
        sumListNumber(numbers);
        arithmeticMean(numbers);
        standardDeviation(numbers);
        sumEven(10);
        sumEvent(numbers);
        getEvenList(numbers);
        evensList(10);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1); list1.add(2); list1.add(3);
        list2.add(2); list2.add(4); list2.add(6);

        System.out.println("Dot Product: " + computeDotProduct(list1, list2));
    }
}