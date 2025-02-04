//Parameter object passing technique for an memory management
public class Class{
     public static void main(String args[]){
          Customer cs = new Customer();
          cs.n = 11;
          System.out.println(cs.n);
          cs.print(cs);
          System.out.println(cs.n);
     }
}
class Customer{
     int n;
     public void print(Customer cus){
          cus.n = 12;
     }
}