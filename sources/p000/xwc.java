package p000;

import android.graphics.drawable.AnimatedVectorDrawable;

/* renamed from: xwc */
final /* synthetic */ class xwc implements Runnable {

    /* renamed from: a */
    private final AnimatedVectorDrawable f53267a;

    public xwc(AnimatedVectorDrawable animatedVectorDrawable) {
        this.f53267a = animatedVectorDrawable;
    }

    public final void run() {
        this.f53267a.start();
    }
}
