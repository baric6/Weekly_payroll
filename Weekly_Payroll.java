/*
 * Cis_2212, Due_Wednesday_Sept_5_2018
 * Weekly_Payroll
 * Aug_30_2018
 * */
//ThisCamelCaseIsDrivingMeUpTheWallLooksLikeAnRunOnSentance :/
//i_prefur_using_underscores_it_looks_so_much_easier_to_read_,_i_hope_in_future_programs_i_can_use_my_style_:p

//this program is used to see how much a employee get paid after taxes//
package methods;

import java.text.NumberFormat;
import java.util.Scanner;

public class Weekly_Payroll 
{
	//methods///////////////////////////////////////////////////////////////////////
	//gross
	public static double calcGross(double hrs, double py_Rate)
	{
		return hrs * py_Rate;
	}
	//fed with-holding
	public static double calcFedWH(double gross, double fed_WH_rate)
	{
		return gross * fed_WH_rate;
	}
	//state with-holding
	public static double calcStateWH(double gross, double state_WH_rate) 
	{
		return gross * state_WH_rate;
	}
	//total deduction
	public static double calcTotalDeduct(double fed_WH, double state_WH)
	{
		return fed_WH + state_WH;
	}
	//net pay
	public static double calcNet(double gross, double total_ded)
	{
		return gross - total_ded;
	}
	///////////////////////////////////////////////////////////////////////////////
	//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx//
	//main///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) 
	{
		//user input
		Scanner set_input = new Scanner(System.in);
		//number format
		NumberFormat set_currency = NumberFormat.getCurrencyInstance();
		
		//basic var
		String name;
		double hours = 0;//39.88
		double payRate = 0;//26.44
		double fedTaxWHrate = 0;//0.15
		double stateTaxWHrate = 0;//.0563
		
		//input part was looking to plain, but have to make program exactly :(
		//System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		//System.out.println("X Input Employee's Information X");
		//System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		//System.out.println("");
		
		//input
		System.out.print("Enter employees name: ");
		name = set_input.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		hours = set_input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		payRate = set_input.nextDouble();
		
		System.out.print("Enter federal tax with-holding rate: ");
		fedTaxWHrate = set_input.nextDouble();
		
		System.out.print("Enter state tax with-holding rate: ");
		stateTaxWHrate = set_input.nextDouble();
		
		System.out.println();
		
		//method to var
		double grossPay = calcGross(hours, payRate);
		double fedTaxWH = calcFedWH(grossPay, fedTaxWHrate);
		double stateTaxWH = calcStateWH(grossPay, stateTaxWHrate);
		double totalDeduction = calcTotalDeduct(fedTaxWH, stateTaxWH);
		double netPay = calcNet(grossPay, totalDeduction);
		
		//display part was looking to plain, but have to make program exactly :(
		//System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
		//System.out.println("X Employee's Information X");
		//System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
		//System.out.println("");
		
		//display
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: " + payRate);
		System.out.println("Gross Pay: "+ set_currency.format(grossPay));
		System.out.println("Deduction:");
		System.out.println("  Federal with-holding at " + fedTaxWHrate * 100 + "%: " + set_currency.format(fedTaxWH));
		System.out.println("  State with-holding at " + stateTaxWHrate * 100 + "%: " + set_currency.format(stateTaxWH));
		System.out.println("  Total Deduction: " + set_currency.format(totalDeduction));
		System.out.println("Net Pay: " + set_currency.format(netPay));
		
	}//end main
}//end class
