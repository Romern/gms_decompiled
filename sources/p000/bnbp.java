package p000;

import java.lang.ref.ReferenceQueue;

/* renamed from: bnbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnbp extends bnbr {

    /* renamed from: a */
    volatile long f131387a = Long.MAX_VALUE;

    /* renamed from: b */
    bncc f131388b = bncb.m108953i();

    /* renamed from: c */
    bncc f131389c = bncb.m108953i();

    public bnbp(ReferenceQueue referenceQueue, Object obj, int i, bncc bncc) {
        super(referenceQueue, obj, i, bncc);
    }

    /* renamed from: a */
    public final void mo66989a(long j) {
        this.f131387a = j;
    }

    /* renamed from: a */
    public final void mo66991a(bncc bncc) {
        this.f131388b = bncc;
    }

    /* renamed from: b */
    public final void mo66994b(bncc bncc) {
        this.f131389c = bncc;
    }

    /* renamed from: e */
    public final long mo66999e() {
        return this.f131387a;
    }

    /* renamed from: f */
    public final bncc mo67000f() {
        return this.f131388b;
    }

    /* renamed from: g */
    public final bncc mo67001g() {
        return this.f131389c;
    }
}
