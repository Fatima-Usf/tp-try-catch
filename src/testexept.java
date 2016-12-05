import java.util.Scanner;

/**
 * Created by fatima on 29/11/16.
 */
public class testexept {
void meth(){
int x,y;
Scanner sc = new Scanner(System.in) ;
    x =sc.nextInt();
System.out.println("avant incident");
    try{
        y=1/x;
    }
    catch(ArithmeticException e) {
        System.out.println("erreur division par 0");
    }

System.out.println("aprés incident");
}
}
