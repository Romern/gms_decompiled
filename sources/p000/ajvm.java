package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.gms.nearby.sharing.animation.DividerFadeTransition;

/* renamed from: ajvm */
public final /* synthetic */ class ajvm implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final Drawable f71368a;

    public ajvm(Drawable drawable) {
        this.f71368a = drawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable drawable = this.f71368a;
        int i = DividerFadeTransition.f81062a;
        drawable.invalidateSelf();
    }
}
