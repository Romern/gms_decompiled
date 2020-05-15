package p000;

import android.animation.Animator;
import com.google.android.gms.smart_profile.SmartProfileContainerView;

/* renamed from: aqrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqrf implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ int f86657a;

    /* renamed from: b */
    final /* synthetic */ SmartProfileContainerView f86658b;

    public aqrf(SmartProfileContainerView smartProfileContainerView, int i) {
        this.f86658b = smartProfileContainerView;
        this.f86657a = i;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f86658b.f107737i = (float) this.f86657a;
        if (!cgnz.m146325b()) {
            this.f86658b.f107735g.mo48071b();
        } else if (this.f86658b.getResources().getConfiguration().orientation == 2) {
            this.f86658b.f107735g.mo48071b();
        }
        this.f86658b.f107736h = true;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
