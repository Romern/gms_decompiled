package p000;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: bnop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnop extends bnny implements Serializable {

    /* renamed from: a */
    static final bnop f131931a = new bnop();
    private static final long serialVersionUID = 0;

    private bnop() {
    }

    private Object readResolve() {
        return f131931a;
    }

    /* renamed from: a */
    public final bnny mo67377a() {
        return bnnt.f131877a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo68164b(Object obj, Object obj2) {
        return (Comparable) bnnt.f131877a.mo68160a((Comparable) obj, (Comparable) obj2);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo68167c(Iterable iterable) {
        return (Comparable) bnnt.f131877a.mo68168d(iterable);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        bmxy.m108581a(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo68168d(Iterable iterable) {
        return (Comparable) bnnt.f131877a.mo68167c(iterable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo68160a(Object obj, Object obj2) {
        return (Comparable) bnnt.f131877a.mo68164b((Comparable) obj, (Comparable) obj2);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo68165b(Iterator it) {
        return (Comparable) bnnt.f131877a.mo68161a(it);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo68161a(Iterator it) {
        return (Comparable) bnnt.f131877a.mo68165b(it);
    }
}
