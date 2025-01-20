package com.natancode.notification.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {

    ENTITY_IN_USE("/entity-in-use", "Entity in use"),
    ACCESS_DENIED("/access-denied", "Access denied"),
    INVALID_PARAMETER("/invalid-parameter", "Invalid parameter"),
    INCOMPREHENSIBLE_MESSAGE("/incomprehensible-message", "Incomprehensible message"),
    INVALID_DATA("/invalid-data", "Invalid data"),
    SYSTEM_ERROR("/system-error", "System error"),
    NOT_FOUND_RESOURCE("/resource-not-found", "Resource not found"),
    BUSINESS_ERROR("/business-error", "Business Error");

    private String title;
    private String uri;

    ProblemType(String path, String title) {
        this.uri = "http://apibaseurl" + path;
        this.title =  title;
    }

}
