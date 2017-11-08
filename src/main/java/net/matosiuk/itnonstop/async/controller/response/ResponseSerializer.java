package net.matosiuk.itnonstop.async.controller.response;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class ResponseSerializer extends JsonSerializer<Response>{

    @Override
    public void serialize(Response value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeObject(value.getResponseElements());
    }

}