package constructor;

public class constructor_overloading {

    private int a,b;

    public constructor_overloading(){
        a = 13;
        b = 5;
    }
    public constructor_overloading(int p){
        a =p;
        b =p;
    }
    public constructor_overloading(int x,int y){
        a= x;
        b = y;
    }
    public void show(){
        System.out.println(a+"\t"+b);
    }
}
class main_constructor_overloading{
    public static void main(String[] args) {
        constructor_overloading obj1 = new constructor_overloading();
        constructor_overloading obj2 = new constructor_overloading(50);
        constructor_overloading obj3 = new constructor_overloading(30,70);
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
