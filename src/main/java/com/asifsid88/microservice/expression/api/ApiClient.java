package com.asifsid88.microservice.expression.api;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.json.JSONObject;

public final class ApiClient {
    public static long multiply(int a, int b) {
        String query = "http://localhost:8080/microservice/multiply/v1/" + a + "/" + b;

        long result = -1;
        try {
            HttpResponse<JsonNode> response = Unirest.get(query).asJson();
            if(response.getStatus() == 200) {
                JSONObject body = response.getBody().getObject();
                result = body.getInt("status");
            } else {
                System.out.println("Response is not 200 for MicroServiceMultiply.multiply: query: " + query);
            }
        } catch(Exception e) {
            System.out.printf("Exception while making call to MicroServiceMultiply.multiply: query: " + query);
        }

        return result;
    }

    public static int add(int a, int b) {
        String query = "http://localhost:8080/microservice/add/v1/" + a + "/" + b;

        int result = -1;
        try {
            HttpResponse<JsonNode> response = Unirest.get(query).asJson();
            if(response.getStatus() == 200) {
                JSONObject body = response.getBody().getObject();
                result = body.getInt("status");
            } else {
                System.out.println("Response is not 200 for MicroServiceAdd.add: query: " + query);
            }
        } catch(Exception e) {
            System.out.printf("Exception while making call to MicroServiceAdd.add: query: " + query);
        }

        return result;
    }
}
