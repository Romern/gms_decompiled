package p000;

import android.util.Log;

/* renamed from: ebp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ebp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ebr f14612a;

    public ebp(ebr ebr) {
        this.f14612a = ebr;
    }

    public final void run() {
        try {
            ebr ebr = this.f14612a;
            ebr.f14614a.addGpsStatusListener(ebr);
        } catch (SecurityException e) {
            Log.wtf("IndoorOutdoorPredictor", "Failed: ", e);
        }
    }
}
