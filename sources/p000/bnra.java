package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnra extends bnch {

    /* renamed from: a */
    final /* synthetic */ Iterator f132020a;

    /* renamed from: b */
    final /* synthetic */ bnrb f132021b;

    public bnra(bnrb bnrb, Iterator it) {
        this.f132021b = bnrb;
        this.f132020a = it;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        if (!this.f132020a.hasNext()) {
            return (Map.Entry) mo67118d();
        }
        bnoa bnoa = (bnoa) this.f132020a.next();
        if (this.f132021b.f132023b.f131891b.compareTo(bnoa.f131892c) >= 0) {
            return (Map.Entry) mo67118d();
        }
        bnoa b = bnoa.mo68171b(this.f132021b.f132023b);
        if (this.f132021b.f132022a.mo6527a(b.f131891b)) {
            return bnmt.m109797a(b.f131891b, b);
        }
        return (Map.Entry) mo67118d();
    }
}
