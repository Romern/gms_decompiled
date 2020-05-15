package p000;

import android.view.View;
import android.view.animation.Animation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: axlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axlj implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f96141a;

    /* renamed from: b */
    final /* synthetic */ View f96142b;

    public axlj(View view, View view2) {
        this.f96141a = view;
        this.f96142b = view2;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f96141a.setVisibility(8);
        this.f96142b.sendAccessibilityEvent(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
