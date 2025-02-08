public class WhileLoopWithContinue {

    public static void main(String[] args) {

        int num = 2;

        while (num<7) {

            if(num==6) {
                continue;
            }

            num++;
            System.out.println(num);
        }
        System.out.println("Done");
    }
}
