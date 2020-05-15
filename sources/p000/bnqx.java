package p000;

import java.util.Map;

/* renamed from: bnqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnqx extends bnch {

    /* renamed from: a */
    final /* synthetic */ bnqy f132013a;

    /* renamed from: b */
    final /* synthetic */ bnjq f132014b;

    public bnqx(bnqy bnqy, bnjq bnjq) {
        this.f132013a = bnqy;
        this.f132014b = bnjq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        if (!this.f132014b.hasNext()) {
            return (Map.Entry) mo67118d();
        }
        bnoa bnoa = (bnoa) this.f132014b.next();
        return this.f132013a.f132015a.f131891b.mo67481a(bnoa.f131892c) ? bnmt.m109797a(bnoa.f131892c, bnoa) : (Map.Entry) mo67118d();
    }
}
