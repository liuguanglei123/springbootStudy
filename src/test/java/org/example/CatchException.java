package org.example;

import org.junit.Test;

public class CatchException {

    public String trycatchexception(CatchClass i){
        try{
            return i.toString();
        }catch(Exception e){
            System.out.println("ERROR");
            return "";
        }
    }

    @Test
    public void maintain(){
        trycatchexception(null);
    }

}
