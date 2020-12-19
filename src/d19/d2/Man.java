package d19.d2;

public class Man {


    private long id;
    private String name;

    public static int skaitliukas;

    public Man() {

        this.id =(long) (Math.random() * Long.MAX_VALUE );
      skaitliukas++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getSkaitliukas() {
        return skaitliukas;
    }
}
