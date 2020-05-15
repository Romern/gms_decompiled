package p000;

import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

/* renamed from: ahex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahex implements Runnable {

    /* renamed from: a */
    final /* synthetic */ StopScanRequest f67085a;

    /* renamed from: b */
    final /* synthetic */ ahfe f67086b;

    public ahex(ahfe ahfe, StopScanRequest stopScanRequest) {
        this.f67086b = ahfe;
        this.f67085a = stopScanRequest;
    }

    public final void run() {
        ahct b = this.f67086b.mo36391b();
        if (b != null) {
            ahdp ahdp = this.f67085a.f80438b;
            if (!b.mo36318a()) {
                b.mo36316a(ahdp, -1);
                return;
            }
            b.f67011c.mo36286a();
            b.f67018j.mo72972a(5, b.f67011c);
            b.mo36319b(ahdp);
        }
    }
}
