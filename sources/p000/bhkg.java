package p000;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* renamed from: bhkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhkg implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TextView f118908a;

    public bhkg(TextView textView) {
        this.f118908a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f118908a.setScaleX(floatValue);
        this.f118908a.setScaleY(floatValue);
    }
}
