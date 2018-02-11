public class DemoC {

        //declare here variables int a and b and give values for int
        int a = 50;
        int b = 10;
        int ans;

        public static void main (String[] args) {
            DemoC democ = new DemoC();
            democ.addition();
            democ.subtraction();
            democ.multiplication();
            democ.division();
            //make it into a object in main method
        }

        public void addition(){
            ans = a + b;
            System.out.println(ans);
            //for addition
        }

        public void subtraction(){
            ans = a - b;
            System.out.println(ans);
            //for subtraction
        }

        public void multiplication(){
            ans = a * b;
            System.out.println(ans);
            //for multiplication
        }

        public void division(){
            ans = a / b;
            System.out.println(ans);
            //for division
        }
    }
