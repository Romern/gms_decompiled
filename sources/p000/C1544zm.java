package p000;

import android.animation.ValueAnimator;

/* renamed from: zm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1544zm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1548zq f27755a;

    public C1544zm(C1548zq zqVar) {
        this.f27755a = zqVar;
    }

    public final void run() {
        C1548zq zqVar = this.f27755a;
        int i = zqVar.f27783q;
        if (i == 1) {
            zqVar.f27782p.cancel();
        } else if (i != 2) {
            return;
        }
        zqVar.f27783q = 3;
        ValueAnimator valueAnimator = zqVar.f27782p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        zqVar.f27782p.setDuration(500L);
        zqVar.f27782p.start();
    }
}
