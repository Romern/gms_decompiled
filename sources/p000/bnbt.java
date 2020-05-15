package p000;

import java.lang.ref.ReferenceQueue;

/* renamed from: bnbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnbt extends bnbr {

    /* renamed from: a */
    volatile long f131400a = Long.MAX_VALUE;

    /* renamed from: b */
    bncc f131401b = bncb.m108953i();

    /* renamed from: c */
    bncc f131402c = bncb.m108953i();

    public bnbt(ReferenceQueue referenceQueue, Object obj, int i, bncc bncc) {
        super(referenceQueue, obj, i, bncc);
    }

    /* renamed from: b */
    public final void mo66993b(long j) {
        this.f131400a = j;
    }

    /* renamed from: c */
    public final void mo66996c(bncc bncc) {
        this.f131401b = bncc;
    }

    /* renamed from: d */
    public final void mo66998d(bncc bncc) {
        this.f131402c = bncc;
    }

    /* renamed from: h */
    public final long mo67002h() {
        return this.f131400a;
    }

    /* renamed from: i */
    public final bncc mo67003i() {
        return this.f131401b;
    }

    /* renamed from: j */
    public final bncc mo67004j() {
        return this.f131402c;
    }
}
