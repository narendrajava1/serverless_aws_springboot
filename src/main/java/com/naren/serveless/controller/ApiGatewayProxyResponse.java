package com.naren.serveless.controller;

import java.util.Map;

import lombok.Data;
@Data
public class ApiGatewayProxyResponse {
    private int statusCode;
    private Map<String, String> headers;
    private String body;
    public ApiGatewayProxyResponse(int statusCode, Map<String, String> headers, String body) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.body = body;
    }
    // getters & setters omitted
}