package p000;

import android.animation.ObjectAnimator;

/* renamed from: anqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anqb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ObjectAnimator f77429a;

    public anqb(ObjectAnimator objectAnimator) {
        this.f77429a = objectAnimator;
    }

    public final void run() {
        this.f77429a.start();
    }
}
