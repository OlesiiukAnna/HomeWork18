package home.Task_18;

public class Json {

    private String foo1;
    private String foo2;

    public Json() {
    }

    public Json(String foo1, String foo2) {
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
