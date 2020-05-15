package p000;

import java.lang.ref.ReferenceQueue;

/* renamed from: bnlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnlh implements bnky {

    /* renamed from: a */
    public static final bnlh f131807a = new bnlh();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnkx mo67967a(bnlc bnlc, bnkx bnkx, bnkx bnkx2) {
        bnlj bnlj = (bnlj) bnlc;
        bnli bnli = (bnli) bnkx;
        bnli bnli2 = (bnli) bnkx2;
        if (bnlc.m109708a(bnli)) {
            return null;
        }
        ReferenceQueue referenceQueue = bnlj.f131809h;
        bnli bnli3 = new bnli(bnli.f131780a, bnli.f131781b, bnli2);
        bnli3.f131808d = bnli.f131808d.mo67946a(referenceQueue, bnli3);
        return bnli3;
    }

    /* renamed from: b */
    public final bnle mo67972b() {
        return bnle.WEAK;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnkx mo67968a(bnlc bnlc, Object obj, int i, bnkx bnkx) {
        bnlj bnlj = (bnlj) bnlc;
        return new bnli(obj, i, (bnli) bnkx);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnlc mo67969a(bnlw bnlw, int i) {
        return new bnlj(bnlw, i);
    }

    /* renamed from: a */
    public final bnle mo67970a() {
        return bnle.STRONG;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo67971a(bnlc bnlc, bnkx bnkx, Object obj) {
        bnli bnli = (bnli) bnkx;
        ReferenceQueue referenceQueue = ((bnlj) bnlc).f131809h;
        bnlt bnlt = bnli.f131808d;
        bnli.f131808d = new bnlu(referenceQueue, obj, bnli);
        bnlt.clear();
    }
}
