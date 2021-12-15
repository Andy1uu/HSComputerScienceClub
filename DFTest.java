import java.text.DecimalFormat;

public class DFTest{
public static void main(String[] args){
double d  = 24032.269;
System.out.printf("Two Decimal Places: %8.2f\n", d);
System.out.printf("Two Decimal Places: %.2f\n", d);
DecimalFormat df = new DecimalFormat("$00.00");
System.out.println(df.format(d));
DecimalFormat df2 = new DecimalFormat("$#.00");
System.out.println(df2.format(d));
System.out.println(Math.round(d));
}
}