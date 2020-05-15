package p000;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: btve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btve implements Runnable {

    /* renamed from: a */
    final /* synthetic */ float f152597a;

    /* renamed from: b */
    final /* synthetic */ AndroidInertialAnchor f152598b;

    public btve(AndroidInertialAnchor androidInertialAnchor, float f) {
        this.f152598b = androidInertialAnchor;
        this.f152597a = f;
    }

    public final void run() {
        synchronized (this.f152598b.f191729h) {
            for (btvl btvl : this.f152598b.f191729h) {
                btvl.mo62281a(this.f152597a);
            }
        }
    }
}
