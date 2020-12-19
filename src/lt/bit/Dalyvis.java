package lt.bit;

public class Dalyvis implements IParticipantName {

        private String name;

    public Dalyvis(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return   name;
    }
}
