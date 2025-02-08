public class EvenFor {

    public static void main(String[] args) {
        int i = 0;

        for(i=0; i<=10; i++) {

            if(i%2==1) { //chge 1 to 0 for odd numbers

                continue;


            }

            System.out.println(i);
        }
    }

}
