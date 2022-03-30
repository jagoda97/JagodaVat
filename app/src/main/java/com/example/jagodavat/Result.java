package com.example.jagodavat;

public class Result {
    public Subject subject;

    public String requestId;

    public String requestDateTime;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(String requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    public Result(Subject subject, String requestId, String requestDateTime) {
        this.subject = subject;
        this.requestId = requestId;
        this.requestDateTime = requestDateTime;
    }
}
