package p000;

import android.animation.Animator;

/* renamed from: azyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azyu extends azwq {

    /* renamed from: a */
    final /* synthetic */ azyv f100222a;

    public azyu(azyv azyv) {
        this.f100222a = azyv;
    }

    public final void onAnimationEnd(Animator animator) {
        if (mo55336a(animator)) {
            this.f100222a.f100227c = null;
            return;
        }
        azyv azyv = this.f100222a;
        int i = azyv.f100223d;
        azyu.super.setVisible(azyv.f100225a, false);
        Runnable runnable = this.f100222a.f100227c;
        if (runnable != null) {
            runnable.run();
            this.f100222a.f100227c = null;
        }
        this.f100222a.mo55416b();
    }
}
