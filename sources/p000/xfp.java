package p000;

import java.util.List;

/* renamed from: xfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfp extends xfo {

    /* renamed from: a */
    public final List f52133a;

    public xfp(Long l, List list) {
        super(2, l);
        this.f52133a = list;
    }

    /* renamed from: a */
    public final bxtx mo29694a() {
        if (!this.f52133a.isEmpty()) {
            return ((xfr) this.f52133a.get(0)).f52139b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xfp) {
            return bmxi.m108538a(this.f52133a, ((xfp) obj).f52133a);
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f52132d + 31) * 31;
        Long l = this.f52131c;
        return ((i + (l != null ? l.hashCode() : 0)) * 31) + this.f52133a.hashCode();
    }

    public final String toString() {
        return String.format("{requestType: %s, timeoutMillis: %s, challenges: %s}", xfn.m42819a(this.f52132d), String.valueOf(this.f52131c), xfo.m42820a(this.f52133a));
    }
}
