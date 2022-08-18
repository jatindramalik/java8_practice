package lambdaexp;

public class CalculatorImpl {

    public static void main(String[] args) {
        // Calculator calculator = ()->System.out.println("Switch ON");
        // calculator.switchOn();

        // Calculator calculator = (t)-> System.out.println("Print "+ t);
        // calculator.sum(125);

        Calculator calculator = (i1,i2)-> {
            if(i2<i1){
                throw new RuntimeException("message");
            }else{
                return i2 -i1;
            }
        };

        System.out.println(calculator.substract(47, 25));

    }
    
    
}

interface Calculator{
    // void switchOn();
    // void sum(int input);
    int substract(int i1,int i2);
}
