package p000;

import java.lang.ref.ReferenceQueue;

/* renamed from: bnlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnlp implements bnky {

    /* renamed from: a */
    public static final bnlp f131814a = new bnlp();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnkx mo67967a(bnlc bnlc, bnkx bnkx, bnkx bnkx2) {
        bnlr bnlr = (bnlr) bnlc;
        bnlq bnlq = (bnlq) bnkx;
        bnlq bnlq2 = (bnlq) bnkx2;
        if (bnlq.get() == null || bnlc.m109708a(bnlq)) {
            return null;
        }
        ReferenceQueue referenceQueue = bnlr.f131816h;
        ReferenceQueue referenceQueue2 = bnlr.f131817i;
        bnlq bnlq3 = new bnlq(referenceQueue, bnlq.get(), bnlq.f131783a, bnlq2);
        bnlq3.f131815c = bnlq.f131815c.mo67946a(referenceQueue2, bnlq3);
        return bnlq3;
    }

    /* renamed from: b */
    public final bnle mo67972b() {
        return bnle.WEAK;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnkx mo67968a(bnlc bnlc, Object obj, int i, bnkx bnkx) {
        return new bnlq(((bnlr) bnlc).f131816h, obj, i, (bnlq) bnkx);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnlc mo67969a(bnlw bnlw, int i) {
        return new bnlr(bnlw, i);
    }

    /* renamed from: a */
    public final bnle mo67970a() {
        return bnle.WEAK;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo67971a(bnlc bnlc, bnkx bnkx, Object obj) {
        bnlq bnlq = (bnlq) bnkx;
        ReferenceQueue referenceQueue = ((bnlr) bnlc).f131817i;
        bnlt bnlt = bnlq.f131815c;
        bnlq.f131815c = new bnlu(referenceQueue, obj, bnlq);
        bnlt.clear();
    }
}
