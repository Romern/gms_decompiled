package p000;

import android.net.wifi.RttManager;

/* renamed from: bgkp */
final /* synthetic */ class bgkp implements Runnable {

    /* renamed from: a */
    private final RttManager.RttListener f116713a;

    public bgkp(RttManager.RttListener rttListener) {
        this.f116713a = rttListener;
    }

    public final void run() {
        RttManager.RttListener rttListener = this.f116713a;
        int i = bgkr.f116716e;
        rttListener.onSuccess(new RttManager.RttResult[0]);
    }
}
