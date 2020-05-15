package p000;

import android.animation.ValueAnimator;

/* renamed from: ajww */
final /* synthetic */ class ajww implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final ajwx f71478a;

    public ajww(ajwx ajwx) {
        this.f71478a = ajwx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ajwx ajwx = this.f71478a;
        float min = Math.min(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        ajwy ajwy = ajwx.f71482d;
        ajwx.f71479a = (int) (((float) (Math.min(ajwy.getBounds().width(), ajwy.getBounds().height()) / 2)) * min);
        float f = 1.0f - min;
        ajwx.f71480b.setAlpha((int) (255.0f * f));
        ajwx.f71480b.setStrokeWidth(ajwx.f71481c * f);
        ajwx.f71482d.invalidateSelf();
    }
}
