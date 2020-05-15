package p000;

import android.animation.Animator;

/* renamed from: azzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azzf extends azwq {

    /* renamed from: a */
    final /* synthetic */ azzg f100294a;

    public azzf(azzg azzg) {
        this.f100294a = azzg;
    }

    public final void onAnimationEnd(Animator animator) {
        if (mo55336a(animator)) {
            this.f100294a.f100299e = null;
            return;
        }
        azzg azzg = this.f100294a;
        azzf.super.setVisible(azzg.f100297c, false);
        this.f100294a.f100296b.cancel();
        this.f100294a.mo55469b();
        Runnable runnable = this.f100294a.f100299e;
        if (runnable != null) {
            runnable.run();
            this.f100294a.f100299e = null;
        }
    }
}
