public class CounterMain {
    public static void main(String[] args) throws Exception {
        

        Counter counter = new Counter();
        
        
        System.out.println("I started from zero " + counter);

        counter.increaseCounter();
        System.out.println("Now I am one " + counter);

        counter.increaseCounter(10);

        System.out.println("Now I should be eleven "+ counter);

        counter.decreaseCounter();

        System.out.println("I should be one less now back to ten " + counter);
        
        Counter counter2 = new Counter(2);
        
        System.out.println("I started at two " + counter2);

        counter2.increaseCounter(10);

        System.out.println("Now I should be twelve " + counter2);

        counter2.decreaseCounter(5);
        
        System.out.println("Now I should be seven " + counter2);

        

        


        
    }
}
