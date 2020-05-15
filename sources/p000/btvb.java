package p000;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: btvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AndroidInertialAnchor f152592a;

    public btvb(AndroidInertialAnchor androidInertialAnchor) {
        this.f152592a = androidInertialAnchor;
    }

    public final void run() {
        synchronized (this.f152592a) {
            AndroidInertialAnchor androidInertialAnchor = this.f152592a;
            if (androidInertialAnchor.f191720e) {
                androidInertialAnchor.f191728g.registerCallbacks(androidInertialAnchor.mo86647e(), this.f152592a);
                AndroidInertialAnchor androidInertialAnchor2 = this.f152592a;
                androidInertialAnchor2.f191728g.setCallbackThreadJniEnv(androidInertialAnchor2.mo86647e());
                AndroidInertialAnchor androidInertialAnchor3 = this.f152592a;
                androidInertialAnchor3.f191728g.startOnlineEstimator(androidInertialAnchor3.mo86647e());
            }
        }
    }
}
