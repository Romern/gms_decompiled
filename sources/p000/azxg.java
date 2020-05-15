package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: azxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azxg implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final View f100168a;

    /* renamed from: b */
    private final View f100169b;

    /* renamed from: c */
    private final float[] f100170c = new float[2];

    public azxg(View view, View view2) {
        this.f100168a = view;
        this.f100169b = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        azxh.m86326a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f100170c);
        View view = this.f100168a;
        if (view != null) {
            view.setAlpha(this.f100170c[0]);
        }
        View view2 = this.f100169b;
        if (view2 != null) {
            view2.setAlpha(this.f100170c[1]);
        }
    }
}
