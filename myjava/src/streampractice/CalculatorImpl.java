package streampractice;

interface Calculator{
    // void switchOn();
    // void sum (int input);

    int substract(int i1, int i2);

}



public class CalculatorImpl {

    public static void main(String[] args) {
        // Calculator calculator = ()->System.out.println("switch on");
        //  calculator.switchOn();

        // Calculator calculator = (input)->System.out.println("sum : " + input );
        // calculator.sum(125);

        Calculator calculator = (i1,i2)-> {
            if(i2 < i1){
                throw new RuntimeException("message");
            }else{
                return i2 - i1;
            }
        };
        int k = calculator.substract(47, 85);
        System.out.println(k);

    }
    
}
