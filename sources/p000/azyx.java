package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: azyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azyx extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ azyz f100242a;

    public azyx(azyz azyz) {
        this.f100242a = azyz;
    }

    public final void onAnimationStart(Animator animator) {
        azyz azyz = this.f100242a;
        int i = azyz.f100244j;
        if (!azyz.f100249a.isStarted()) {
            this.f100242a.f100249a.start();
        }
    }
}
