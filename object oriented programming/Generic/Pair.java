public class Pair<T> {
    private T first, second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "[" + first + ", " + second + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Pair) {
            Pair o = (Pair) other;
            if (this.getFirst() == o.getFirst()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}