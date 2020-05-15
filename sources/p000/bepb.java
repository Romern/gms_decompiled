package p000;

import android.os.StrictMode;

/* renamed from: bepb */
final /* synthetic */ class bepb implements Runnable {

    /* renamed from: a */
    private final StrictMode.ThreadPolicy f111970a;

    public bepb(StrictMode.ThreadPolicy threadPolicy) {
        this.f111970a = threadPolicy;
    }

    public final void run() {
        StrictMode.setThreadPolicy(this.f111970a);
    }
}
