public class Count_num extends Thread{
    String myname;

    Count_num(String myname){
        this.myname = myname;
    }

    public void run(){
        for (int N = 0; N <5; N++){
            System.out.println(myname + N);
        }
    }
    /*
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    */
}
