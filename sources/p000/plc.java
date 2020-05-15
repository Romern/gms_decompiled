package p000;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: plc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class plc implements pue {

    /* renamed from: a */
    final /* synthetic */ pld f39555a;

    public plc(pld pld) {
        this.f39555a = pld;
    }

    /* renamed from: a */
    public final void mo23351a(long j, int i, Object obj) {
        if (i != 0) {
            pld pld = this.f39555a;
            pjc pjc = pld.f39573r;
            AtomicLong atomicLong = pjc.f39271d;
            pjc.f39316e.mo23856a("listener.onApplicationStopFailed(%s)", pew.m30274a(i));
            pim pim = pld.f39573r.f39336y;
            if (pim != null) {
                pim.f39236e.mo23197e(i);
            }
        }
    }

    /* renamed from: i */
    public final void mo23352i() {
    }
}
