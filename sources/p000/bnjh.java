package p000;

import java.util.Iterator;

/* renamed from: bnjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjh extends bnch {

    /* renamed from: a */
    final /* synthetic */ Iterator f131699a;

    /* renamed from: b */
    final /* synthetic */ bmxz f131700b;

    public bnjh(Iterator it, bmxz bmxz) {
        this.f131699a = it;
        this.f131700b = bmxz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo8969a() {
        while (this.f131699a.hasNext()) {
            Object next = this.f131699a.next();
            if (this.f131700b.mo6527a(next)) {
                return next;
            }
        }
        return mo67118d();
    }
}
