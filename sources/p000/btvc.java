package p000;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: btvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f152593a;

    /* renamed from: b */
    final /* synthetic */ AndroidInertialAnchor f152594b;

    public btvc(AndroidInertialAnchor androidInertialAnchor, long j) {
        this.f152594b = androidInertialAnchor;
        this.f152593a = j;
    }

    public final void run() {
        synchronized (this.f152594b) {
            this.f152594b.f191728g.stopOnlineEstimator(this.f152593a);
            AndroidInertialAnchor androidInertialAnchor = this.f152594b;
            androidInertialAnchor.f191720e = false;
            androidInertialAnchor.f191721f = null;
        }
    }
}
