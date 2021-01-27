package com.lipan;

public class IntegerTest {

    private final static double dgree = Math.PI / 180;
    public static void main(String[] args) {
        Integer a1 = 128;
        Integer b1 = 128;

        System.out.println(a1 == b1);

        String s1 = "1111111";
        String s2 = "1111111";
        System.out.println(s1 == s2);

        System.out.println(Math.atan(Math.toRadians(180)));

        System.out.println(Math.toRadians(360));

        System.out.println("45度的正切值：" + Math.tan(Math.toRadians(45)));
        System.out.println("30度的正弦值：" + Math.toRadians(30));

        System.out.println(1.0471976f / dgree);

        System.out.println("45度的正切值：" + Math.tan(Math.toRadians(1.0471976 / dgree)));

        System.out.println("1.0471976的反正切值：" + Math.tan(1.0471976));



    }

}
