import java.util.Scanner;
class SalaryCalculator
{
	static void calculation(double asl, double TE, double MI, double FTD){
		double calc;
		System.out.printf("Your Annual Salary: %.2f \n",asl);
		calc=asl/12;
		System.out.printf("Your Monthly rate: %.2f",calc);
		calc=calc/22;
		System.out.printf("\nYour Daily Rate: %.2f",calc);
		calc=calc/8;
		System.out.printf("\nYour Hourly Rate: %.2f",calc);
		calc=asl-FTD;
		calc=calc-MI;
		calc=FTD+(TE*calc);
		System.out.printf("\nYour Annual Tax Deduction: %.2f",calc);
		calc=calc/12;
		System.out.printf("\nYour Monthly Tax Deduction: %.2f",calc);
		calc=(asl/12)-calc;
			System.out.printf("\nNet Pay: %.2f",calc);
	}
	
	
	public static void main(String[] args)	
	{
	  double asl,min_income,monthly=12,days=22,hours=8,tax_excess=0,fixed_tax_deduction=0;
	 Scanner input = new Scanner(System.in);
	  System.out.println("Enter Annual Salary:");
      asl = input.nextDouble();
      if(250000>=asl){
      	tax_excess=0;
      	min_income=0;
      }else if(asl>250000 && asl<=400000){
      	tax_excess=.20;
      	min_income=250000;
      	fixed_tax_deduction=0;
      	}
      else if(400000<
      asl && asl<=800000 ){
      	tax_excess=.25;
      	min_income=400000;
      	fixed_tax_deduction=30000;
      	}
      else if(asl>800000 && asl<=2000000){
      	tax_excess = .30;
      	min_income=800000;
      	fixed_tax_deduction=130000;
      	}
      else if(asl>2000000 && asl<=8000000){
      	tax_excess = .32;
      	min_income=2000000;
      	fixed_tax_deduction=490000;
      	}
      	else{
      		tax_excess=.35;
      		min_income=8000000;
      		fixed_tax_deduction=2410000;
      	}
      calculation(asl,tax_excess,min_income,fixed_tax_deduction);
  }    
}
