package HomeWork_1.BoxFruit;

public class BoxFruit<T extends Fruit>{

    private final Object object;

    public BoxFruit(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
}
