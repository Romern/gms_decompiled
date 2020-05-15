package p000;

import java.util.Comparator;
import java.util.Iterator;

/* renamed from: bnjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjb extends bnfi {

    /* renamed from: a */
    final /* synthetic */ Iterable f131691a;

    /* renamed from: b */
    final /* synthetic */ Comparator f131692b;

    public bnjb(Iterable iterable, Comparator comparator) {
        this.f131691a = iterable;
        this.f131692b = comparator;
    }

    public final Iterator iterator() {
        Iterable a = bnjd.m109575a(this.f131691a, bnjd.m109573a());
        Comparator comparator = this.f131692b;
        bmxy.m108582a(a, "iterators");
        bmxy.m108582a(comparator, "comparator");
        return new bnjp(a, comparator);
    }
}
