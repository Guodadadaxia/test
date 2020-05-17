public class leixiefu {
    public static void main(String[] args) {

        String a = "BGI's \"Rea\"l-TIME Flu\"o\"rescent RT-PC2";
        System.out.println(a);
        a = a.replaceAll("'","\\\\'");
        System.out.println(a);
    }
}
