package p000;

import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;

/* renamed from: ahfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahfd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DisconnectRequest f67097a;

    /* renamed from: b */
    final /* synthetic */ ahfe f67098b;

    public ahfd(ahfe ahfe, DisconnectRequest disconnectRequest) {
        this.f67098b = ahfe;
        this.f67097a = disconnectRequest;
    }

    public final void run() {
        ahct b = this.f67098b.mo36391b();
        if (b != null) {
            ahdp ahdp = this.f67097a.f80420c;
            ahcy d = b.mo36322d();
            if (d == null) {
                b.mo36316a(ahdp, 2982);
                return;
            }
            b.f67018j.mo72973a(11, d);
            d.mo36337m();
            if (b.mo36321c()) {
                b.f67012d.mo36335k();
                b.f67012d = null;
            }
            b.mo36319b(ahdp);
        }
    }
}
