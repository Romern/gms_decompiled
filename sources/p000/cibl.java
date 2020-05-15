package p000;

/* renamed from: cibl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cibl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cibp f189733a;

    public cibl(cibp cibp) {
        this.f189733a = cibp;
    }

    public final void run() {
        boolean z;
        synchronized (this.f189733a) {
            cibp cibp = this.f189733a;
            if (cibp.f189745i != 6) {
                cibp.f189745i = 6;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f189733a.f189746j.f189736a.mo85748b(chuv.f189229p.mo85687a("Keepalive failed. The connection is likely gone"));
        }
    }
}
