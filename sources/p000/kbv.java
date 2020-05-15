package p000;

import android.util.Pair;
import java.util.function.Predicate;

/* renamed from: kbv */
final /* synthetic */ class kbv implements Predicate {

    /* renamed from: a */
    static final Predicate f23725a = new kbv();

    private kbv() {
    }

    public final boolean test(Object obj) {
        Pair pair = (Pair) obj;
        return (pair.first == null && pair.second == null) ? false : true;
    }
}
