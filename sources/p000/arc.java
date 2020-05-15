package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: arc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arc extends ImageView {

    /* renamed from: a */
    public Animation.AnimationListener f2050a;

    /* renamed from: b */
    private int f2051b;

    public arc(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(arb.f2049a);
        this.f2051b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        int i = Build.VERSION.SDK_INT;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        C1280ps.m19918f(this, f * 4.0f);
        shapeDrawable.getPaint().setColor(this.f2051b);
        C1280ps.m19890a(this, shapeDrawable);
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f2050a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f2050a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = Build.VERSION.SDK_INT;
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f2051b = i;
        }
    }
}
