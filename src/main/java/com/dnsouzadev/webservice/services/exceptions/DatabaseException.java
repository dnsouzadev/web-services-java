package com.dnsouzadev.webservice.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -8141577803856803553L;

    public DatabaseException(String msg) {
        super(msg);
    }
}
