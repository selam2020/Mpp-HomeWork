package prog8prob3;

import java.util.function.Predicate;

public class MyClass {
   String a;
   int b;
   MyClass(String a,int b){
	   this.a= a;
	   this.b= b;  
	   
   }
   
   public boolean myMethod(MyClass cl) {
	   if (cl==null) return false;
	   if(cl.getClass()!=this.getClass())return false;
	   
	   return cl.a.equals(this.a) && cl.b==this.b;
			   
	  
   }
   Predicate<MyClass> p=x->this.a.equals(x.a) && this.b==x.b;
    Predicate<MyClass> p1=this::equals;


   public static void main (String [] args) {
	   //this::equals
	   //Imperative style
	   MyClass m1=new MyClass("Selam",30);
	   MyClass m2=new MyClass("Emito",40);
	   MyClass m3=new MyClass("Selam",30);
	   //System.out.println(m1.myMethod(m2));
	  // System.out.println(m1.myMethod(m3));
	   
	   //Lambda Expression
	   System.out.println(m1.p.test(m2));
	   System.out.println(m1.p.test(m3));
   }
}
