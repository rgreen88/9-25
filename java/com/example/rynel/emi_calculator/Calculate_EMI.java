package com.example.rynel.emi_calculator;

/**
 * Created by rynel on 9/26/2017.
 */

public class Calculate_EMI
{
    public static void main(String[] args)
    {
        //EMI = [P x R x (1+R)^N]/[(1+R)^N-1], where P stands for the loan amount or principal, R is the
        // interest rate per month [if the interest rate per annum is 11%, then the rate of interest will be
        // 11/(12 x 100)], and N is the number of monthly installments.

        //Calculate_EMI cEMI = new Calculate_EMI();
        //cEMI.calcEMI(1000000, .12, 3);





    }

    public Double calcEMI(double loanAmount, double ratePerYear, double numberOfYearlyInstallments)
    {
        ratePerYear = .12;
        numberOfYearlyInstallments = 3;
        loanAmount = ratePerYear / (12*100);
        double total = (loanAmount * ratePerYear * (Math.pow((1 + ratePerYear), numberOfYearlyInstallments)) / ((Math.pow((1 + ratePerYear), numberOfYearlyInstallments)) - 1));

        return total;
    }
}
