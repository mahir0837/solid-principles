package com.sarac.dependencyInversion.example.good;

public class JSONReader implements Reader{

    /*
    Example JSON:

    {

    "username" : "mikesmith"

    }

     */
    @Override
    public String getUsername() {
        return "{\"username\": \"mikesmith\"}";
    }
}
