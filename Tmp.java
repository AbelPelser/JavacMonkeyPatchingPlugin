package org.banana.javacplugin;

public class Tmp {
    private static int test(String i) {
        i.haha = 7;
        i.hihi = i.haha;
        int x = i.hihi;
        return x;
//        i.x = 6;
//        i.doSomething();
//        i.t = i.doAnotherThing();
//        boolean b = Optional.of(i)
//                .map(Tmp::testRef)
//                .orElse(true);
    }

    public static void main(String[] args) {
        System.out.println("Hello world! " + test("sss"));
    }
}