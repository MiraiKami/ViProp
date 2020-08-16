package fr.leblanc.utilitary;

public class Pair<T, A> {
    private T left;
    private A right;

    public Pair(T left, A right){
        this.left= left;
        this.right = right;
    }

    public A getRight() { return right; }

    public T getLeft() { return left; }
}
