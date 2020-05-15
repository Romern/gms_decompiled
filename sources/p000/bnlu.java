package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: bnlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnlu extends WeakReference implements bnlt {

    /* renamed from: a */
    final bnkx f131818a;

    public bnlu(ReferenceQueue referenceQueue, Object obj, bnkx bnkx) {
        super(obj, referenceQueue);
        this.f131818a = bnkx;
    }

    /* renamed from: a */
    public final bnkx mo67945a() {
        return this.f131818a;
    }

    /* renamed from: a */
    public final bnlt mo67946a(ReferenceQueue referenceQueue, bnkx bnkx) {
        return new bnlu(referenceQueue, get(), bnkx);
    }
}
