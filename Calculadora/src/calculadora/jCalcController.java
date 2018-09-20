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

    public static final int SUM_OPERATION = 1;
    public static final int SUB_OPERATION = 2;
    public static final int MULT_OPERATION = 3;
    public static final int DIV_OPERATION = 4;
    public static final int CLOSED_OPERATION = 5;

    public static final int NO_OPERATION = 0;

    private static int operation = NO_OPERATION;

    private static String fEntry;

    public static String getfEntry() {
        return fEntry;
    }

    public static void setfEntry(String fEntry) {
        jCalcController.fEntry = fEntry;
    }

    public static int getOperationStatus() {
        return operation;
    }

    public static void openOperation(int operation) {
        if (operation < SUM_OPERATION || operation > CLOSED_OPERATION) {
            jCalcController.operation = 0;
        } else {
            jCalcController.operation = operation;
        }
    }

    public static void clearOperation() {
        operation = NO_OPERATION;
    }

    static String operate(String sEntry) {
        double fnum = Double.parseDouble(jCalcController.fEntry);
        double snum = Double.parseDouble(sEntry);

        double tmp = 0;

        switch (jCalcController.operation) {
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
        }

        String res;

        if (jCalcController.operation == DIV_OPERATION) {
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

}
