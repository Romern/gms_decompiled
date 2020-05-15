package p000;

import android.view.View;
import android.view.animation.Animation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: axll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axll implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f96145a;

    /* renamed from: b */
    final /* synthetic */ View f96146b;

    public axll(View view, View view2) {
        this.f96145a = view;
        this.f96146b = view2;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f96145a.setVisibility(8);
        this.f96146b.sendAccessibilityEvent(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
