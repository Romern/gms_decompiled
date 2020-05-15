package p000;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* renamed from: lby */
final /* synthetic */ class lby implements Predicate {

    /* renamed from: a */
    static final Predicate f25766a = new lby();

    private lby() {
    }

    public final boolean test(Object obj) {
        return Objects.nonNull((Pattern) obj);
    }
}
