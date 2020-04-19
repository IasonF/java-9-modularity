package analysis.Fletcher;

import api.Analyzer;

import java.util.List;

public class Fletcher implements Analyzer {
    public int calculate (String text) {
        return 10;
    }
    public static void main(String[] args) {
        System.out.println(new Fletcher().calculate("empty"));
    }

    @Override
    public String getName() {
        return "Fletcher";
    }

    @Override
    public double analyze(List<List<String>> text) {
        return 10.0;
    }
}
