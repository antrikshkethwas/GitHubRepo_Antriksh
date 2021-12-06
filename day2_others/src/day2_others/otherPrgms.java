package day2_others;

public class otherPrgms {

 //Java Program to convert int type variables to char
	int intVar = 1;
	char charVar = (char)intVar;	
//Java Program to convert long type variables into int
	long longVar = 231221;
	int intVar2 = (int)longVar;	
//Java Program to convert int type variables to long
	int longVar2 = intVar;
//Java Program to convert boolean variables into string
	boolean b = true;
	String s1 = String.valueOf(b);
//Java Program to convert string type variables into boolean
	String s2 = "true";
	boolean b2 = Boolean.parseBoolean(s2);
//Java Program to convert string type variables into int
	String s3 = "24";
	int iv2 = Integer.parseInt(s3);	
//Java Program to convert int type variables to String
	String s4 = String.valueOf(iv2);
//Java Program to convert int type variables to double
	double d1 = (double) iv2;
//Java Program to convert double type variables to int
	int iv4 = (int) d1;
//Java Program to convert string variables to double
	double d2 = Double.parseDouble(s3);
//Java Program to convert double type variables to string
	String s5 = String.valueOf(d2);
//Java Program to convert primitive types to objects and vice versa
	 // create primitive types
    int v1 = 5;
    double v2 = 5.65;
    boolean v3 = true;

    //converts into wrapper objects
    Integer obj1 = Integer.valueOf(v1);
    Double obj2 = Double.valueOf(v2);
    Boolean obj3 = Boolean.valueOf(v3);

}
