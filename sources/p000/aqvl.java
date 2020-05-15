package p000;

import android.animation.ValueAnimator;
import com.google.android.gms.smart_profile.header.view.HeaderView;

/* renamed from: aqvl */
public final /* synthetic */ class aqvl implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final HeaderView f86926a;

    public aqvl(HeaderView headerView) {
        this.f86926a = headerView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f86926a.mo59020b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
