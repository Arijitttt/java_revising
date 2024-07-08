class leakage {
    public static void show(){
        System.out.println("red");
    }
    public void display(){
        System.out.println("Green");
    }    
}
class Main{
    public static void main(String args[]){
        //leakage

        // leakage obj = null;
        // leakage obj1 = new leakage();
        // obj.show();
        // obj1.display();
    }
}
