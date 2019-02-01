package pl.zespolowka.logit.utils;

public class PostgreBoolean {

    public static short changeBoolean(short bool){
        if(bool == 0){
            return 1;
        }
        return 0;
    }
}
