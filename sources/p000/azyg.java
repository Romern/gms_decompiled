package p000;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.libraries.material.internal.ClippableRoundedCornerLayout;

/* renamed from: azyg */
public final /* synthetic */ class azyg implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final azyn f100193a;

    /* renamed from: b */
    private final float f100194b;

    /* renamed from: c */
    private final Rect f100195c;

    public azyg(azyn azyn, float f, Rect rect) {
        this.f100193a = azyn;
        this.f100194b = f;
        this.f100195c = rect;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        azyn azyn = this.f100193a;
        float f = this.f100194b;
        Rect rect = this.f100195c;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = azyn.f100204c;
        float f2 = f * (1.0f - animatedFraction);
        RectF rectF = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        if (clippableRoundedCornerLayout.f111259a == null) {
            clippableRoundedCornerLayout.f111259a = new Path();
        }
        clippableRoundedCornerLayout.f111259a.reset();
        clippableRoundedCornerLayout.f111259a.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        clippableRoundedCornerLayout.f111259a.close();
        clippableRoundedCornerLayout.invalidate();
    }
}
