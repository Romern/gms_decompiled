package p000;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: zrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zrq extends zro {
    static {
        zvt.m46581a();
    }

    public zrq(ztt ztt) {
        super(ztt);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo31411a(Object obj, long j) {
        ygw ygw = (ygw) obj;
        if (ygw == null) {
            mo31414c();
            return;
        }
        long j2 = ygw.f53783c.get();
        while (true) {
            AtomicLong atomicLong = ygw.f53783c;
            if (atomicLong.compareAndSet(j2, Math.min(atomicLong.get(), j))) {
                break;
            }
            j2 = ygw.f53783c.get();
        }
        long j3 = ygw.f53784d.get();
        while (true) {
            AtomicLong atomicLong2 = ygw.f53784d;
            if (!atomicLong2.compareAndSet(j3, Math.max(atomicLong2.get(), j))) {
                j3 = ygw.f53784d.get();
            } else {
                return;
            }
        }
    }
}
