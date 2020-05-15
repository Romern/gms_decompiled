package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnqw extends bnch {

    /* renamed from: a */
    final /* synthetic */ Iterator f132011a;

    /* renamed from: b */
    final /* synthetic */ bnqy f132012b;

    public bnqw(bnqy bnqy, Iterator it) {
        this.f132012b = bnqy;
        this.f132011a = it;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        if (!this.f132011a.hasNext()) {
            return (Map.Entry) mo67118d();
        }
        bnoa bnoa = (bnoa) this.f132011a.next();
        if (this.f132012b.f132015a.f131892c.mo67481a((Comparable) bnoa.f131892c)) {
            return (Map.Entry) mo67118d();
        }
        return bnmt.m109797a(bnoa.f131892c, bnoa);
    }
}
