package home.Task_18;

import com.google.gson.annotations.SerializedName;

public class Headers {

    @SerializedName("x-forwarded-proto")
    private String xForwardedProto;

    @SerializedName("host")
    private String host;

    @SerializedName("content-length")
    private String contentLength;

    @SerializedName("accept")
    private String accept;

    @SerializedName("content-type")
    private String contentType;

    @SerializedName("user-agent")
    private String userAgent;

    @SerializedName("x-forwarded-port")
    private String xForwardedPort;

    public Headers() {
    }

    public Headers(String xForwardedProto, String host, String contentLength, String accept, String contentType, String userAgent, String xForwardedPort) {
        this.xForwardedProto = xForwardedProto;
        this.host = host;
        this.contentLength = contentLength;
        this.accept = accept;
        this.contentType = contentType;
        this.userAgent = userAgent;
        this.xForwardedPort = xForwardedPort;
    }

    @Override
    public String toString() {
        return "{" + "\n" +
                "x-forwarded-proto='" + xForwardedProto + '\'' + "\n" +
                "host='" + host + '\'' + "\n" +
                "content-length='" + contentLength + '\'' + "\n" +
                "accept='" + accept + '\'' + "\n" +
                "content-type='" + contentType + '\'' + "\n" +
                "user-agent='" + userAgent + '\'' + "\n" +
                "x-forwarded-port='" + xForwardedPort + '\'' + "\n" +
                '}';
    }
}
