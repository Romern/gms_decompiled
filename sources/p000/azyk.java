package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: azyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azyk extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ azyn f100199a;

    public azyk(azyn azyn) {
        this.f100199a = azyn;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f100199a.f100202a.mo60455j()) {
            this.f100199a.f100202a.mo60452g();
        }
        this.f100199a.f100202a.mo60446b(4);
    }

    public final void onAnimationStart(Animator animator) {
        this.f100199a.f100204c.setVisibility(0);
        this.f100199a.f100202a.mo60446b(3);
    }
}
