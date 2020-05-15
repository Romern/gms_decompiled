package p000;

import com.google.android.gms.constellation.checker.SimStateChecker;

/* renamed from: syq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class syq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SimStateChecker f45459a;

    public syq(SimStateChecker simStateChecker) {
        this.f45459a = simStateChecker;
    }

    public final void run() {
        SimStateChecker simStateChecker = this.f45459a;
        SimStateChecker.f30501a.mo25414c("check", new Object[0]);
        sns sns = new sns(10);
        simStateChecker.f30504b.mo26401a(simStateChecker.f30505c, SimStateChecker.f30503f);
        sxt.m36563a();
        sxt.m36566a(simStateChecker.f30506d, simStateChecker.f30505c, 3, new syn(simStateChecker.f30504b, SimStateChecker.f30501a, simStateChecker.f30505c, bqjr.m112930a(SimStateChecker.f30503f), new snr(sns), false));
        synchronized (SimStateChecker.class) {
            SimStateChecker.f30502e = null;
        }
    }
}
