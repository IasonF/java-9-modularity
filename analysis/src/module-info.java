import analysis.Fletcher.Fletcher;
import api.Analyzer;

module analysis {
    requires java.base;
    requires api;
    exports analysis.Fletcher;
    exports analysis.Kolin;
    provides Analyzer with Fletcher;
}