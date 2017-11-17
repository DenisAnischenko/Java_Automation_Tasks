package org.my.model.exceptions;

public class NoOffersFoundException extends Exception {

    private String myInfo;

//    public NoOffersFoundException() {
//        super();
//    }


    public NoOffersFoundException(String exception) {
        super(exception);
        System.out.println("my exception: " + exception);
    }
}

