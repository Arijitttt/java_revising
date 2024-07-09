public class this_keyword {
    int x,y;
    
    public this_keyword(int a,int b){
        this.x = a;
        this.y = b;
    }
    public void display(){
        System.out.println(x+"\t"+y);
    }

}
class main_this_keyWord{
    public static void main(String[] args) {
        this_keyword obj = new this_keyword(10,20);
        obj.display();
    }
}
