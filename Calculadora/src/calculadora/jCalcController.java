/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JFormattedTextField;

/**
 *
 * @author alumno
 */
public class jCalcController {

    //State value constants
    
    public static final int SUM_OPERATION = 1;
    public static final int SUB_OPERATION = 2;
    public static final int MULT_OPERATION = 3;
    public static final int DIV_OPERATION = 4;
    
    
    public static final int EXP_OPERATION = 5;
    public static final int POW_OPERATION = 6;
    public static final int NROOT_OPERATION = 7;
    public static final int NONNLOG_OPERATION = 8;
            
    public static final int CLOSED_OPERATION = 9;

    public static final int NO_OPERATION = 0;
    
    //current state variable initialization

    private static int operation = NO_OPERATION;

    private static String fEntry;

    public static String getfEntry() {
        return fEntry;
    }

    public static void setfEntry(String fEntry) { //Stores one entry as String
        jCalcController.fEntry = fEntry;
    }

    public static int getOperationStatus() {
        return operation;
    }

    public static void openOperation(int operation) {
        if (operation < SUM_OPERATION || operation > CLOSED_OPERATION) { //state protection. enters NO OPERATION MODE as safe guard
            jCalcController.operation = 0;
        } else {
            jCalcController.operation = operation;
        }
    }

    public static void clearOperation() { //restaures NO OPERATION mode
        operation = NO_OPERATION;
    }

    static String operate(String sEntry) {
 
        double fnum = Double.parseDouble(jCalcController.fEntry);
        
        double snum = Double.parseDouble(sEntry);

        double tmp = 0;

        switch (jCalcController.operation) { //simple state dependant operation switch
            case SUM_OPERATION:
                tmp = sum(fnum, snum);
                break;
            case SUB_OPERATION:
                tmp = substract(fnum, snum);
                break;
            case MULT_OPERATION:
                tmp = multiply(fnum, snum);
                break;
            case DIV_OPERATION:
                tmp = divide(fnum, snum);
                break;
            case EXP_OPERATION:
                tmp = exponentiation(fnum);
                break;
            case POW_OPERATION:
                tmp = power(fnum, snum);
                break;
            case NROOT_OPERATION:
                tmp = root(fnum, snum);
                break;
            case NONNLOG_OPERATION:
                tmp = nonnlog(fnum, snum);
        }

        String res;

        if (jCalcController.operation == DIV_OPERATION 
                || jCalcController.operation == NROOT_OPERATION
                || jCalcController.operation == NONNLOG_OPERATION) {
            res = String.format("%f", tmp);
        } else {
            res = String.format("%d", (long)tmp);
        }
        
        jCalcController.operation = CLOSED_OPERATION;

        return res;
    }

    private static double sum(double fnum, double snum) {
        return fnum + snum;
    }

    private static double substract(double fnum, double snum) {
        return fnum - snum;
    }

    private static double multiply(double fnum, double snum) {
        return fnum * snum;
    }

    private static double divide(double fnum, double snum) {
        return fnum / snum;
    }

    private static double exponentiation(double snum) {
        if(snum == 1)
            return 1;
        else
            return snum * exponentiation(snum-1);
    }

    private static double power(double fnum, double snum) {
        return Math.pow(fnum, snum);
    }

    private static double root(double fnum, double snum) {
        return Math.pow(fnum, 1/snum);
    }

    private static double nonnlog(double fnum, double snum) {
        return Math.log(fnum)/Math.log(snum);
    }

}
