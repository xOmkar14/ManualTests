public class Day_1 {

    public static void changeName(String name){
        System.out.println(name);
    //To make name static
    }

    public static void changeAddress(String address,String contact){
        System.out.println(address);
        System.out.println("Mobile no :"+contact);
    //Can make 2 call outs in 1 string
    }

    public void changeDOB(String DOB){
        System.out.println(DOB);
    //To make DOB static callout
    }

    public static void main (String [] args) {

        Day_1 day_1 = new Day_1();
        changeName("Omkar");
        changeAddress("11 Priory Avenue, Wembley, HA02SB","07590574614");
        day_1.changeDOB("22-10-1989");
    // Dont have to use day_1 for all the callouts

        //System.out.println ("My contact number: 07590574614");
        //System.out.println ("DOB: 22/10/1989");

    }
}
