package p000;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: btvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f152595a;

    /* renamed from: b */
    final /* synthetic */ AndroidInertialAnchor f152596b;

    public btvd(AndroidInertialAnchor androidInertialAnchor, long j) {
        this.f152596b = androidInertialAnchor;
        this.f152595a = j;
    }

    public final void run() {
        synchronized (this.f152596b.f191729h) {
            for (btvl btvl : this.f152596b.f191729h) {
                btvl.mo62283a(this.f152595a);
            }
        }
    }
}
