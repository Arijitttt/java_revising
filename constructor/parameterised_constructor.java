package constructor;

public class parameterised_constructor {
    private int a,b;

    public parameterised_constructor(int x,int y){
        a =x;
        b=y;
    }

    public void display(){
        System.out.println(a+b);
    }
}
class main_paramerised_constructor{
    public static void main(String[] args) {
        parameterised_constructor obj = new parameterised_constructor(30,70);
        obj.display();
    }
}