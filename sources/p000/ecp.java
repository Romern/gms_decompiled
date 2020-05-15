package p000;

import java.util.List;

/* renamed from: ecp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ecp implements Comparable {

    /* renamed from: a */
    public final long f14690a;

    /* renamed from: b */
    public final long f14691b;

    /* renamed from: c */
    public final List f14692c;

    public ecp(long j) {
        this.f14690a = j;
        this.f14691b = j;
        this.f14692c = null;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.f14690a;
        long j2 = ((ecp) obj).f14690a;
        if (j >= j2) {
            return j == j2 ? 0 : 1;
        }
        return -1;
    }

    public ecp(long j, long j2, List list) {
        this.f14690a = j;
        this.f14691b = j2;
        this.f14692c = list;
    }
}
