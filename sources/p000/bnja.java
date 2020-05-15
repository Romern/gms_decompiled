package p000;

import java.util.Iterator;

/* renamed from: bnja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnja extends bnfi {

    /* renamed from: a */
    final /* synthetic */ Iterable f131689a;

    /* renamed from: b */
    final /* synthetic */ int f131690b;

    public bnja(Iterable iterable, int i) {
        this.f131689a = iterable;
        this.f131690b = i;
    }

    public final Iterator iterator() {
        Iterator it = this.f131689a.iterator();
        int i = this.f131690b;
        bmxy.m108581a(it);
        bmxy.m108589a(i >= 0, "limit is negative");
        return new bnjj(i, it);
    }
}
