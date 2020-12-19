package D23.defoult.pvz;

public interface IB {

    double perimeter();
    default  void printName(){
        System.out.println("IB");
    }
}
