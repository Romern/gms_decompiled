package p000;

import android.animation.ValueAnimator;
import com.google.android.gms.smart_profile.SmartProfileContainerView;

/* renamed from: aqrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqrg implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ SmartProfileContainerView f86659a;

    public aqrg(SmartProfileContainerView smartProfileContainerView) {
        this.f86659a = smartProfileContainerView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f86659a.mo58995b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
