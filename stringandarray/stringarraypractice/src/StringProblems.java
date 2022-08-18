public class StringProblems {

    public static void main(String[] args) {
        int num = 151;
        int r = 0;
        int rev = 0;
        while(num>0){
            r = num%10;
            num = num/10;
            rev = rev *10+r;
        }
        System.out.println(rev);

        int fno = 0;
        int sno = 1;
        int sum = fno+sno;
        System.out.println(fno);
        System.out.println(sno);
        while(sum < 10){
            System.out.println(sum);
            fno = sno;
            sno = sum;
            sum = fno+ sno;
        }


    }

}
