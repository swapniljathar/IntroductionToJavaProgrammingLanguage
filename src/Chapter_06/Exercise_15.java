package Chapter_06;

/**
 * (Financial application: print a tax table) Listing 3.5 gives a program to compute
 tax. Write a method for computing tax using the following header:
 public static double computeTax(int status, double taxableIncome)
 Use this method to write a program that prints a tax table for taxable income from
 $50,000 to $60,000 with intervals of $50 for all the following statuses:
 Taxable      Single      Married Joint       Married        Head of
 Income                   or Qualifying       Separate       a House
 Widow(er)
 ------------------------------------------------------------------------
 50000        8688        6665                8688           7353
 50050        8700        6673                8700           7365
 ...
 59950        11175       8158                11175          9840
 60000        11188       8165                11188          9853
 */
public class Exercise_15 {
    public static void main(String[] args) {

        double from = 50000;
        double to = 60000;
        double interval = 50;


        System.out.println(
                "\nTaxable      Single      Married Joint       Married        Head of\n" +
                        "Income                   or Qualifying       Separate       a House\n" +
                        "                         Widow(er)\n" +
                        "---------------------------------------------------------------------");

        for (double taxableIncome = from;
             taxableIncome <= to; taxableIncome += interval) {
            System.out.printf("%-13.0f", taxableIncome);
            System.out.printf("%-12d", Math.round(computeTax(0, taxableIncome)));
            System.out.printf("%-20d", Math.round(computeTax(1, taxableIncome)));
            System.out.printf("%-15d", Math.round(computeTax(2, taxableIncome)));
            System.out.printf("%-10d\n", Math.round(computeTax(3, taxableIncome)));
        }
    }

    public static double computeTax(int status, double taxableIncome) {
        double tax,
                taxRate,
                incomeTaxed,
                incomeUntaxed,
                taxAt15Percent,
                taxAt25Percent,
                taxAt28Percent,
                taxAt33Percent,
                taxAt35Percent;

        taxAt15Percent = taxAt25Percent = taxAt28Percent = taxAt33Percent =
                taxAt35Percent = incomeUntaxed = taxRate = tax = 0.0;

        switch (status) {
            case 0 :
                taxAt15Percent = 8351;
                taxAt25Percent = 33951;
                taxAt28Percent = 82251;
                taxAt33Percent = 171551;
                taxAt35Percent = 372951; break;

            case 1 :
                taxAt15Percent = 16701;
                taxAt25Percent = 67901;
                taxAt28Percent = 137051;
                taxAt33Percent = 208851;
                taxAt35Percent = 372951; break;

            case 2 :
                taxAt15Percent = 8351;
                taxAt25Percent = 33951;
                taxAt28Percent = 68526;
                taxAt33Percent = 104426;
                taxAt35Percent = 186476; break;

            case 3 :
                taxAt15Percent = 11951;
                taxAt25Percent = 45501;
                taxAt28Percent = 117451;
                taxAt33Percent = 190201;
                taxAt35Percent = 372951;
        }


        while (taxableIncome >= taxAt15Percent) {


            if (taxableIncome >= taxAt35Percent) {
                taxRate = 0.35;
                incomeUntaxed = taxAt35Percent - 1;
            }
            else if (taxableIncome >= taxAt33Percent) {
                taxRate = 0.33;
                incomeUntaxed = taxAt33Percent - 1;
            }
            else if (taxableIncome >= taxAt28Percent) {
                taxRate = 0.28;
                incomeUntaxed = taxAt28Percent - 1;
            }
            else if (taxableIncome >= taxAt25Percent) {
                taxRate = 0.25;
                incomeUntaxed = taxAt25Percent -1;
            }
            else if (taxableIncome >= taxAt15Percent) {
                taxRate = 0.15;
                incomeUntaxed = taxAt15Percent - 1;
            }


            tax += (incomeTaxed = taxableIncome - incomeUntaxed) * taxRate;
            taxableIncome -= incomeTaxed;
        }

        return tax += taxableIncome * 0.10;
    }
}
