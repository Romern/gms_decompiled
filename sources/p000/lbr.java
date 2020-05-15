package p000;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* renamed from: lbr */
final /* synthetic */ class lbr implements Predicate {

    /* renamed from: a */
    static final Predicate f25751a = new lbr();

    private lbr() {
    }

    public final boolean test(Object obj) {
        return Objects.nonNull((Pattern) obj);
    }
}
