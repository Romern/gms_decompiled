package p000;

import java.util.Iterator;

/* renamed from: bnqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnqp extends bnmm {

    /* renamed from: a */
    final Iterable f131994a;

    /* renamed from: b */
    final /* synthetic */ bnqr f131995b;

    public bnqp(bnqr bnqr, Iterable iterable) {
        this.f131995b = bnqr;
        this.f131994a = iterable;
    }

    /* renamed from: b */
    public final Iterator mo68058b() {
        return this.f131994a.iterator();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final Object get(Object obj) {
        if (!(obj instanceof bnoa)) {
            return null;
        }
        bnoa bnoa = (bnoa) obj;
        bnqq bnqq = (bnqq) this.f131995b.f131998a.get(bnoa.f131891b);
        if (bnqq == null || !bnqq.f131996a.equals(bnoa)) {
            return null;
        }
        return bnqq.f131997b;
    }

    public final int size() {
        return this.f131995b.f131998a.size();
    }
}
