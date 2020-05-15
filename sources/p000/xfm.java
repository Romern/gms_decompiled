package p000;

import java.util.List;

/* renamed from: xfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfm extends xfo {

    /* renamed from: a */
    public final List f52129a;

    /* renamed from: b */
    public final List f52130b;

    public xfm(Long l, List list, List list2) {
        super(1, l);
        bmxy.m108581a(list);
        this.f52129a = list;
        bmxy.m108588a(!list.isEmpty());
        bmxy.m108581a(list2);
        this.f52130b = list2;
    }

    /* renamed from: a */
    public final ByteString mo29694a() {
        return ((xfq) this.f52129a.get(0)).f52135b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            xfm xfm = (xfm) obj;
            return this.f52129a.equals(xfm.f52129a) && this.f52130b.equals(xfm.f52130b);
        }
    }

    public final int hashCode() {
        return ((this.f52129a.hashCode() + 31) * 31) + this.f52130b.hashCode();
    }

    public final String toString() {
        return String.format("{requestType: %s, timeoutMillis: %s, challenges: %s, registeredKeys: %s}", xfn.m42819a(this.f52132d), String.valueOf(this.f52131c), xfo.m42820a(this.f52129a), xfo.m42820a(this.f52130b));
    }
}
