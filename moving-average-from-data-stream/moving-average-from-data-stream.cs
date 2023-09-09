public class MovingAverage {
    
    int windowSize;
    Queue<int> q;
    double sum;

    public MovingAverage(int size) {
        windowSize = size;
        q = new Queue<int>();
        sum = 0;
    }
    
    public double Next(int val) {
        if(q.Count < windowSize){
            q.Enqueue(val);
            sum += val;
            return sum / q.Count;
        }
        else{
            sum -= q.Dequeue();
            q.Enqueue(val);
            sum += val;
            return sum / windowSize;
        }
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.Next(val);
 */