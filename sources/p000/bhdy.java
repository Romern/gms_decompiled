package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* renamed from: bhdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhdy extends LinearLayout.LayoutParams {

    /* renamed from: a */
    public int f118355a = 1;

    /* renamed from: b */
    public Interpolator f118356b;

    public bhdy() {
        super(-1, -2);
    }

    public bhdy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bheh.f118377b);
        this.f118355a = obtainStyledAttributes.getInt(0, 0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.f118356b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public bhdy(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public bhdy(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public bhdy(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
