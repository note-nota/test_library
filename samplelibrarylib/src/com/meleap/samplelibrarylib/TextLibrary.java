package com.meleap.samplelibrarylib;

/**
 * Created by naoki on 15/07/07.
 */
public class TextLibrary {
    private String message;

    public TextLibrary(String msg) {
        message = msg + "\nversion 0.0.2!!";
    }

    public String getMessage() {
        return message;
    }
}
