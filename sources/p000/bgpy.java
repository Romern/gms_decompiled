package p000;

import android.os.SystemClock;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bgpy */
final /* synthetic */ class bgpy implements bgqb {

    /* renamed from: a */
    private final bgqc f117253a;

    /* renamed from: b */
    private final ClientContext f117254b;

    /* renamed from: c */
    private final long f117255c;

    public bgpy(bgqc bgqc, ClientContext clientContext, long j) {
        this.f117253a = bgqc;
        this.f117254b = clientContext;
        this.f117255c = j;
    }

    /* renamed from: a */
    public final void mo63091a() {
        bgqc bgqc = this.f117253a;
        ClientContext clientContext = this.f117254b;
        long j = this.f117255c;
        SystemClock.elapsedRealtime();
        aepr aepr = bgqc.f117264h;
        bxvd da = buon.f154553e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((buon) da.f164949b).f154555a = j;
        bxtx bxtx = (bxtx) bgqc.f117266k.get();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxtx.getClass();
        ((buon) da.f164949b).f154556b = bxtx;
        buoo a = aepr.mo34440a(clientContext, (buon) da.mo74062i());
        AtomicReference atomicReference = bgqc.f117265j;
        long j2 = a.f154561a;
        SystemClock.elapsedRealtime();
        atomicReference.set(new bgpu(j2));
        bgqc.f117266k.set(a.f154562b);
    }
}
