package E01.Uzdavinys3;
//14 skaidres 1 uzdavinys
public class Main {

    public static void main(String[] args) {

        Saugykla<Integer> saugykla = new Saugykla<>();
        saugykla.add(100);
        saugykla.add(200);
        saugykla.add(300);
        saugykla.add(-50);
        saugykla.add(150);
        saugykla.add(400);

        System.out.println("TA PATI TVARKA: ");
        for (Integer i : saugykla.asc()) {
            System.out.println(i);
        }

        System.out.println("ATVIRKSTINE TVARKA: ");
        for (Integer i : saugykla.desc()) {
            System.out.println(i);
        }

        System.out.println("FILTRAS: tik teigiami");
        for (Integer i : saugykla.filter(x -> x > 0 )) {
            System.out.println(i);
        }


    }
}