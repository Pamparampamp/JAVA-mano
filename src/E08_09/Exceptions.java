package E08_09;

public class Exceptions {

    public static void main(String[] args) {
        try {
            A1 a1 = new A1();
            System.out.println("1. " + a1.calc(10, 20));
            System.out.println("3. " + a1.calc(20, -20));
            System.out.println("2. " + a1.calc(10, -10));

            System.out.println("Pabaiga ");

        } catch (IllegalArgumentException e) {
            System.err.println("Klaida: " + e.getMessage());
//        }catch (ArithmeticException | ManoRuntimeException e){
//            System.err.println("Klaida: " + e.getMessage());
//        } catch (ArithmeticException e) {
//            System.err.println("Klaida: " + e.getMessage());
        }catch (RuntimeException e) {
            System.err.println("Klaida: " + e.getMessage());
        }catch (ManoException e){
            System.err.println("  Mano Klaida: " + e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("finally ");
    }
        System.out.println("*** Tikra Pabaiga ");
    }

}

class  A1 {

    int methodA(int a){
        if ( a == 0){
            throw new ManoRuntimeException("nujo, dalyba is nulio - ne ne ne");
        }
     return  100/a ;
    }
    int calc(int a, int b) throws ManoException{
        if (a == -b){
        throw  new ManoException("a ir b negali buti priesingi");
        }

        if (b == -10){
            throw new IllegalArgumentException("b == -10");

        }
        int c = a + b;
        int d = methodA(c);
        return d;
    }

    int calc2(int a, int b){
        int c = a * b;
        int d = methodA(c);
        return d;
    }

}

class ManoRuntimeException extends RuntimeException{
    public ManoRuntimeException(String message) {
        super(message);
    }
}

class ManoException extends Exception{
    public ManoException(String message) {
        super(message);
    }

    public ManoException(String message, Throwable cause) {
        super(message, cause);
    }
}