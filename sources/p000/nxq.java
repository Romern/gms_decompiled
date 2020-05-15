package p000;

import android.os.Handler;

/* renamed from: nxq */
final /* synthetic */ class nxq implements Runnable {

    /* renamed from: a */
    private final nxr f36890a;

    /* renamed from: b */
    private final boolean f36891b;

    public nxq(nxr nxr, boolean z) {
        this.f36890a = nxr;
        this.f36891b = z;
    }

    public final void run() {
        nxp nxp;
        Handler handler;
        nxr nxr = this.f36890a;
        boolean z = this.f36891b;
        int a = nxr.mo21806a();
        int andSet = nxr.f36897f.getAndSet(a);
        bnsi d = nxr.f36892a.mo68390d();
        d.mo68432a("nxr", "a", 231, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("maybeNotifyFocusStackChange: currentFocusGrant %d, oldFocusGrant %d, forceNotify: %b", Integer.valueOf(a), Integer.valueOf(andSet), Boolean.valueOf(z));
        if ((z || a != andSet) && (handler = (nxp = nxr.f36898g.f36878a).f36883b) != null) {
            handler.post(new nxo(nxp));
        }
    }
}
