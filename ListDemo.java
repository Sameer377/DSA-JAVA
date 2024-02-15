public class ListDemo {
    
    int k=10;

    void check(){
        int a = k;
        a=20;
    }

    void exe(){
        check();
        System.out.println("Hello");
    }

    public static void main(String[] args) {
       ListDemo l =  new ListDemo();
       l.check();
        System.out.println(l.k);
    }


}
