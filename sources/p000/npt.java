package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: npt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class npt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ npx f36351a;

    public npt(npx npx) {
        this.f36351a = npx;
    }

    public final void run() {
        try {
            npx npx = this.f36351a;
            npx.f36360d.mo21178a(10, 3, npx);
            int[] iArr = npx.f36357b;
            for (int i : iArr) {
                npx npx2 = this.f36351a;
                npx2.f36360d.mo21178a(i, 3, npx2);
            }
            if (this.f36351a.mo21440a()) {
                this.f36351a.f36359c.mo21751a(false);
            }
        } catch (IllegalStateException e) {
            bnsi d = npx.f36356a.mo68390d();
            d.mo68432a("npt", "run", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("car already disconnected");
        }
    }
}
