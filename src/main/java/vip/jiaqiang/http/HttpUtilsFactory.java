package vip.jiaqiang.http;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpUtilsFactory {

    CloseableHttpClient httpclient = HttpClients.createDefault();


    public HttpGet getFactory(){
        return new HttpGet("http://httpbin.org/");
    }

    public HttpPost postFactory(){
        return new HttpPost("http://httpbin.org/");
    }

}
