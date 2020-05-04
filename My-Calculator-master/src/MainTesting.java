public class MainTesting {
    //public class MainTesting


    public static void main(String[] args){
       // stamp(1000);
        keyClone(10);
        //forKeys(3);
       // forVisit(12);

    }

    public static void stamp(int visitor){
       int i = 1;

       while(i <= visitor) {
           System.out.println(" Welcome to the fifth hall "+ " visitor number:  " +  i );

           i++;
       }
    }



public static void forKeys(int numberOfkeys){


    for(int i =0;i <=numberOfkeys; i++ ){
        System.out.println(" a new key clone ");
    }

}



    public static void keyClone (int key){
        // key = 5
        int i = 0;

          do {
              // database connection
              System.out.println(" the number of clones of your key  ");
              System.out.println(" the number of clones of your key  ");
              System.out.print(i);
              i++;
          }while (i <= key);



            }

          //System.out.println("Please don't loose your keys ");






    public static  void forVisit(int guest){

        for(int i = 0; i <= guest; i++ ){
            System.out.println(" welcome to the wedding " + i);
        }
    }





}
