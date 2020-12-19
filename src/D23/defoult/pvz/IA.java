package D23.defoult.pvz;

public interface IA {

        double area();
     default  void printName(){
         System.out.println("IA");
        }

}
