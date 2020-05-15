package p000;

import java.lang.ref.ReferenceQueue;

/* renamed from: bnbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnbu extends bnbf {

    /* renamed from: b */
    final int f131403b;

    public bnbu(ReferenceQueue referenceQueue, Object obj, bncc bncc, int i) {
        super(referenceQueue, obj, bncc);
        this.f131403b = i;
    }

    /* renamed from: a */
    public final int mo66970a() {
        return this.f131403b;
    }

    /* renamed from: a */
    public final bnbn mo66971a(ReferenceQueue referenceQueue, Object obj, bncc bncc) {
        return new bnbu(referenceQueue, obj, bncc, this.f131403b);
    }
}
