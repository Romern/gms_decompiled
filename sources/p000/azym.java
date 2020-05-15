package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: azym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azym extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ azyn f100201a;

    public azym(azyn azyn) {
        this.f100201a = azyn;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f100201a.mo55408a(0.0f);
    }

    public final void onAnimationStart(Animator animator) {
        this.f100201a.mo55408a(1.0f);
    }
}
