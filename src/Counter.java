public class Counter {
    private int value;

    public Counter(int startValue) {
        value = startValue;
    }
    public Counter() {
        this.value = 0;
    }
    /**
     * @return int return the counter
     */
    public int getCounter() {
        return value;
    }

    /**
     * @param counter the counter to set
     */
    public void setCounter(int counter) {
        this.value = counter;
    }

    public void increaseCounter(int num) {
        if (num > 0) {
            value += num;
        } 
    }

    public void decreaseCounter(int num) {
        if (num > 0) {
            value -= num;
        }  
    }

    public void increaseCounter() {
        increaseCounter(1);
    }
    
    public void decreaseCounter() {
        decreaseCounter(1);
    }

    public String toString() {
        return ("counter number is " + value);
    }
}
