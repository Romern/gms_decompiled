package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* renamed from: bheo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bheo extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ HideBottomViewOnScrollBehavior f118405a;

    public bheo(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f118405a = hideBottomViewOnScrollBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f118405a.f151053a = null;
    }
}
