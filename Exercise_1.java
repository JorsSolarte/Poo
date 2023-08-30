
package Exercise_1;


public class Exercise_1 {


    public static void main(String[] args) {
       Exercise_1 ex = new Exercise_1();
       //System.out.println(ex.factorial(5));
       System.out.println(ex.factorial_r(5));
    }
    public int  factorial_r (int n){
       if(n== 0 || n==1){
           return 1;
       } else {
          return factorial_r(n-1)*n; 
       }       
    }
  public int  factorial (int num){
       int aux = 1; 
       for(int a = 1; a <= num; a++){
       aux = aux * a;
   }
       return aux; 
    }
       
   }

