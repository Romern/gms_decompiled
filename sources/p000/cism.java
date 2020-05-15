package p000;

import org.chromium.net.CronetException;

/* renamed from: cism */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cism implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cisy f191332a;

    /* renamed from: b */
    final /* synthetic */ cisx f191333b;

    public cism(cisx cisx, cisy cisy) {
        this.f191333b = cisx;
        this.f191332a = cisy;
    }

    public final void run() {
        try {
            this.f191332a.mo86442a();
        } catch (Throwable th) {
            this.f191333b.mo86479a((CronetException) new cire("Exception received from UrlRequest.Callback", th));
        }
    }
}
