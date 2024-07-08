class Test{
    private int a,b;

    public void setData(){
        a=10;
        b=20;
    }
    public void getData(){
        System.out.println("a="+a+" b="+b);
    }
}

class Demo
{
    public static void main(String args[]){
        Test ob = new Test();
        ob.setData();
        ob.getData();
    }
}