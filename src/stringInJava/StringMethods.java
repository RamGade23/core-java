package stringInJava;

public class StringMethods {
    public static void main(String[] args) {

        String a = "Newgen SoftTech";

        //toUpperCase() and toLowerCase() method
        System.out.println("LowerCase a: " + a.toLowerCase());
        System.out.println("UpperCase a: " + a.toUpperCase());

        String c = " Rohit Gaikwad ";
        System.out.println("c :" + c);

        //trim() method
        System.out.println("c with trim() :" + c.trim());

        //startsWith() and endsWith() method
        System.out.println("a startWith() : " + a.startsWith("Newgen"));
        System.out.println("c startWith() : " + c.startsWith(" R"));
        System.out.println("a endsWith() : " + a.endsWith("Tech"));
        System.out.println("c endsWith() : " + c.endsWith("wad "));

        //charAt() Method
        System.out.println("a.charAt(0) : " + a.charAt(0));
        System.out.println("a.charAt(5) : " + a.charAt(5));

        String d = "Nitin";
        //length() Method
        System.out.println("a.length() : " + a.length());
        System.out.println("d.length() : " + d.length());

        //valueOf() Method
        int e = 10;
        String f = String.valueOf(e);
        System.out.println("f : " + f);
        System.out.println("String.valueOf(10.10f) : " + String.valueOf(10.10f));
        String g = String.valueOf(199.99f);
        System.out.println("g : " + g);

        //replace() Method
        System.out.println("Newgen SofTech.replace() : " + "Newgen SofTech".replace("SofTech", "Software"));
        System.out.println("Java.replace() : " + "Java".replace("J", "M"));

        //concat() Method
        String h = "Rahul"; //Rahul
        String i = h.concat(" Shinde"); //Rahul Shinde
        String l = h.replace("R", "M");
        System.out.println("h : " + h + " i : " + i);
        System.out.println("l : " + l);

        //indexOf() Method
        //System.out.println("h.indexOf('h') : " + h.indexOf('h'));

        StringBuffer j = new StringBuffer("Rahul");
        StringBuffer k = j.append(" Shinde");
        System.out.println("j : " + j + " k : " + k);

        StringBuilder m = new StringBuilder("Rahul");
        System.out.println("m : " + m);

    }
}
