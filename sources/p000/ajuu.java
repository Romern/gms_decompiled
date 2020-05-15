package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* renamed from: ajuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajuu implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ Drawable f71322a;

    /* renamed from: b */
    final /* synthetic */ ajuv f71323b;

    /* renamed from: c */
    private float f71324c = -1.0f;

    public ajuu(ajuv ajuv, Drawable drawable) {
        this.f71323b = ajuv;
        this.f71322a = drawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction < this.f71324c) {
            this.f71323b.mo38944a(this.f71322a);
        } else {
            this.f71324c = animatedFraction;
        }
    }
}
