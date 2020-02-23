package com.ics.network.client.app.exception.response;

import org.springframework.http.HttpStatus;

public class CustomErrorResponse {

    private HttpStatus status;
    private String     error;

    public CustomErrorResponse(final HttpStatus status, final String error) {
        this.status = status;
        this.error = error;
    }

    public HttpStatus getStatus() {
        return this.status;
    }

    public void setStatus(final HttpStatus status) {
        this.status = status;
    }

    public String getError() {
        return this.error;
    }

    public void setError(final String error) {
        this.error = error;
    }
}
