

public class Start {
    public static void main(String[] args) {

        //przepraszam za bałagan, kod ten ma przeznaczenei eksperymentalne
        String one = "One";
        String two = "Two";
        String three = new String("Two");


        System.out.println(one);

        System.out.println("Dlugosc lancucha: " + one.length());

        one = one.replace('e','c');

        one = one.concat("e")
                 .concat("Upon")
                 .concat("aTime");

        System.out.println("Lancuch po zmianie i dodaniu znakow: " + one);


        //contains
        System.out.println("Czy klucz zawiera litere 'o': " + three.contains("o"));


        // toLowerCase
        System.out.println(one.toLowerCase());

        //toCharArray
        char[] ch1 = one.toCharArray();

        for (int i = 0; i < ch1.length; i ++) {
            System.out.print(ch1[i] + " ");

        }

        //substring
        String s1;
        s1 = one.substring(4,8);

        System.out.println();
        System.out.println(s1);


        //indexOf
        System.out.println(one.indexOf('a'));

        //concat
        String concatTest;
        concatTest = one.concat(two);
        System.out.println(concatTest);


        //StringBuilder

        StringBuilder sb = new StringBuilder("Hello beautiful world!");
        sb.insert(sb.length(),"Foo");
        System.out.println(sb);

        sb.replace(2,5,"WSTAWKA HEJ!");
        System.out.println(sb);


        //equals

        String a1 = "Hello World";
        String a2 = "Hemlo World";
        String a3 = "Hello World";

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));



    }
}