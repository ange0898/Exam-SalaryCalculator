import java.util.Scanner;
class SalaryCalculator{
static void calculation(double asl, double TE, double MI, double FTD){
double calc;
System.out.printf(&quot;\t\tYour Annual Salary: %.2f \n&quot;,asl);
calc=asl/12;
System.out.printf(&quot;\t\tYour Monthly rate: %.2f&quot;,calc);
calc=calc/22;
System.out.printf(&quot;\n\t\tYour Daily Rate: %.2f&quot;,calc);
calc=calc/8;
System.out.printf(&quot;\n\t\tYour Hourly Rate: %.2f&quot;,calc);
calc=asl-FTD;
calc=calc-MI;
calc=FTD+(TE*calc);
System.out.printf(&quot;\n\t\tYour Annual Tax Deduction: %.2f&quot;,calc);
calc=calc/12;
System.out.printf(&quot;\n\t\tYour Monthly Tax Deduction: %.2f&quot;,calc);
calc=(asl/12)-calc;
System.out.printf(&quot;\n\t\tNet Pay: %.2f&quot;,calc);

System.out.println(&quot;\n\t--------------------------------------------------&quot;);
}

public static void main(String[] args){
double
asl,min_income,monthly=12,days=22,hours=8,tax_excess=0,fixed_tax_deduction=0, num = 0;
Scanner input = new Scanner(System.in);
do{
System.out.println(&quot;&quot;);
System.out.println(&quot;\n\nEnter Annual Salary:&quot;);
asl = input.nextDouble();
System.out.println(&quot;\t--------------------------------------------------&quot;);
if(250000&gt;=asl){
tax_excess=0;
min_income=0;
}else if(asl&gt;250000 &amp;&amp; asl&lt;=400000){
tax_excess=.20;
min_income=250000;
fixed_tax_deduction=0;
}
else if(400000&lt;
asl &amp;&amp; asl&lt;=800000 ){
tax_excess=.25;
min_income=400000;
fixed_tax_deduction=30000;
}
else if(asl&gt;800000 &amp;&amp; asl&lt;=2000000){
tax_excess = .30;
min_income=800000;
fixed_tax_deduction=130000;
}
else if(asl&gt;2000000 &amp;&amp; asl&lt;=8000000){
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
}while(num==0&amp;&amp;num!=1);
}

}