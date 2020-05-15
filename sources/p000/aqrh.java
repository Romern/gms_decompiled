package p000;

import android.animation.Animator;
import com.google.android.gms.smart_profile.SmartProfileContainerView;

/* renamed from: aqrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqrh implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ SmartProfileContainerView f86660a;

    public aqrh(SmartProfileContainerView smartProfileContainerView) {
        this.f86660a = smartProfileContainerView;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f86660a.f107730b.finish();
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
