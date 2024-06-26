package com.lucio.forohub.infrastructure.errors;

public class ObjectAlreadyPersisted extends RuntimeException {
    public ObjectAlreadyPersisted(String message) {
        super(message);
    }
}
