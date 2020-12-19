package D23.defoult.pvz;

public class C implements IA {//}, IB {


    public double area() {
        return 100;
    }


    public double perimeter() {
        return 55;
    }

    @Override
    public void printName() {
        System.out.println("C");

    }

    //metodas rasomas taip
    public void metodasKurinisNiekoNegrazina(){
        //
        System.out.println("Cia metodas metodasKurinisNiekoNegrazina");
        //
       if (Math.random() < 0.5) return;
        //
        //
        System.out.println("Cia  to metodo pabaiga");
        //
        return;
    }
    public int metodasKurinisGrazinaInteger(){
        //
        System.out.println("Cia metodas metodasKurinisGrazinaInteger");
        //
        if (Math.random() < 0.5) return 1;
        //
        //
        System.out.println("Cia metodasKurinisGrazinaInteger  to metodo pabaiga");
        //
        return 2;
    }
}


class Main {
    public static void main(String[] args) {
        C c = new C();
        c.printName();
//kvieciamas metodas taip
        c.metodasKurinisNiekoNegrazina();

        c.metodasKurinisGrazinaInteger();
        int x = c.metodasKurinisGrazinaInteger();
        System.out.println(" Pabaiga");
    }
}