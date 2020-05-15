package p000;

import android.util.Log;

/* renamed from: axzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axzo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ axzq f96843a;

    public axzo(axzq axzq) {
        this.f96843a = axzq;
    }

    public final void run() {
        try {
            axzq axzq = this.f96843a;
            axzq.mo53799a();
            if (Log.isLoggable("pairingservice", 2)) {
                Log.v("pairingservice", "processEnrolledDataItem");
            }
            axos a = axxj.m83471a(axzq.f96848b, axzq.f96849c.mo53808b().f96814a, "/enrolled");
            if (a != null) {
                axzq.mo53802a(a);
            }
        } catch (Exception e) {
            Log.e("pairingservice", "start crashed", e);
        }
    }
}
