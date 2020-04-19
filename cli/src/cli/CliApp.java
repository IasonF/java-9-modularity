package cli;

import analysis.Fletcher.Fletcher;
import analysis.Kolin.Kolin;

public class CliApp {
    public static void main(String[] args) {
        System.out.println(new Fletcher().calculate("something"));
        Kolin kolin = new Kolin();
        System.out.println(kolin.calculate());
    }
}
