package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: azyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azyj extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ azyn f100198a;

    public azyj(azyn azyn) {
        this.f100198a = azyn;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f100198a.f100204c.setVisibility(8);
        if (!this.f100198a.f100202a.mo60455j()) {
            this.f100198a.f100202a.mo60453h();
        }
        this.f100198a.f100202a.mo60446b(2);
    }

    public final void onAnimationStart(Animator animator) {
        this.f100198a.f100202a.mo60446b(1);
    }
}
