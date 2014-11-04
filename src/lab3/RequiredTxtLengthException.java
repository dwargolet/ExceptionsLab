/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *
 * @author dworgolet
 */
public class RequiredTxtLengthException extends IllegalArgumentException{    
    private static String msg = "You may only enter a first and last name";
    
    public RequiredTxtLengthException() {
        super(msg);
    }

    public RequiredTxtLengthException(String s) {
        super(msg);
    }

    public RequiredTxtLengthException(String message, Throwable cause) {
        super(msg, cause);
    }

    public RequiredTxtLengthException(Throwable cause) {
        super(msg, cause);
    }
    
    
    
    
    
    
}
