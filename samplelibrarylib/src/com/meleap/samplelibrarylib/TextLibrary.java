package com.meleap.samplelibrarylib;

/**
 * Created by naoki on 15/07/07.
 */
public class TextLibrary {
    private String message;

    public TextLibrary(String msg) {
        message = msg + "!!";
    }

    public String getMessage() {
        return message;
    }
}
