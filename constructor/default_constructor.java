package constructor;

class default_constructor {

    private int a,b;
    public default_constructor(){
        a = 14;
        b=2;
    }
    public void display(){
        System.out.println(a+"\t"+b);
    }
}
class cons_Main{
    public static void main(String args[]){
        default_constructor obj = new default_constructor();
        obj.display();
    }
}
