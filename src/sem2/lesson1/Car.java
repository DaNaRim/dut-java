package sem2.lesson1;

public class Car {


    private String name;
    private String model;
    private boolean isSoled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isSoled(boolean b) {
        return isSoled;
    }

    public void setSoled(boolean soled) {
        isSoled = soled;
    }
}
