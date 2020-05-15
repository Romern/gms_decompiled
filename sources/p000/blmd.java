package p000;

import java.util.function.Supplier;
import java.util.regex.Matcher;

/* renamed from: blmd */
final /* synthetic */ class blmd implements Supplier {

    /* renamed from: a */
    private final Matcher f126835a;

    public blmd(Matcher matcher) {
        this.f126835a = matcher;
    }

    public final Object get() {
        return this.f126835a.pattern();
    }
}
