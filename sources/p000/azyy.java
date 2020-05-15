package p000;

import android.animation.Animator;

/* renamed from: azyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azyy extends azwq {

    /* renamed from: a */
    final /* synthetic */ azyz f100243a;

    public azyy(azyz azyz) {
        this.f100243a = azyz;
    }

    public final void onAnimationEnd(Animator animator) {
        if (mo55336a(animator)) {
            this.f100243a.f100257i = null;
            return;
        }
        azyz azyz = this.f100243a;
        int i = azyz.f100244j;
        azyy.super.setVisible(azyz.f100256h, false);
        Runnable runnable = this.f100243a.f100257i;
        if (runnable != null) {
            runnable.run();
            this.f100243a.f100257i = null;
        }
        this.f100243a.mo55433c();
    }
}
