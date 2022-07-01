

public class Start {
    public static void main(String[] args) {

        String one = "One";
        String three = new String("Two");


        System.out.println(one);
        int length;
        length = one.length();
        System.out.println(length);

        one = one.replace('e','c');

        one = one.concat("e")
                 .concat("Upon")
                 .concat("aTime");

        System.out.println(one);


        boolean a = three.contains("o");
        System.out.println(a);




    }
}