package net.matosiuk.itnonstop.async.controller.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

@JsonSerialize(using = ResponseSerializer.class)
public class Response {

    private static final String ELEMENT_MESSAGE = "message";
    private static final String ELEMENT_DATA = "data";
    private static final String ELEMENT_RESPONSE_CODE = "responseCode";

    public static final ResponseEntity<Response> SUCCESS_NO_CONTENT = ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Response());

    private Map<String, Object> responseElements = new HashMap<>();

    public Response() {}

    public Response(Object data) {
        addElement(ELEMENT_DATA, data);
    }

    public Response addMessage(String message) {
        if (message != null)
            addElement(ELEMENT_MESSAGE, message);
        return this;
    }

    public Response addMessage(String message, Object... args) {
        addElement(ELEMENT_MESSAGE, MessageFormat.format(message, args));
        return this;
    }

    public Response addData(Object data) {
        addElement(ELEMENT_DATA, data);
        return this;
    }

    public Response addResponseCode(String responseCode) {
        if (responseCode != null)
            addElement(ELEMENT_RESPONSE_CODE, responseCode);
        return this;
    }

    public Response addElement(String fieldName, Object object) {
        responseElements.put(fieldName, object);
        return this;
    }

    public Map<String, Object> getResponseElements() {
        return responseElements;
    }

}