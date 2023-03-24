import java.util.*;

public class Main extends Polynomial{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        polynomials = new HashMap<>();
        System.out.println("First: ");

        while (true) {
            System.out.print("Enter the power of the next term (or -1 to enter second polynomial): ");
            int power = scanner.nextInt();

            if (power == -1) {
                break;
            }

            System.out.print("Enter the coefficient of the term: ");
            int coefficient = scanner.nextInt();
            if (coefficient != 0) {
                addInMap(polynomials, coefficient, power, 1);
            }
        }

        System.out.println("Second: ");

        while (true) {
            System.out.print("Enter the power of the next term (or -1 to finish): ");
            int power = scanner.nextInt();

            if (power == -1) {
                break;
            }

            System.out.print("Enter the coefficient of the term: ");
            int coefficient = scanner.nextInt();

            if (coefficient != 0) {
                addInMap(polynomials, coefficient, power, 2);
            }
        }

        TreeMap<Integer, List<Integer>> sortedPowers = new TreeMap<>(polynomials);
        NavigableMap<Integer, List<Integer>> navigableMap = new TreeMap<>(polynomials).descendingMap();

        for (Map.Entry<Integer, List<Integer>> entry : sortedPowers.entrySet()) {
            Integer key = entry.getKey();
            List<Integer> value = entry.getValue();

            // print the key
            System.out.print(key + ": ");

            // print the values at the key
            for (Integer num : value) {
                System.out.print(num + " ");
            }

            // print a new line for each key
            System.out.println();
        }
//            int sum=0;
//            System.out.println(sortedPowers.lastKey());
//            System.out.println(sum);
//       Collections.reverse((List<Integer>) na);

//        for (Integer index = sortedPowers.size()-1; index >=0; index--) {
//
//                sum = 0;
//                addPolynomials(sortedPowers.get(index),sum);
//                System.out.print(sum + "x^" + sortedPowers.get(index));
////                System.out.println("x^");
////                System.out.println(sortedPowers.get(index));
//
//            }


        Integer iteration=1;
//        for (Map.Entry<Integer, List<Integer>> entry : navigableMap.entrySet()) {
//
//            Integer key = entry.getKey();
//            List<Integer> list = entry.getValue();
//            int sum = 0;
//            for (int num : list) {
//                sum += num;
//            }
//            if(sum!=0) {
//                if(sum>0 && iteration!=1) {
//                    System.out.print("+");
//                }
//                if(sum!=1) {
//                    System.out.print(sum + "x^" + key);
//                }
//            }
//            iteration++;
//        }
        iteration=1;
        for (Map.Entry<Integer, List<Integer>> entry : navigableMap.entrySet()) {

            Integer key = entry.getKey();
            List<Integer> list = entry.getValue();
            int sum = 0;
            sum= list.get(0) - list.get(1);

//            for (int num : list) {
//                sum += num;
//            }
//            System.out.println(sum);
            if(sum!=0) {
                if (sum > 0) {
                    System.out.print("+");
//                } else {
//                    if (sum < 0 && iteration != 1) {
//                        System.out.print("-");
//                    }
                }
                    if (sum != 1) {
                        System.out.print(sum + "x^" + key);
                    } else {
                        System.out.print("x^" + key);
                    }
                }

            iteration++;
        }
        }


    public static void addPolynomials(List<Integer> sortedPowers, int sum) {

        for (int i = sortedPowers.size() - 1; i >= 0; i--) {
            sum = sum + sortedPowers.get(i);
        }

    }

    public static void subtractPolynomials(List<Integer> sortedPowers, int sum) {

        sum=sortedPowers.get(0)-sortedPowers.get(1);

    }
}