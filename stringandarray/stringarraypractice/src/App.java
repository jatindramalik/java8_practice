public class App {
    public static void main(String[] args) throws Exception {
        String str = "The World is ours";
        String str2 = "the world is ours";
        System.out.println(str.length());
        System.out.println(str.indexOf('W'));
        System.out.println(str.indexOf("is"));
        System.out.println(str.charAt(6));
        System.out.println(str.indexOf('s', str.indexOf('s') + 1));

        System.out.println(str == str2);
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.substring(0, 9));

        int len = str.length();
        String rev = "";

        for(int i = len - 1;i > 0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        String mail = "jatin@gamil.com";

        mail = mail.replace("@", " ");
        System.out.println(mail);

        int num = 54321;
        int mun = 0;
        int r = 0;
        while(num > 0){
            r = num %10;
            num = num/10;
            mun = mun*10+r;
        }
        System.out.println(mun);

        int p = 151;
        int re = 0;
        int prev = 0;
        while(p>0){
            re = p %10;
            p = p/10;
            prev = prev*10+re;

        }
        System.out.println(prev);

        
        


    }
    


}
