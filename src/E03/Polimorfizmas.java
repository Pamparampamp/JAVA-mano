package E03;

public class Polimorfizmas {

    public static void main(String[] args) {

             TevineKlase t1;
             t1 = new TevineKlase();   System.out.println("m1 = " + t1.m1() + ", f = " + t1.f);  // 30, f =  10
             t1 = new VaikineKlase1(); System.out.println("m1 = " + t1.m1() + ", f = " + t1.f);  // 31,  f =  10
             t1 = new VaikineKlase2(); System.out.println("m1 = " + t1.m1() + ", f = " + t1.f);  // -9,  f = 10
        VaikineKlase2 v2 = new VaikineKlase2(); System.out.println("m1 = " + v2.m1() + ", f = " + v2.f);  // -9, f = 12
    }

}
//jei neranda vaikinej klasej tokiu reiksmiu ar metodu ima is tevines klases
    class TevineKlase {
            public int f = 10;
            public int m1() { return  m2() + m3() ; }
            public int m2() { return 10; }
            public  int m3(){ return 20; }
    }

    class VaikineKlase1 extends TevineKlase {
        public int  f = 11;
        //public int m1() { return  m2() + m3() ; }
        public int  m2()     { return 11; }
        //public  int m3(){ return 20; }
    }
    class VaikineKlase2 extends VaikineKlase1 {
        public int f = 12;
        public int m1() { return  m2() - m3() ; }
        //public int m2()     { return 11; }
        //public  int m3(){ return 20; }
    }