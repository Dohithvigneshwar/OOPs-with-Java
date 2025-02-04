class PassByReference{
     public static void main(String args[]){
          Box obj = new Box(10);
          obj.reference(obj);
          System.out.println(obj.n);
     }
     
}
class Box{
     public int n = 0;
     public Box(int n){
          this.n = n;
     }
     public void reference(Box b){
          b.n++;
     }
}