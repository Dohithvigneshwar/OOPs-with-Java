class getter_setter_demo{
    private String name = "dohith";
    public String getter(){
         return name;
    }
    public void setter(String name){
         this.name = name;
    }
}
public class getter_setter{
     public static void main(String args[]){
          getter_setter_demo obj = new getter_setter_demo();
          System.out.println(obj.getter());
          obj.setter("dohithsp");
          System.out.println(obj.getter());
          
     }
}