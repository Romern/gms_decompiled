package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: anqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anqd extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ anqe f77431a;

    protected anqd(anqe anqe) {
        this.f77431a = anqe;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f77431a.f77440m = true;
    }
}
