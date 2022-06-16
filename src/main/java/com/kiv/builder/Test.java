package com.kiv.builder;

public class Test {
    public static void main(String[] args) {
        //Unreadable
        //new HttpClient("GET","http:/test.com",null,null,null,null);
        HttpClient.HttpClientBuilder httpClientBuilder = new HttpClient.HttpClientBuilder();
        HttpClient client = httpClientBuilder.method("POST").security("yo","pass").build();
        System.out.println(client.toString());

    }
}
