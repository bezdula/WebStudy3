package pac;

public class Class1 {
    private String value;

    public Class1() {
        System.out.println("Class1 instance created");
    }

    public void setValue(String value) {
        this.value = value;
        System.out.println("Value is set to " + value);
    }

    public String getValue() {
        return value;
    }
}
