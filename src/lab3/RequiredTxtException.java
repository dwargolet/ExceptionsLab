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
public class RequiredTxtException extends IllegalArgumentException{
    private static String msg = "Must enter a name atleast 2 characters long";
    
    public RequiredTxtException() {
        super(msg);
    }

    public RequiredTxtException(String s) {
        super(msg);
    }

    public RequiredTxtException(String message, Throwable cause) {
        super(msg, cause);
    }

    public RequiredTxtException(Throwable cause) {
        super(msg, cause);
    }
    
}
