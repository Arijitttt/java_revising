package cognizant;
 class board_capacity {
    private int board_capacity = 30,people =75;
    
    public void people_transfer(){
        int counter = 0,p=0;
        p = people;
        while (people>board_capacity) {
            counter +=1;
             p = p-board_capacity;
            people = people - board_capacity;

        }
         if(p<board_capacity){
             counter +=1;
         }
        System.out.println(counter);
    }
}
class board_problem{
    public static void main(String[] args) {
        board_capacity obj = new board_capacity();
        obj.people_transfer();
    }
}
