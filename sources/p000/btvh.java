package p000;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: btvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ float f152603a;

    /* renamed from: b */
    final /* synthetic */ float f152604b;

    /* renamed from: c */
    final /* synthetic */ long f152605c;

    /* renamed from: d */
    final /* synthetic */ AndroidInertialAnchor f152606d;

    public btvh(AndroidInertialAnchor androidInertialAnchor, float f, float f2, long j) {
        this.f152606d = androidInertialAnchor;
        this.f152603a = f;
        this.f152604b = f2;
        this.f152605c = j;
    }

    public final void run() {
        synchronized (this.f152606d.f191729h) {
            for (btvl btvl : this.f152606d.f191729h) {
                btvl.mo62282a(this.f152603a, this.f152604b, this.f152605c);
            }
        }
    }
}
