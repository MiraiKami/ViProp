package fr.leblanc.utilitary;

public class PureGenerator {
    private final int state;
    private PureGenerator(int state){
        this.state = state;
    }

    private PureGenerator next(){
        int nextState = 1664525*state + 1013904223;
        if(nextState<1){
            return new PureGenerator(-nextState);
        }else{
            return new PureGenerator(nextState);
        }
    }

    private Pair<PureGenerator, Integer> nextInt(int from, int to){
        int n = to-from;
        int i = state%n + from;
        return new Pair(next(), i);
    }

    public Pair<PureGenerator, Boolean> nextBoolean(){
        boolean b = state%2 == 1;
        return new Pair(next(), b);
    }

    @Override
    public String toString() {
        return "PureGenerator{" +
                "state=" + state +
                '}';
    }

    public static PureGenerator init(int seed){
        return new PureGenerator(seed).next();
    }
}
