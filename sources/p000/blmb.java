package p000;

import java.util.function.Supplier;
import java.util.regex.Pattern;

/* renamed from: blmb */
final /* synthetic */ class blmb implements Supplier {

    /* renamed from: a */
    private final String f126832a;

    /* renamed from: b */
    private final int f126833b;

    public blmb(String str, int i) {
        this.f126832a = str;
        this.f126833b = i;
    }

    public final Object get() {
        return Pattern.compile(this.f126832a, this.f126833b);
    }
}
