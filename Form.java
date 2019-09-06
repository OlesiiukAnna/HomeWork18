package home.Task_18;

public class Form {

    private String foo1;
    private String foo2;

    public Form() {
    }

    public Form(String foo1, String foo2) {
        this.foo1 = foo1;
        this.foo2 = foo2;
    }

    @Override
    public String toString() {
        return "{" +
                "foo1='" + foo1 + '\'' +
                ", foo2='" + foo2 + '\'' +
                '}';
    }
}
