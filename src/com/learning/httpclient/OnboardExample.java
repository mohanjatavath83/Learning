package com.learning.httpclient;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class OnboardExample {


    public static void main(String[] args) throws Exception {



        HttpClient httpClient = HttpClientBuilder.create().build();
       HttpPost request = new HttpPost("http://localhost:9002/rrlmpmockintegration/postTo/queue?queuename=RIL.IND.SMARTMERCHANT.HYBRIS.SENDER.QUEUE");

        StringEntity entity = new StringEntity(Util.getOnboardData(), ContentType.APPLICATION_FORM_URLENCODED);
        request.setEntity(entity);

        HttpResponse response = httpClient.execute(request);
        System.out.println(response.getStatusLine().getStatusCode());



    }


}
