package p000;

import android.animation.ValueAnimator;
import com.google.android.gms.smart_profile.SmartProfileContainerView;

/* renamed from: aqri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqri implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ SmartProfileContainerView f86661a;

    public aqri(SmartProfileContainerView smartProfileContainerView) {
        this.f86661a = smartProfileContainerView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f86661a.mo59001e();
    }
}
