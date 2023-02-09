package com.sarac.dependencyInversion.example.good;

public class UserReader {

    private Reader reader;

    public UserReader(Reader reader){
        this.reader=reader;
    }
    public String getUserName(){
        return reader.getUsername();
    }
}
