package home.Task_18;

public class PostmanResponse {
    private Args args;
    private String data;
    private ResponseFiles files;
    private Form form;
    private Headers headers;
    private Json json;
    private String url;

    public PostmanResponse() {
    }

    public PostmanResponse(Args args, String data, ResponseFiles files, Form form, Headers headers, Json json, String url) {
        this.args = args;
        this.data = data;
        this.files = files;
        this.form = form;
        this.headers = headers;
        this.json = json;
        this.url = url;
    }

    @Override
    public String toString() {
        return "PostmanResponse{" + "\n" +
                "args=" + args + "\n" +
                "data='" + data + '\'' + "\n" +
                "files=" + files + "\n" +
                "form=" + form + "\n" +
                "headers=" + headers + "\n" +
                "json=" + json + "\n" +
                "url='" + url + '\'' + "\n" +
                '}';
    }
}
