package p000;

import android.animation.Animator;

/* renamed from: azza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azza extends azwq {

    /* renamed from: a */
    final /* synthetic */ azzc f100273a;

    public azza(azzc azzc) {
        this.f100273a = azzc;
    }

    public final void onAnimationEnd(Animator animator) {
        if (mo55336a(animator)) {
            this.f100273a.f100278d = null;
            return;
        }
        azzc azzc = this.f100273a;
        azza.super.setVisible(azzc.f100276b, false);
        this.f100273a.mo55456b();
        Runnable runnable = this.f100273a.f100278d;
        if (runnable != null) {
            runnable.run();
            this.f100273a.f100278d = null;
        }
    }
}
