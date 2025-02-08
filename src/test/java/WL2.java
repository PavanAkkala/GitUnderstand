public class WL2 {

    public static void main(String[] args) {
        int num = 1;

        while(num<7) {

            System.out.println(num);

            if(num==4) {

                System.out.println("number is "+num);
                break;

            }

            num+= 1; //num = num+1; //num++;
        }
    }
}
