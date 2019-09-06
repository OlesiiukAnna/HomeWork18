package home.Task_18;

import com.google.gson.Gson;

/*
Послать POST запрос на https://postman-echo.com/post где в BODY передать foo1=bar1&foo2=bar2 в формате x-www-form-urlencoded
Ответ распарсить и вывести.
 */
public class Task_18_1 {

    public static void main(String[] args) {
        String url = "https://postman-echo.com/post";
        String request = "foo1=bar1&foo2=bar2";

        String json = HttpUtil.sendRequest(url, null, request);

        Gson gson = new Gson();
        PostmanResponse response = gson.fromJson(json, PostmanResponse.class);
        System.out.println(response);
    }
}
