package p000;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: btvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f152600a;

    /* renamed from: b */
    final /* synthetic */ float f152601b;

    /* renamed from: c */
    final /* synthetic */ AndroidInertialAnchor f152602c;

    public btvg(AndroidInertialAnchor androidInertialAnchor, long j, float f) {
        this.f152602c = androidInertialAnchor;
        this.f152600a = j;
        this.f152601b = f;
    }

    public final void run() {
        synchronized (this.f152602c.f191729h) {
            for (btvl btvl : this.f152602c.f191729h) {
                btvl.mo62284a(this.f152600a, this.f152601b);
            }
        }
    }
}
