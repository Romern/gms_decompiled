package p000;

import java.util.Map;

/* renamed from: pct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pct implements Map.Entry {

    /* renamed from: a */
    final /* synthetic */ String f38845a;

    /* renamed from: b */
    final /* synthetic */ Iterable f38846b;

    public pct(String str, Iterable iterable) {
        this.f38845a = str;
        this.f38846b = iterable;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f38845a;
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.f38846b;
    }

    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        Iterable iterable = (Iterable) obj;
        throw new RuntimeException("This is read only.");
    }
}
