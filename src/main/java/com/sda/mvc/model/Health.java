package com.sda.mvc.model;

public enum Health {
    HEALTHLY("healthly"),WOUNDED("wounded"),DEAD("dead");

    private String title;

    Health(String title) {
        this.title = title;
    }
}
