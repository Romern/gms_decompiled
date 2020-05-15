package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnqz extends bnch {

    /* renamed from: a */
    final /* synthetic */ Iterator f132017a;

    /* renamed from: b */
    final /* synthetic */ bnfa f132018b;

    /* renamed from: c */
    final /* synthetic */ bnrb f132019c;

    public bnqz(bnrb bnrb, Iterator it, bnfa bnfa) {
        this.f132019c = bnrb;
        this.f132017a = it;
        this.f132018b = bnfa;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        if (!this.f132017a.hasNext()) {
            return (Map.Entry) mo67118d();
        }
        bnoa bnoa = (bnoa) this.f132017a.next();
        if (this.f132018b.mo67481a((Comparable) bnoa.f131891b)) {
            return (Map.Entry) mo67118d();
        }
        bnoa b = bnoa.mo68171b(this.f132019c.f132023b);
        return bnmt.m109797a(b.f131891b, b);
    }
}
