package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: aayx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aayx extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ aayy f56853a;

    public aayx(aayy aayy) {
        this.f56853a = aayy;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f56853a.f56855b.setVisibility(8);
        this.f56853a.f56855b.setAlpha(1.0f);
    }
}
