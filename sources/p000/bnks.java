package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: bnks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnks extends WeakReference implements bnkx {

    /* renamed from: a */
    final int f131783a;

    /* renamed from: b */
    final bnkx f131784b;

    public bnks(ReferenceQueue referenceQueue, Object obj, int i, bnkx bnkx) {
        super(obj, referenceQueue);
        this.f131783a = i;
        this.f131784b = bnkx;
    }

    /* renamed from: a */
    public final Object mo67949a() {
        return get();
    }

    /* renamed from: b */
    public final int mo67950b() {
        return this.f131783a;
    }

    /* renamed from: c */
    public final bnkx mo67951c() {
        return this.f131784b;
    }
}
