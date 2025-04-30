package problems;

class Generic<T>{
    private T value;
    public void setValue(T value){
        this.value = value;
    }
    public boolean findMavNumber(){
        String num = String.valueOf(value);
        if(num.length()<3) return false;
        for(int i=2;i<num.length();i++){
            if((num.charAt(i-1)-'0') + (num.charAt(i-2)-'0') > (num.charAt(i)-'0')) return false;
        }
        return true;
    }
}
public class GenericType{
    public static void main(String[] args) {
        Generic<Integer> obj = new Generic<>();
        obj.setValue(1235);
        System.out.println(obj.findMavNumber());
    }
}