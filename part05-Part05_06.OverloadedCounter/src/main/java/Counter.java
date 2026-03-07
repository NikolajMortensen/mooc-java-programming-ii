public class Counter {
    private int number;

    public Counter() {
        this.number = 0;
    }
    
    public Counter(int startValue) {
        this.number = startValue;
    }

    public int value() {
        return number;
    }

    public void increase() {
        this.number += 1;
    }

    public void decrease() {
        this.number -= 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            this.number = this.number;
        } else
            this.number = this.number + increaseBy;
    }

    public void decrease(int decreaseBy) {

        if (decreaseBy < 0) {
            this.number = this.number;
        } else
            this.number = this.number - decreaseBy;

        
    }
}