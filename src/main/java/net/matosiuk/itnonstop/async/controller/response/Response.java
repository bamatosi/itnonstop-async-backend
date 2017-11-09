package net.matosiuk.itnonstop.async.controller.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@JsonSerialize(using = ResponseSerializer.class)
public class Response {

    private static final String ELEMENT_MESSAGE = "message";

    private Object responseElements = new ArrayList();

    public Response() {}

    public Response(Object data) {
        addData(data);
    }

    public Response addMessage(String message) {
        if (message != null) {
            Map<String, String> resp = new HashMap();
            resp.put(ELEMENT_MESSAGE, message);
            responseElements = resp;
        }
        return this;
    }

    public Response addData(Object data) {
        if (data != null) {
            responseElements = data;
        }
        return this;
    }

    public Object getResponseElements() {
        return responseElements;
    }

}