package p000;

import java.util.List;

/* renamed from: bqwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqwr extends bqxq {

    /* renamed from: a */
    private final List f141758a;

    public bqwr(List list) {
        if (list != null) {
            this.f141758a = list;
            return;
        }
        throw new NullPointerException("Null spans");
    }

    /* renamed from: a */
    public final List mo69383a() {
        return this.f141758a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqxq) {
            return this.f141758a.equals(((bqxq) obj).mo69383a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f141758a.hashCode() ^ 1000003;
    }
}
