package p000;

import java.util.Map;

/* renamed from: bnhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnhj extends bnrd {

    /* renamed from: a */
    final bnrd f131625a = this.f131626b.f131629a.entrySet().iterator();

    /* renamed from: b */
    final /* synthetic */ bnhm f131626b;

    public bnhj(bnhm bnhm) {
        this.f131626b = bnhm;
    }

    public final boolean hasNext() {
        return this.f131625a.hasNext();
    }

    public final Object next() {
        return ((Map.Entry) this.f131625a.next()).getValue();
    }
}
