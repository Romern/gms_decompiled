package p000;

import java.util.Iterator;

/* renamed from: bniv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bniv extends bnfi {

    /* renamed from: a */
    final /* synthetic */ Iterable f131679a;

    /* renamed from: b */
    final /* synthetic */ int f131680b;

    public bniv(Iterable iterable, int i) {
        this.f131679a = iterable;
        this.f131680b = i;
    }

    public final Iterator iterator() {
        Iterator it = this.f131679a.iterator();
        int i = this.f131680b;
        bmxy.m108581a(it);
        bmxy.m108588a(i > 0);
        return new bnjg(it, i);
    }
}
