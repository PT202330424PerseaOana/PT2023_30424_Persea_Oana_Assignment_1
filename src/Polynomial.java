import java.util.*;

public class Polynomial {
    static Map<Integer, List<Integer>> polynomials;

    public Polynomial(){
        polynomials = new HashMap<>();
    }

    public static void addInMap(Map<Integer, List<Integer>> polynomials, int coeff, int exp, int round){

        if(polynomials.containsKey(exp)) {
            if(round==1){
                List<Integer> retrievedList = polynomials.get(exp);
                int lastIndex = retrievedList.size() - 1;
                int aux=retrievedList.get(lastIndex);
                aux=aux+coeff;
                retrievedList.set(lastIndex, aux);

            }
            else {
                if(polynomials.get(exp).size()>1) {

                    List<Integer> retrievedList = polynomials.get(exp);
                    int lastIndex = retrievedList.size() - 1;
                    int aux=retrievedList.get(lastIndex);
                    aux=aux+coeff;
                    retrievedList.set(lastIndex, aux);

                }
                else {
                    polynomials.get(exp).add(coeff);
                }
            }


        }
        else {
            List<Integer> term = new ArrayList<>();

            term.add(coeff);
            polynomials.put(exp,term);

        }

    }

//    public void inputPolynomial(Map<Integer, List<Integer>> coefficients) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Enter the power of the next term (or -1 to finish): ");
//            int power = scanner.nextInt();
//
//            if (power == -1) {
//                break;
//            }
//
//            System.out.print("Enter the coefficient of the term: ");
//            int coefficient = scanner.nextInt();
//
//            addInMap(polynomials, power, coefficient);
//        }
    }



