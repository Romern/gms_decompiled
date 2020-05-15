package p000;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhpk implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f119265a;

    public bhpk(TextInputLayout textInputLayout) {
        this.f119265a = textInputLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f119265a.f151344r.mo63856b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
